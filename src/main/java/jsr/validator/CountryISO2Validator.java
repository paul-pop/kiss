package jsr.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Locale;
import java.util.stream.Stream;

public class CountryISO2Validator implements ConstraintValidator<CountryISO2, CharSequence> {

    @Override
    public void initialize(CountryISO2 annotation) {
        // No initialization needed
    }

    @Override
    public boolean isValid(CharSequence value, ConstraintValidatorContext context) {
        return value == null || Stream.of(Locale.getISOCountries())
                .anyMatch(c -> c.contentEquals(value));
    }
}
