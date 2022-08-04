package com.alkemy.icons.icons.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="icon")
@Getter
@Setter
public class IconEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
  //  @Column(name = "id", columnDefinition = "INT(10) UNSIGNED")
    private Long id;

   // @Column(name = "imagen",columnDefinition = "VARCHAR")
    private String imagen;

   // @Column(name = "denominacion",columnDefinition = "VARCHAR")
    private String denominacion;

    @Column(name = "fecha_creacion")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate fechaCreacion;

  //  @Column(name = "altura",columnDefinition = "DATETIME")
    private Long altura;

    //@Column(name = "historia",columnDefinition = "TEXT")
    private String historia;

    @ManyToMany(mappedBy = "icons",cascade = CascadeType.ALL)
    private List<PaisEntity> paises =new ArrayList<>();




}
