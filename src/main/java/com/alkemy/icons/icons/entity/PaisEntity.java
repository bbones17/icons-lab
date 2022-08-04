package com.alkemy.icons.icons.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="pais")
@Getter
@Setter
public class PaisEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    //@Column(name = "id", columnDefinition = "INT(10) UNSIGNED")
    private Long id;

   // @Column(name = "imagen",columnDefinition = "VARCHAR")
    private String imagen;

  //  @Column(name = "denominacion",columnDefinition = "VARCHAR")
    private String denominacion;

    @Column(name = "cantidad_habitantes",columnDefinition = "INT")
    private Integer cantidadHabitantes;

   // @Column(name = "superficie",columnDefinition = "INT")
    private Integer superficie;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name ="continente_id",insertable = false,updatable = false)
    private ContinenteEntity continente;

    @Column(name = "continente_id",nullable = false)
    private Long continenteId;


    @ManyToMany(
            cascade ={
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(
            name="icon_pais",
            joinColumns = @JoinColumn(name = "pais_id"),
            inverseJoinColumns = @JoinColumn(name="icon_id"))
        private Set<IconEntity>icons=new HashSet<>();









}
