package com.tcs.valid;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.tcs.enty.EmpEnty;

@Component
public class EmpValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {

		return clazz.isAssignableFrom(EmpEnty.class);
	}

	@Override
	public void validate(Object target, Errors errors) {

		EmpEnty en = (EmpEnty) target;
		if (en.getEName().length() == 0 || en.getEName() == null)
			errors.rejectValue("eName", "empName.required");
		else if (en.getDesignation().length() == 0 || en.getDesignation() == null)
			errors.rejectValue("designation", "Designation.required");
		else if (en.getSal() <= 0 )
			errors.rejectValue("sal", "Salary.required");

	}

}
