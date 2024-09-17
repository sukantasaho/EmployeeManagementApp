package com.main.exception;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.constraints.Negative;

public class NegativeNumberValidator implements ConstraintValidator<Negative, Number>{

	@Override
	public boolean isValid(Number value, ConstraintValidatorContext context) {
		if (value == null) {
            return true; // Consider null valid if not using @NotNull; otherwise, handle null case
        }
        return value.doubleValue() < 0;
	}
	@Override
    public void initialize(Negative constraintAnnotation) {
        // Initialization code, if needed
    }


}
