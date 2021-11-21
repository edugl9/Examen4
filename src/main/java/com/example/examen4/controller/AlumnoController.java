package com.example.examen4.controller;

import com.example.examen4.entity.Alumno;
import com.example.examen4.exception.InexistenteException;
import com.example.examen4.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @PostMapping("/agregaralumno")
    public ResponseEntity<Alumno> addAlumno(@RequestBody Alumno alumno){
        System.out.println("Se agrego alumno");
        alumnoService.AddAlumno(alumno);
        return ResponseEntity.ok(alumno);
    }
/*
    @GetMapping("/pornombre/{nombrevariable}")
    public Alumno getAlumnoByNombre(@PathVariable("nombrevariable") String nombre) {
        return alumnoService.getAlumno(nombre);
    }

    @GetMapping("/alumno3/{nombre}")
    public List<String> getAlumnoPorNombre2(@PathVariable("nombre") String nombre) {
        return alumnoService.getAlumno3(nombre);
    }
*/
    @GetMapping("/alumnoPorNombreExpediente/{dni}")
    public List<Alumno> getAlumnoPorNombreJoinExpediente(@PathVariable("dni") Integer dni) {
        return  alumnoService.getAlumnoByNombreJoinExpediente(dni);
    }

    @GetMapping("/alumno/{nombre}")
    public List<Alumno> getAlumnoPorNombrePorQueryNatica(@PathVariable("nombre") String nombre){
        return alumnoService.getAlumnoByNombrePorQueryNativa(nombre);
    }

    @PutMapping("/updateAlumno")
    public ResponseEntity<String> updateAlumno(@RequestBody Alumno alumno) throws InexistenteException {
        if (alumnoService.getAlumnoByDni(alumno.getDni()).isEmpty()){
            throw new InexistenteException("Alumno no encontrado");
        }
        alumnoService.updateAlumno(alumno);
        return ResponseEntity.ok("Actualizacion correcta");
    }

    @DeleteMapping("/deleteAlumno")
    public ResponseEntity<Alumno> deleteAlumno(@RequestBody Alumno alumno) throws InexistenteException {
        alumnoService.deleteAlumno(alumno);
        return ResponseEntity.ok(alumno);
    }
}

