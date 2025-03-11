package com.tcs.enty;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USER_DATA")
public class Enty implements Serializable {

	@Id
	@SequenceGenerator(name = "CUST_SEQ", sequenceName = "CUST_SEQ" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
	private int custId;
	private LocalDate dateOfJoining;
	private LocalTime timeOfJoining;
	@Lob
	private byte[] profielPicture;
	@Lob
	private char[] resume;
	@Column(name = "Resume_Path")
	private String resumePath;
}
