package application.country;


import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.*;

@Component
public class CountryDatabase {

    private final List<Country> countries;


    public CountryDatabase() {
        countries=  new ArrayList<>(List.of(
                new Country("Turkey","Ekrem"),
                new Country("Germany","Frank"),
                new Country("USA","Biden"),
                new Country("Polland","Andrzei")));



    }

    public  List<Country> getCountries() {
        return countries;
    }

    public Country getCountry(String id) {
        for (Country country: countries) {
            if (country.getId().equals(id)) {
                return country;
            }
        }
        return null;
    }

    public void saveCountry(Country country) {
        country.setId(String.valueOf(UUID.randomUUID()));
        country.setCreatedAt(LocalDateTime.now());
        country.setUpdatedAt(LocalDateTime.now());
        countries.add(country);

    }

    public Country updatePresident(String id, String newPresident) {
        Country country = getCountry(id);
        country.setPresident(newPresident);
        country.setUpdatedAt(LocalDateTime.now());
        return country;

    }
}
