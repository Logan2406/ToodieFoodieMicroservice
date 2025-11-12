package com.toodiefoodie.user_service.annotations;


import com.toodiefoodie.user_service.PincodeValidation;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = PincodeValidation.class)
@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPinCode {

    String message() default "You must provide a valid Pincode";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
