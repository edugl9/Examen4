package com.example.examen4.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Alumnos")
public class Alumno {

    @OneToMany(cascade = {CascadeType.ALL})
    @Column(name = "expediente")
    private List<Expediente> expedienteList;//=new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String mail;

    public Alumno(Integer dni, String nombre, String apellido, String direccion, String mail) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.mail = mail;
    }

    public Alumno(List<Expediente> expedienteList, Integer dni, String nombre, String apellido, String direccion, String mail) {
        this.expedienteList = expedienteList;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.mail = mail;
    }

    public Alumno(){
    }

    public List<Expediente> getExpedienteList() {
        return expedienteList;
    }

    public void setExpedienteList(List<Expediente> expedienteList) {
        this.expedienteList = expedienteList;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}
