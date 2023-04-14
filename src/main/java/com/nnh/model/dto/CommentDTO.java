package com.nnh.model.dto;

import com.nnh.model.entity.UserEntity;

public class CommentDTO extends AbstractDTO<CommentDTO>{
	private String content;
	private String username;
	private Long departmentId;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	
	
	
	
}
