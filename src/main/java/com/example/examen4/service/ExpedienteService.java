package com.example.examen4.service;

import com.example.examen4.repository.ExpedienteRepository;
import com.example.examen4.repository.ExpedienteRepositoryDao;
import com.example.examen4.entity.Expediente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpedienteService {
    @Autowired
    ExpedienteRepositoryDao expedienteRepositoryDao;

    @Autowired
    ExpedienteRepository expedienteRepository;

    public void AddExpediente(Expediente espediente) {
        expedienteRepository.creacionExpediente(espediente);
    }

    public List<Expediente> getLista() {
        return null;
    }

    public Expediente getExpediente(String nombre){
        return null;
    }

    public List<Expediente> getExpedienteByDniPorQueryNativa(Integer dni){
        return expedienteRepositoryDao.findExpedienteByDniPorQueryNativa(dni);
    }

    public List<Expediente> getExpedienteById(Integer dni){
        return expedienteRepositoryDao.findExpedientePorDniPorJPQL(dni);
    }

    public Expediente updateExpediente(Expediente expediente){
        return expedienteRepositoryDao.save(expediente);
    }

    public void deleteExpediente(Expediente expediente){
        expedienteRepositoryDao.deleteExpediente(expediente.getDni());
    }
}
