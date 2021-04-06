package com.gitbub.mayconfuzita.citiesapi;

import com.gitbub.mayconfuzita.citiesapi.countries.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class CountryResource {

    @RestController
    @RequestMapping("/countries")
    public class CountryResource{

        @GetMapping
        public List<Country> countries(){
            return
        }

    }
}
