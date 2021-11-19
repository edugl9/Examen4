package com.example.Examen4.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Cursos")
public class Curso {

    @OneToMany(cascade = {CascadeType.ALL})
    @Column(name = "Contenido")
    List<Contenido> contenidoList;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;


    public Curso(List<Contenido> contenidoList, Integer id, String nombre) {
        this.contenidoList = contenidoList;
        this.id = id;
        this.nombre = nombre;
    }

    public List<Contenido> getContenidoList() {
        return contenidoList;
    }

    public void setContenidoList(List<Contenido> contenidoList) {
        this.contenidoList = contenidoList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
