package application.country;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CountryMapper {

    CountryDTO toCountryDTO(Country country);

    Country toCountry(CountryDTO countryDTO);

    List<Country> toCountries(List<CountryDTO> countryDTOList);

    List<CountryDTO> toCountriesDTO(List<Country> countries);


}
