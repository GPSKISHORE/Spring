package com.tcs.enty;

import java.io.Serializable;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@EntityScan
@Document(value = "TestMongo1")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entity implements Serializable{

	@Id
	private String sno;
	@Field(name = "Name")
	private String name;
	private String House;
	private String Vehicle;
	private Integer Amount;
	private Boolean visitedEarth;
	private Boolean Kids;
	private Integer rank;
	private String Gold;
	
	//private Enty2 avataras;
}
