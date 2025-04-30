package com.tcs.Iserv;

import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tcs.enty.EmpEnty;
import com.tcs.repo.EmpRepo;

@Service
public class EmpSer implements IEmpSer{

	@Autowired
	EmpRepo er;
	
	@Override
	public String Register(EmpEnty e) {
		return "Record is save with the following EMP no - "+er.save(e).getEmoNum();
	}

	@Override
	public String DelData(int num) {
		er.deleteById(num);
		return "Record deleted with following EMP Number - "+num;
	}

	@Override
	public Page<EmpEnty> getRecords(Pageable pg) {
		
		return er.findAll(pg);
	}

	@Override
	public Set<String> getCon() {
		Locale[] con = Locale.getAvailableLocales();
		Set<String> country = new TreeSet<String>();
		Arrays.stream(con).forEach(i -> country.add(i.getDisplayCountry()));
		return country;
	}

	
}
