package com.tcs.enty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(value = "TestMongo1")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Enty2 {
	
	@Id
	private String sno;

	@Field(name = "Avatar_Name")
	private String name;
	private String BornAs;
	private Entity parentData;
}
