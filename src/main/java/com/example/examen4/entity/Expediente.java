package com.example.examen4.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Expedientes")
public class Expediente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer dni;
    private String fechaIns;
    private String fechaFin;
    private Integer calificacion;

    public Expediente(Integer dni, String fechaIns, String fechaFin, Integer calificacion) {
        this.dni = dni;
        this.fechaIns = fechaIns;
        this.fechaFin = fechaFin;
        this.calificacion = calificacion;
    }

    public Expediente(String fechaIns, String fechaFin, Integer calificacion) {
        this.fechaIns = fechaIns;
        this.fechaFin = fechaFin;
        this.calificacion = calificacion;
    }

    public Expediente() {
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getFechaIns() {
        return fechaIns;
    }

    public void setFechaIns(String fechaIns) {
        this.fechaIns = fechaIns;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

}