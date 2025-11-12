package com.toodiefoodie.user_service;

import com.toodiefoodie.user_service.annotations.ValidPinCode;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PincodeValidation implements ConstraintValidator<ValidPinCode,String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        int x;
        if(s.isBlank())
        {
            return false;
        }

       try{

           x = Integer.parseInt(s);
       }
       catch(NumberFormatException e)
       {
           return false;
       }

       return isPincodeValid(x);
    }

    public boolean isPincodeValid(int x)
    {
        if(x==731204)
        {
            return true;
        }
        return false;
    }

}
