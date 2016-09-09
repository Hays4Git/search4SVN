package com.shark.search4SVN.pojo;

import java.util.Date;

public class SVNDocument {
	private String docName; //文件名称，唯一属性，下次更新索引的话，以名字为标准更新
	private String svnUrl; //SVN_URL 全路径，便于搜索
	private String content; //文档内容
	private Date lastModifyTime; //上一次更新时间
	private String lastModifyAuthor; //最后修改的作者
	private String revision;// SVN的 revision
	
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public String getSvnUrl() {
		return svnUrl;
	}
	public void setSvnUrl(String svnUrl) {
		this.svnUrl = svnUrl;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getLastModifyTime() {
		return lastModifyTime;
	}
	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}
	public String getLastModifyAuthor() {
		return lastModifyAuthor;
	}
	public void setLastModifyAuthor(String lastModifyAuthor) {
		this.lastModifyAuthor = lastModifyAuthor;
	}
	public String getRevision() {
		return revision;
	}
	public void setRevision(String revision) {
		this.revision = revision;
	}
}
