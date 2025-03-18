package com.revision.enty;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "Contact_Info")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SecondTable {

	@Id
	@Column(name = "P_ID")
	private Integer pid;
	@Column(name = "MOBILE_NUM")
	private Long mobileNumbers;
	@Column(name = "EMAIL_ID")
	private String emailID;
	
	@Override
	public String toString() {
		return "SecondTable [pid=" + pid + ", mobileNumbers=" + mobileNumbers + ", emailID=" + emailID + "]";
	}

}
