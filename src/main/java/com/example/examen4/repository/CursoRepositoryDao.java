package com.example.examen4.repository;

import com.example.examen4.entity.Curso;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface CursoRepositoryDao extends CrudRepository<Curso, Integer> {

    @Query(value = "Select * from cursos where nombre=:nombre", nativeQuery = true)
    public List<Curso> findCursoByNombrePorQueryNativa(@Param("nombre") String nombre);

//    @Query(value = "Select c from cursos c where c.nombre=:nombre")
//    public List<String>findCursoByNombrePorJPQL(String nombre);

    @Query(value = "Select * from cursos where id=:id", nativeQuery = true)
    public List<Curso> findCursoById(@Param("id") Integer id);

    @Query(value = "Select c from Curso c join c.contenidoList cont where cont.id=:id")
    public List<Curso> findCursoByIdJoinContenido(Integer id);

    //  Actualiza curso por id
    @Modifying
    @Query(value = "UPDATE cursos set nombre=:nombre where id=:id", nativeQuery = true)
    public void updateCursoById(String nombre, Integer id);

    //  Eliminar curso por id
    @Query(value = "DELETE from cursos where id=:id", nativeQuery = true)
    public Curso deleteCurso(Integer id);

}
