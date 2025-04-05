package com.tcs.mod;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "ToDO_Master")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ToDoModel {

	@Id
	private Integer sno;
	@Column(name = "Task_Name")
	@NonNull
	private String taskName;
	@Column(name = "P_Name")
	@NonNull
	private String sname;
}
