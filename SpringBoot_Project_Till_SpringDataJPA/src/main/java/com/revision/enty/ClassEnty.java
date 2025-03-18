package com.revision.enty;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Data_Master")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClassEnty {

	@Id
	@Column(name = "PID")
	private Integer pid;
	@Column(name = "P_Name",length = 50)
	private String pName;
	@OneToMany(targetEntity = SecondTable.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "PERSON_ID", referencedColumnName = "PID")
	private Set<SecondTable> ci;
	
	@Override
	public String toString() {
		return "ClassEnty [pid=" + pid + ", pName=" + pName + "]";
	}
	
	
}
