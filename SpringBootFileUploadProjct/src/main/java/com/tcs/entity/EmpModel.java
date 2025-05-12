package com.tcs.entity;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class EmpModel {

	private String name;
	private MultipartFile resume;
	private MultipartFile img;
}
