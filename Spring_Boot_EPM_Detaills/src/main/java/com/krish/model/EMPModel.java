package com.krish.model;

import java.util.Date;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "EMP")
public class EMPModel {

	@Id
	@Column(name = "EMPNO")
	@SequenceGenerator(name = "eno" ,sequenceName = "EMPNO",allocationSize = 1)
	@GeneratedValue(generator = "eno", strategy = GenerationType.SEQUENCE)
	private int emoNum;
	@NonNull
	@Column(name = "ENAME")
	private String eName;
	@NonNull
	@Column(name = "SAL")
	private int sal;
	@NonNull
	@Column(name = "DESIGNATION")
	private String designation;
	private Date dob = new Date();
}
