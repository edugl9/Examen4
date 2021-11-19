package com.example.Examen4.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Expedientes")
public class Expediente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer dni;
    private String fechaIns;
    private String fechaFin;
    private Double calificacion;

    //private List<Curso> cursoList;

    public Expediente() {
    }

    public Expediente(Integer dni, String fechaIns, String fechaFin, Double calificacion/*, List<Curso> cursoList*/) {
        this.dni = dni;
        this.fechaIns = fechaIns;
        this.fechaFin = fechaFin;
        this.calificacion = calificacion;
        //this.cursoList = cursoList;
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

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }
    /*
    public List<Curso> getCursoList() {
        return cursoList;
    }

    public void setCursoList(List<Curso> cursoList) {
        this.cursoList = cursoList;
    }
     */
}
