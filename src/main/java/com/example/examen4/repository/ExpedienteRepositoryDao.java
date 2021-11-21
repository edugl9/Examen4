package com.example.examen4.repository;

import com.example.examen4.entity.Contenido;
import com.example.examen4.entity.Expediente;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ExpedienteRepositoryDao extends CrudRepository<Expediente, Integer> {

    @Query(value = "Select * from expedientes where dni=:dni", nativeQuery = true)
    public List<Expediente> findExpedienteByDniPorQueryNativa(@Param("dni") Integer dni);

    @Query(value = "Select e from Expediente e where e.dni=:dni")
    public List<Expediente> findExpedientePorDniPorJPQL(@Param("dni") Integer dni);

    //  Actualiza expediente por id
    @Modifying
    @Query(value = "UPDATE expedientes set fecha_ins=:fechaIns, fecha_fin=:fechaFin, calificacion=:calificacion where id=:id", nativeQuery = true)
    public void updateExpedienteById(String fechaIns, String fechaFin, Integer calificacion, Integer id);

    //  Eliminar expediente por id
    @Query(value = "DELETE from expedientes where id=:id", nativeQuery = true)
    public Contenido deleteExpediente(Integer id);
}
