package com.mall.entity.query;


import java.util.Date;


/**
 *  @Description: 查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class AttachFileQuery extends BaseQuery {

	/**
	 * 
	 */
	private Long fileId;

	/**
	 * 文件路径
	 */
	private String filePath;
	private String filePathFuzzy;

	/**
	 * 文件类型
	 */
	private String fileType;
	private String fileTypeFuzzy;

	/**
	 * 文件大小
	 */
	private Integer fileSize;

	/**
	 * 上传时间
	 */
	private Date uploadTime;
	private String uploadTimeStart;
	private String uploadTimeEnd;

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
	public String getFilePathFuzzy() {
		return filePathFuzzy;
	}
	public void setFilePathFuzzy(String filePathFuzzy) {
		this.filePathFuzzy = filePathFuzzy;
	}
	public String getFileTypeFuzzy() {
		return fileTypeFuzzy;
	}
	public void setFileTypeFuzzy(String fileTypeFuzzy) {
		this.fileTypeFuzzy = fileTypeFuzzy;
	}
	public String getUploadTimeStart() {
		return uploadTimeStart;
	}
	public void setUploadTimeStart(String uploadTimeStart) {
		this.uploadTimeStart = uploadTimeStart;
	}
	public String getUploadTimeEnd() {
		return uploadTimeEnd;
	}
	public void setUploadTimeEnd(String uploadTimeEnd) {
		this.uploadTimeEnd = uploadTimeEnd;
	}
}