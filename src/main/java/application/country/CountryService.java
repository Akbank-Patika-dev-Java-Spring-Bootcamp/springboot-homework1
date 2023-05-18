package application.country;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private final CountryMapper countryMapper = Mappers.getMapper(CountryMapper.class);

    @Autowired
    private final   CountryDatabase countryDatabase;

    public CountryService(CountryDatabase countryDatabase) {
        this.countryDatabase =countryDatabase;
    }

    public List<CountryDTO> getCountries() {
        List<Country> countries = countryDatabase.getCountries();
        return countryMapper.toCountriesDTO(countries);

    }

    public CountryDTO getCountry(String id) {
        Country country = countryDatabase.getCountry(id);
        return countryMapper.toCountryDTO(country);
    }

    public void saveCountry(CountryDTO countryDTO) {
       Country country = countryMapper.toCountry(countryDTO);
        countryDatabase.saveCountry(country);

    }

    public CountryDTO updateCountry(CountryDTO countryDTO,String id) {
        Country country = countryMapper.toCountry(countryDTO);
        Country updatedCountry = countryDatabase.updatePresident(id,country.getPresident());
        CountryDTO updatedDTO =countryMapper.toCountryDTO(updatedCountry);
        return updatedDTO;

    }



}
