package usage;

import java.util.Locale;
import java.util.stream.Stream;

public class Service {

    public void createCountry(String countryCode) {
        if (countryCode != null && Stream.of(Locale.getISOCountries())
                .noneMatch(c -> c.contentEquals(countryCode))) {
            throw new RuntimeException("Invalid ISO2 country code provided");
        }

        System.out.println("Success baby!");
    }
}
