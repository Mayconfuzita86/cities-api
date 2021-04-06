package com.gitbub.mayconfuzita.citiesapi.repository;

import com.gitbub.mayconfuzita.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
