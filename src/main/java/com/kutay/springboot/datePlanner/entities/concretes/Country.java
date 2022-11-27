package com.kutay.springboot.datePlanner.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="countries")
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cities"})
public class Country {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="country_name")
    @NotBlank
    @NotNull
    private String countryName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
    private List<City> cities;

}
