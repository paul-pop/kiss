package jsr.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = {CountryISO2Validator.class})
@Target({FIELD, LOCAL_VARIABLE, PARAMETER, TYPE_PARAMETER, TYPE_USE})
@Retention(RUNTIME)
@ReportAsSingleViolation
public @interface CountryISO2 {

    String message() default "is not a valid ISO2 country code";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
