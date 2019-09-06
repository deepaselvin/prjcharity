package com.revature.projectdept2.validator;

import com.revature.projectdept2.exception.ValidatorException;
import com.revature.projectdept2.model.RegUserDetails;

public class ValidatorReg {

	public void validateBeforeRegistration(RegUserDetails user) throws ValidatorException {

		String name = user.getName();
		if (name == null || "".equals(name.trim())) {
			throw new ValidatorException("Invalid Name");
		}
		int phone_no = user.getPhone_no();
		if (phone_no == 0) {
			throw new ValidatorException("Invalid phone_no");
		}

		String role = user.getRole();
		if (role == null || "".equals(role.trim())) {
			throw new ValidatorException("Invalid password");
		}

	}
}