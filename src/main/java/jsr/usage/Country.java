package usage;

import jsr.validator.CountryISO2;

public class Country {

    private final String name;

    @CountryISO2
    private final String code;

    public Country(String name, @CountryISO2 String code) {
        this.name = name;
        this.code = code;
    }
}
