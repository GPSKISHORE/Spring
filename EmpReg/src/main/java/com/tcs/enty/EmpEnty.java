package com.tcs.enty;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EMP")
@SQLDelete(sql="UPDATE EMP SET STATUS = 'NotAVAILABLE' WHERE EMPNO=?")
@Where(clause = " STATUS <> 'NotAVAILABLE'")
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
}
