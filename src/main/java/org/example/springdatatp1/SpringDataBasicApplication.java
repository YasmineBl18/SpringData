package org.example.springdatatp1;

import org.example.springdatatp1.enums.Genre;
import org.example.springdatatp1.model.Etudiant;
import org.example.springdatatp1.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataBasicApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringDataBasicApplication.class, args);
    }
    @Autowired
    EtudiantRepository etudiantRepository;
    @Override
    public void run(String... args) throws Exception {
        Etudiant et1= Etudiant.builder()
                .nom("Adnani")
                .prenom("Morad")
                .genre(Genre.Homme)
                .build();
        etudiantRepository.save(et1);

    }
}
