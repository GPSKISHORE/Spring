package com.tcs.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.tcs.enty.EmpEnty;

@Component
public class EmpValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(EmpEnty.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
	
		EmpEnty emp = (EmpEnty)target;
		if(emp.getEName().equals("") || emp.getEName()==null)
			errors.rejectValue("eName", "empname.required");
		else
		  if(emp.getEName().length()<3 || emp.getEName().length()>50) {
			  errors.rejectValue("eName", "empname.maxlength");
			  errors.rejectValue("eName", "empname.minlength");
		  }
	}

}
