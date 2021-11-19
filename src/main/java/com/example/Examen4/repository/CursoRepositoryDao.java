package com.example.Examen4.repository;

import com.example.Examen4.entity.Curso;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface CursoRepositoryDao extends CrudRepository<Curso, String> {
    public List<Curso> buscaCursoPorNombre(String nombre);

    @Query(value = "Select * from cursos where nombre=:nombre", nativeQuery = true)
    public List<Curso> buscaCursoPorNombrePorQueryNativa(@Param("nombre") String nombre);

    @Query(value = "Select * from cursos where nombre=:nombre", nativeQuery = true)
    public List<Curso> buscaCursoPorNombrePorJPQL(@Param("nombre") String nombre);

}
