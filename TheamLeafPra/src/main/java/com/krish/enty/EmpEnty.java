package com.krish.enty;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EMP")
public class EmpEnty {

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
	@Column(name="STATUS")
	private String status = "Available";
	@Column(name="COUNTRY")
	private String country="India";
	@Column(name="STATE")
	private String state;
	private Date dob = new Date();
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private Date doj;
	@Column(name = "PREVIOUS_EMPLOYEE")
	private Boolean previousemployye=false;
	
}
