package com.tcs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Job_Applicants_Data")
public class Enty {

	@Id
	@GeneratedValue
	@Column(name = "EMP_ID")
	private Integer id;
	@Column(name = "EMP_Name", length=20)
	private String name;
	@Column(name = "Resume_Path")
	private String resume;
	@Column(name = "Profile_Pic_Path")
	private String img;
}
