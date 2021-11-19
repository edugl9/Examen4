package com.example.Examen4.controller;

import com.example.Examen4.entity.Alumno;
import com.example.Examen4.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @PostMapping("/agregarAlumno")
    public ResponseEntity<Alumno> addAlumno(@RequestBody Alumno alumno){
        System.out.println("Se agrego alumno");
        alumnoService.addAlumno(alumno);
        return ResponseEntity.ok(alumno);
    }

    @GetMapping("/alumno/{pornombre}/{nombrevariable}")
    public Alumno getTeacherByName(@PathVariable("nombrevariable") String nombre) {
        return alumnoService.getAlumno(nombre);
    }
}
