package com.example.Examen4.repository;

import com.example.Examen4.entity.Expediente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ExpedienteRepository {
    @Autowired
    ExpedienteRepositoryDao expedienteRepositoryDao;

    public void creacionExpedientes(Expediente expediente) {
        expedienteRepositoryDao.save(expediente);
    }
}
