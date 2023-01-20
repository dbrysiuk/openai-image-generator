package de.dennisbrysiuk.imagegeneratorservice.common.util;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author DennisBrysiuk
 */
public class SizeValidator implements ConstraintValidator<ValidSize, String> {

    private static final List<String> validSizes = Arrays.asList("1024x1024", "512x512", "256x256");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return validSizes.contains(value);
    }

}
