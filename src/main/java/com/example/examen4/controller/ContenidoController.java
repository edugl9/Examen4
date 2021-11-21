package com.example.examen4.controller;

import com.example.examen4.entity.Contenido;
import com.example.examen4.exception.InexistenteException;
import com.example.examen4.service.ContenidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContenidoController {
    @Autowired
    private ContenidoService contenidoService;

    @PostMapping("/agregarcontenido")
    public ResponseEntity<Contenido> addContenido(@RequestBody Contenido contenido){
        System.out.println("Se agrego contenido");
        contenidoService.AddContenido(contenido);
        return ResponseEntity.ok(contenido);
    }

    @GetMapping("/contenido/{nombre}")
    public List<Contenido> getContenidoPorNombrePorQueryNativa(@PathVariable("nombre") String nombre){
        return contenidoService.getContenidoByNombrePorQueryNativa(nombre);
    }

    @PutMapping("/updateContenido")
    public ResponseEntity<String> updateContenido(@RequestBody Contenido contenido) throws InexistenteException {
        if (contenidoService.getContenidoById(contenido.getId()).isEmpty()){
            throw new InexistenteException("Contenido no encontrado");
        }
        contenidoService.updateContenido(contenido);
        return ResponseEntity.ok("Actualizacion correcta");
    }

    @DeleteMapping("/deleteContenido")
    public ResponseEntity<Contenido> deleteContenido(@RequestBody Contenido contenido) throws InexistenteException {
        contenidoService.deleteContenido(contenido);
        return ResponseEntity.ok(contenido);
    }
}
