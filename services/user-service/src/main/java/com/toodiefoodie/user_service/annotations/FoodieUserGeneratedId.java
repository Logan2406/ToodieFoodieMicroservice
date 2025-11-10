package com.toodiefoodie.user_service.annotations;

import com.toodiefoodie.user_service.utils.FoodieUserIdGenerator;
import org.hibernate.annotations.IdGeneratorType;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;

@IdGeneratorType(FoodieUserIdGenerator.class)
@Target({ FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface FoodieUserGeneratedId {
}
