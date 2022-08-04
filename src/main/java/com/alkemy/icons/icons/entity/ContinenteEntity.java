package com.alkemy.icons.icons.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name="continente")
@Getter
@Setter

public class ContinenteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    //@Column(name = "id", columnDefinition = "INT(10) UNSIGNED")
    private Long id;

    //@Column(name = "imagen",columnDefinition = "VARCHAR")
    private String imagen;

   // @Column(name = "denominacion",columnDefinition = "VARCHAR")
    private String denominacion;






}
