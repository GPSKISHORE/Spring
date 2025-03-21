package com.tcs.enty;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@EntityScan
@Document(value = "TestMongo2")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entity implements Serializable{

	@Id
	private String sno;
	@Field(name = "Name")
	private String name;
	private String House;
	private List<sportContries> sportCon;
	private Map<String,Medal> med;
}
