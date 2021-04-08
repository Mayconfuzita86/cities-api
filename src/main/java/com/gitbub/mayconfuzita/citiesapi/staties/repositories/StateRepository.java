package com.gitbub.mayconfuzita.citiesapi.staties.repositories;


import com.gitbub.mayconfuzita.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
