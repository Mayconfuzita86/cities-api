package com.gitbub.mayconfuzita.citiesapi;

import com.gitbub.mayconfuzita.citiesapi.countries.Country;
import com.gitbub.mayconfuzita.citiesapi.repository.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;

    @RestController
    @RequestMapping("/countries")
    public class CountryResource {

        private CountryRepository repository;

        @GetMapping
        public List<Country> countries(){

            return repository.findAll();
        }

    }