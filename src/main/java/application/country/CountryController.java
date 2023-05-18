package application.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/countries")
public class CountryController {

    @Autowired
    private final CountryService countryService;


    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping
    public List<CountryDTO> getCountries() {
        return countryService.getCountries();
    };

    @PostMapping
    public void saveCountry(@RequestBody CountryDTO countryDTO) {
        countryService.saveCountry(countryDTO);

    }

    @GetMapping("/{id}")
    public CountryDTO getCountry(@PathVariable String id) {
        return countryService.getCountry(id);
    }

    @PatchMapping("/{id}")
    public CountryDTO updateCountry(@RequestBody CountryDTO countryDTO,@PathVariable("id") String id) {
        return countryService.updateCountry(countryDTO,id);
    }
}
