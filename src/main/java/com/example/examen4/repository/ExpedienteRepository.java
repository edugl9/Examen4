package com.example.examen4.repository;

import com.example.examen4.entity.Expediente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ExpedienteRepository {
    @Autowired
    ExpedienteRepositoryDao expedienteRepositoryDao;

    public void creacionExpediente(Expediente expediente){
        expedienteRepositoryDao.save(expediente);
    }
}
