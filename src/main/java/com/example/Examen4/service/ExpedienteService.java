package com.example.Examen4.service;

import com.example.Examen4.entity.Alumno;
import com.example.Examen4.entity.Expediente;
import com.example.Examen4.repository.AlumnoRepository;
import com.example.Examen4.repository.AlumnoRepositoryDao;
import com.example.Examen4.repository.ExpedienteRepository;
import com.example.Examen4.repository.ExpedienteRepositoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpedienteService {

    @Autowired
    ExpedienteRepositoryDao expedienteRepositoryDao;

    @Autowired
    ExpedienteRepository expedienteRepository;

    public void addExpediente(Expediente expediente) {
        expedienteRepository.creacionExpedientes(expediente);
    }

    public List<Expediente> getLista(){
        return null;
    }

    public Expediente getExpediente(String dni) {
        return null;
    }
}
