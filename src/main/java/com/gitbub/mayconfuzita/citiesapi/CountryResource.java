package com.gitbub.mayconfuzita.citiesapi;

import com.gitbub.mayconfuzita.citiesapi.countries.Country;
import com.gitbub.mayconfuzita.citiesapi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

    @RestController
    @RequestMapping("/countries")
    public class CountryResource {

        @Autowired
        private CountryRepository repository;

        public CountryResource(CountryRepository repository){
            this.repository = repository;
        }

        @GetMapping
        public Page<Country> countries(Pageable page){
            return repository.findAll(page);
        }

        @GetMapping("/{id}")
        public ResponseEntity getOne(@PathVariable Long id){
            Optional<Country> optional = repository.findById(id);

            if (optional.isPresent()){
                return ResponseEntity.ok().body(optional.get()); //se existir o pais ok
            } else {
                return ResponseEntity.notFound().build(); // se não existir
            }



        }

    }