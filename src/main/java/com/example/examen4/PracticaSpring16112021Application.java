package com.example.examen4;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PracticaSpring16112021Application {

    public static void main(String[] args) {
        SpringApplication.run(PracticaSpring16112021Application.class, args);
    }

//    @Bean
//    public CommandLineRunner demo(CursoRepositoryDao cursoRepositoryDao) {
//        return args -> {
//            Contenido contenido=new Contenido("spring","",10);
//            Contenido contenido2=new Contenido("base de datos","",5);
//            Contenido contenido3=new Contenido("jpa","",5);
//
//            Curso curso=new Curso(List.of(contenido,contenido2,contenido3),1,"Java");
//            cursoRepositoryDao.save(curso);
//        };
//    }
}
