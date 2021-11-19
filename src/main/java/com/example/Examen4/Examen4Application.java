package com.example.Examen4;

import com.example.Examen4.entity.Contenido;
import com.example.Examen4.entity.Curso;
import com.example.Examen4.repository.CursoRepositoryDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Examen4Application {

	public static void main(String[] args) {
		SpringApplication.run(Examen4Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(CursoRepositoryDao cursoRepositoryDao) {
		return args -> {
			Contenido contenido=new Contenido(1,"Microservicios","",10);
			Contenido contenido2=new Contenido(2,"Spring","",15);
			Contenido contenido3=new Contenido(3,"Java JPA","",5);

			Curso curso=new Curso(List.of(contenido,contenido2,contenido3),1,"Java");
			cursoRepositoryDao.save(curso);
		};
	}
}
