package com.example.Examen4.repository;

import com.example.Examen4.entity.Alumno;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface AlumnoRepositoryDao extends CrudRepository<Alumno, Integer> {
    public List<Alumno> buscaAlumnoPorDniAndNombre(String nombre);

    @Query(value = "Select * from alumnos where dni=:dni and nombre=:nombre", nativeQuery = true)
    public List<Alumno> buscaAlumnoPorDniAndNombrePorQueryNativa(@Param("dni") Integer dni, @Param("nombre") String nombre);

    @Query(value = "Select a from Alumno a where a.nombre=:nombre")
    public List<Alumno> buscaAlumnoPorNombrePorJPQL(@Param("nombre") String nombre);

    @Query(value = "Select a.nombre, from Alumno a join a.expedienteList e where e.dni=:dni")
    public List<Alumno> BuscaAlumnoPorDniJoinExpediente(Integer dni);
}
