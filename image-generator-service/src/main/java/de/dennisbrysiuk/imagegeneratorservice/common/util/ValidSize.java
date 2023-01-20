package de.dennisbrysiuk.imagegeneratorservice.common.util;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * @author DennisBrysiuk
 */
@Documented
@Constraint(validatedBy = SizeValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidSize {

    String message() default "Invalid value. This is not a valid size.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
