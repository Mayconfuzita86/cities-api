package com.gitbub.mayconfuzita.citiesapi.countries;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name ="Country")
@Table(name = "pais")
public class Country {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "nome_pt")
    private String portugeseName;

    @Column(name = "sigla")
    private String code;

    private Integer bacen;

    public Country() {

    }

    public Country(Long id, String name, String portugeseName, String code, Integer bacen) {
        this.id = id;
        this.name = name;
        this.portugeseName = portugeseName;
        this.code = code;
        this.bacen = bacen;
    }
}



