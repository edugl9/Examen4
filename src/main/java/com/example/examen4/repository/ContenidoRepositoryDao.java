package com.example.examen4.repository;

import com.example.examen4.entity.Contenido;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ContenidoRepositoryDao extends CrudRepository<Contenido, Integer> {

    @Query(value = "Select * from contenidos where nombre=:nombre", nativeQuery = true)
    public List<Contenido> findContenidoByNombrePorQueryNativa(@Param("nombre") String nombre);

    @Query(value = "Select * from contenidos where id=:id", nativeQuery = true)
    public List<Contenido> findContenidoById(@Param("id") Integer id);

    //  Actualiza contenido por id
    @Modifying
    @Query(value = "UPDATE contenidos set nombre=:nombre, descripcion=:descripcion, duracion=:duracion where id=:id", nativeQuery = true)
    public void updateContenidoById(String nombre, String descripcion, Integer duracion, Integer id);

    //  Eliminar contenido por id
    @Query(value = "DELETE from contenidos where id=:id", nativeQuery = true)
    public Contenido deleteContenido(Integer id);
}
