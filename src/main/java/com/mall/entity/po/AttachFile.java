package com.mall.entity.po;

import java.io.Serializable;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.mall.enums.DataTimePatternEnum;
import com.mall.utils.DateUtils;


/**
 *  @Description: 
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class AttachFile implements Serializable {

	/**
	 * 
	 */
	private Long fileId;

	/**
	 * 文件路径
	 */
	private String filePath;

	/**
	 * 文件类型
	 */
	private String fileType;

	/**
	 * 文件大小
	 */
	private Integer fileSize;

	/**
	 * 上传时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date uploadTime;

	/**
	 * 文件关联的表主键id
	 */
	private Long fileJoinId;

	/**
	 * 文件关联表类型：1 商品表  FileJoinType
	 */
	private Integer fileJoinType;

	public Long getFileId() {
		return fileId;
	}
	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public Integer getFileSize() {
		return fileSize;
	}
	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}
	public Date getUploadTime() {
		return uploadTime;
	}
	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}
	public Long getFileJoinId() {
		return fileJoinId;
	}
	public void setFileJoinId(Long fileJoinId) {
		this.fileJoinId = fileJoinId;
	}
	public Integer getFileJoinType() {
		return fileJoinType;
	}
	public void setFileJoinType(Integer fileJoinType) {
		this.fileJoinType = fileJoinType;
	}
	@Override
	public String toString() {
		return "Tz_attach_file: {"
				+ " \"fileId\": \"" + (fileId == null ? "空" : fileId) + "\", "
				+ " \"文件路径\": \"" + (filePath == null ? "空" : filePath) + "\", "
				+ " \"文件类型\": \"" + (fileType == null ? "空" : fileType) + "\", "
				+ " \"文件大小\": \"" + (fileSize == null ? "空" : fileSize) + "\", "
				+ " \"上传时间\": \"" + (uploadTime == null ? "空" : DateUtils.format(uploadTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"文件关联的表主键id\": \"" + (fileJoinId == null ? "空" : fileJoinId) + "\", "
				+ " \"文件关联表类型：1 商品表  FileJoinType\": \"" + (fileJoinType == null ? "空" : fileJoinType) + "\" "
				+ "}";

	}
}