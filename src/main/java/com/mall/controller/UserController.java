package com.mall.controller;

import cn.dev33.satoken.secure.SaSecureUtil;
import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.util.IdUtil;
import com.alibaba.fastjson2.JSON;
import com.mall.entity.query.LoginQuery;
import com.mall.entity.query.RegisterQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.DurationEnum;
import com.mall.enums.ResultCodeEnum;
import com.mall.service.impl.UserServiceImpl;
import com.mall.entity.po.User;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.UserQuery;
import com.mall.utils.FileService;
import com.mall.utils.ValidatorUtils;
import com.mall.utils.WOWNicknameGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *  @Description: 用户表UserController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserServiceImpl userServiceImpl;
	@Autowired
	private FileService fileService;

	// 文本
	private static final String key = "wowMall";
	/**
	 * 登录
	 */
	@PostMapping("/login")
	public ResultVo<?> login(@RequestBody LoginQuery loginQuery) {
		User user = userServiceImpl.selectByUserMobile(loginQuery.getUserMobile());

		if (user == null) {
			return ResultVo.fail(ResultCodeEnum.CODE_1002.getCode(), ResultCodeEnum.CODE_1002.getMessage());
		}
		if (user.getLoginPassword().equals(SaSecureUtil.aesEncrypt(key, loginQuery.getLoginPassword()))) {
			// 设置时长
			StpUtil.login(user.getUserId(), DurationEnum.DAYS_30.getSeconds());
			SaTokenInfo tokenInfo = StpUtil.getTokenInfo();
			return ResultVo.success(ResultCodeEnum.CODE_200.getCode() ,tokenInfo, ResultCodeEnum.CODE_200.getMessage());
		} else {
			return ResultVo.fail(ResultCodeEnum.CODE_1000.getCode(), ResultCodeEnum.CODE_1000.getMessage());
		}
	}

	@PostMapping("/renewTimeout")
	public ResultVo<?> renewTimeout(@RequestBody String token) {
		Object loginId = StpUtil.getLoginId();
		if (loginId == null) {
			return ResultVo.fail(ResultCodeEnum.CODE_1025.getCode(), ResultCodeEnum.CODE_1025.getMessage());
		}
		StpUtil.login(loginId, DurationEnum.DAYS_30.getSeconds());

		SaTokenInfo tokenInfo = StpUtil.getTokenInfo();
		return ResultVo.success(ResultCodeEnum.CODE_200.getCode(), tokenInfo, ResultCodeEnum.CODE_200.getMessage());
	}

	/**
	 * 注册
	 * @return
	 */
	@PostMapping("/register")
	public ResultVo<?> register(@RequestBody RegisterQuery register) {

		if (!ValidatorUtils.isMobileValid(register.getUserMobile())) {
			return ResultVo.fail("手机号格式错误");
		}
		if (!ValidatorUtils.isChineseNameValid(register.getRealName())) {
			return ResultVo.fail("真实姓名格式错误");
		}
		if (Objects.equals(register.getNickName(), "")|| register.getNickName() == null) {
			register.setNickName(WOWNicknameGenerator.generateWOWNickname());
		}
		if (!ValidatorUtils.isPasswordStrongValid(register.getLoginPassword())) {
			return ResultVo.fail(ResultCodeEnum.CODE_1028.getCode(),ResultCodeEnum.CODE_1028.getMessage());
		}
		if (userServiceImpl.selectByUserMobile(register.getUserMobile()) != null) {
			return ResultVo.fail(ResultCodeEnum.CODE_1001.getCode(), ResultCodeEnum.CODE_1001.getMessage());
		}
		User user = new User();
		user.setUserId(IdUtil.simpleUUID());
		user.setNickName(register.getNickName());
		user.setUserMobile(register.getUserMobile());
		user.setRealName(register.getRealName());
		user.setLoginPassword(SaSecureUtil.aesEncrypt(key, register.getLoginPassword()));
		user.setModifyTime(Date.from(Instant.now()));
		user.setUserRegtime(Date.from(Instant.now()));
		Integer insert = userServiceImpl.insert(user);

		if (insert == 1) {
			return ResultVo.success(ResultCodeEnum.CODE_200, ResultCodeEnum.CODE_200.getMessage());
		} else {
			return ResultVo.fail("注册失败");
		}
	}

	/**
	 * 上传头像
	 */
	@PostMapping("/uploadAvatar")
	public ResultVo<?> uploadAvatar(@RequestParam("file") MultipartFile file) {
		return 	fileService.fileUpload(file, "/user/avatar", "img");
	}

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody UserQuery  userQuery){
		List<User> tz_user = userServiceImpl.selectListByCondition(userQuery);
		return getSuccessResultVo(tz_user);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody UserQuery userQuery) {
		Long l = userServiceImpl.selectCount(userQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody UserQuery userQuery) {
		PaginationResultVo<User> paginationResultVo = userServiceImpl.selectList(userQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody User userQuery) {
		Integer insert = userServiceImpl.insert(userQuery);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增失败");
		}
	}

	/**
	 * 批量新增
	 */
	@PostMapping("/insertBatch")
	public ResultVo<?> insertBatch(@RequestBody List<User> userList) {
		Integer insert = userServiceImpl.insertBatch(userList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增失败");
		}
	}

	/**
	 * 批量新增或修改
	 */
	@PostMapping("/insertOrUpdateBatch")
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<User> userList) {
		Integer insert = userServiceImpl.insertOrUpdateBatch(userList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据UserId查询
	 */
	@PostMapping("/selectByUserId")
	public ResultVo<?> selectByUserId(@RequestBody String userId) {
		User  userQuery = userServiceImpl.selectByUserId(userId);
		log.info("userQuery:{}", JSON.toJSONString(userQuery));
		return getSuccessResultVo(userQuery);
	}

	/**
	 * 根据UserId更新
	 */
	@PostMapping("/updateByUserId")
	public ResultVo<?> updateByUserId(User user, String userId) {
		Integer update = userServiceImpl.updateByUserId(user, userId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据UserId删除
	 */
	@PostMapping("/deleteByUserId")
	public ResultVo<?> deleteByUserId(@RequestBody String userId) {
		User user = userServiceImpl.selectByUserId(userId);
		if (user != null) {
			user.setStatus(0);
			Integer i = userServiceImpl.updateByUserId(user, userId);
			if (i > 0) {
				return ResultVo.success(ResultCodeEnum.CODE_200.getCode(), "删除成功!");
			} else {
				return ResultVo.fail("删除失败");
			}
		} else {
			return ResultVo.fail(ResultCodeEnum.CODE_200.getCode(),"用户不存在");
		}
	}

	/**
	 * 根据UserMail查询
	 */
	@PostMapping("/selectByUserMail")
	public ResultVo<?> selectByUserMail(@RequestBody String userMail) {
		User  userQuery = userServiceImpl.selectByUserMail(userMail);
		return getSuccessResultVo(userQuery);
	}

	/**
	 * 根据UserMail更新
	 */
	@PostMapping("/updateByUserMail")
	public ResultVo<?> updateByUserMail(User user, String userMail) {
		Integer update = userServiceImpl.updateByUserMail(user, userMail);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据UserMail删除
	 */
	@PostMapping("/deleteByUserMail")
	public ResultVo<?> deleteByUserMail(String userMail) {
		Integer delete = userServiceImpl.deleteByUserMail(userMail);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}

	/**
	 * 根据UserMobile查询
	 */
	@PostMapping("/selectByUserMobile")
	public ResultVo<?> selectByUserMobile(@RequestBody String userMobile) {
		log.info("======userMobile:{}, ===> {}", JSON.toJSONString(userMobile), userMobile);
		User  userQuery = userServiceImpl.selectByUserMobile(userMobile);
		return getSuccessResultVo(userQuery);
	}

	/**
	 * 根据UserMobile更新
	 */
	@PostMapping("/updateByUserMobile")
	public ResultVo<?> updateByUserMobile(User user, String userMobile) {
		Integer update = userServiceImpl.updateByUserMobile(user, userMobile);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据UserMobile删除
	 */
	@PostMapping("/deleteByUserMobile")
	public ResultVo<?> deleteByUserMobile(String userMobile) {
		Integer delete = userServiceImpl.deleteByUserMobile(userMobile);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}