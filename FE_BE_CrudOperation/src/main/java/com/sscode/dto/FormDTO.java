package com.sscode.dto;

import com.fasterxml.jackson.annotation.JsonClassDescription;

@JsonClassDescription
public class FormDTO {
	private Long id;
	
	private String name;
	
	private String job;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FormDTO() {}

	public FormDTO(Long id, String name, String job) {
		this.id = id;
		this.name = name;
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	
	
}
