package com.krish.batchConfig;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.krish.enty.IBMEnty;

public class BatchFieldSetMapper implements FieldSetMapper<IBMEnty>{

	@Override
	public IBMEnty mapFieldSet(FieldSet fieldSet) throws BindException {
		IBMEnty entity = new IBMEnty();
		
		entity.setClose(fieldSet.readDouble("close"));
		entity.setOpen(fieldSet.readDouble("open"));
		entity.setHigh(fieldSet.readDouble("high"));
		entity.setLow(fieldSet.readDouble("low"));
		entity.setOpenint(fieldSet.readDouble("openint"));
		entity.setRefnum(fieldSet.readLong("refnum"));
		entity.setVolume(fieldSet.readDouble("volume"));
		String date = fieldSet.readString("date");
		entity.setDate(LocalDate.parse(date,DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		
		return entity;
	}

}
