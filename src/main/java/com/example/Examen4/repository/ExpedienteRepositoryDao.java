package com.example.Examen4.repository;

import com.example.Examen4.entity.Alumno;
import com.example.Examen4.entity.Expediente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ExpedienteRepositoryDao extends CrudRepository<Expediente, Integer> {
    public List<Expediente> buscaExpedientePorDni(Integer dni);

    @Query(value = "Select * from expedientes where dni=:dni", nativeQuery = true)
    public List<Alumno> buscaExpedientePorDniPorQueryNativa(@Param("dni") Integer dni);

    @Query(value = "Select e from Expediente e where e.dni=:dni")
    public List<Alumno> buscaExpedientePorDniPorJPQL(@Param("dni") Integer dni);
}
