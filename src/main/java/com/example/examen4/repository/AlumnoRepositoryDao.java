package com.example.examen4.repository;

import com.example.examen4.entity.Alumno;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface AlumnoRepositoryDao extends CrudRepository<Alumno, Integer> {
    //public List<Alumno> findAlumnoByDniAndNombre(String nombre);

    @Query(value = "Select * from alumnos where nombre=:nombre", nativeQuery = true)
    public List<Alumno> findAlumnoByNombrePorQueryNativa(@Param("nombre") String nombre);

    @Query(value = "Select * from alumnos where dni=:dni", nativeQuery = true)
    public List<Alumno> findAlumnoByDniPorQueryNativa(@Param("dni") Integer dni);

//    @Query(value = "Select a from Alumno a where a.dni=:dni and a.nombre=:nombre")
//    public List<Alumno> findAlumnoByDniAndNombrePorJPQueryN(@Param("dni") Integer dni, @Param("nombre") String nombre);

    @Query(value = "Select a.nombre from Alumno a where a.nombre=:nombre")
    public List<String> findAlumnoByNombrePorJPQueryN(String nombre);

//    @Query(value = "Select t from Teacher t join t.cursoList c where c.nombre=:nombre")
//    @Query(value = "Select a.dni,a.nombre,a.apellido,e.fecha_ins,e.fecha_fin,e.calificacion from Alumnos a join Expedientes e on a.dni=e.dni where a.dni=dni", nativeQuery = true)
//    @Query(value = "Select new com.example.practica.spring611.entity.Expediente(a.nombre,e) from Alumno a join a.expedienteList where a.dni=:dni and e.dni=:dni", nativeQuery = true)
    @Query(value = "Select a from Alumno a join a.expedienteList e where e.dni=:dni")
    public List<Alumno> findAlumnoByNombreJoinExpediente(Integer dni);

    //  Actualiza alumno por dni
    @Modifying
    @Query(value = "UPDATE alumnos set nombre=:nombre, apellido=:apellido, direccion=:direccion, mail=:mail where dni=:dni", nativeQuery = true)
    public void updateAlumnoByDni(String nombre, String apellido, String direccion, String mail, Integer dni);

    //  Eliminar alumno por dni
    @Query(value = "DELETE from alumnos where dni=:dni", nativeQuery = true)
    public Alumno deleteAlumno(Integer dni);
}