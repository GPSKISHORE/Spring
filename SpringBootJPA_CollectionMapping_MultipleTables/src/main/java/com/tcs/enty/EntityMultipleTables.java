package com.tcs.enty;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.ListIndexBase;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="Data_Master")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EntityMultipleTables {
	@Id
	@Column(name = "PID")
	private Integer pid;
	@Column(name = "P_Name",length = 50)
	private String pName;
	@ElementCollection
	@CollectionTable(name = "Contact_Info", joinColumns=@JoinColumn(name = "P_ID",referencedColumnName = "PID"))
	@Column(name = "Mobile_Num",length = 11)
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<Long> mobileNumbers;
	
	@ElementCollection
	@CollectionTable(name = "Family_Data",joinColumns = @JoinColumn(name = "P_ID",referencedColumnName = "PID"))
	@Column(name = "Fam_Per")
	@OrderColumn(name = "F_ID")
	@ListIndexBase(value = 1)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<String> failyPersons;
	
	@ElementCollection
	@CollectionTable(name = "Peron_Id_Data", joinColumns = @JoinColumn(name = "P_ID",referencedColumnName = "PID"))
	@Column(name = "ID_Details")
	@OrderColumn(name = "ID_Index")
	@ListIndexBase(value = 1)
	@LazyCollection(LazyCollectionOption.FALSE)
	private Map<String,String> idsDetails;
	
	@ElementCollection
	@CollectionTable(name = "Contact_Info", joinColumns=@JoinColumn(name = "P_ID",referencedColumnName = "PID"))
	@Column(name = "Email_ID",length = 99)
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<String> emailID;
}
