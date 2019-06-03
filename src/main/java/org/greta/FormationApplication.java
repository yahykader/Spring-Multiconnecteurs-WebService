package org.greta;

import java.util.stream.Stream;


import org.greta.dao.EtudiantRepository;
import org.greta.entities.Etudiant;
import org.greta.entities.Formation;
import org.greta.dao.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FormationApplication implements CommandLineRunner {
	
    @Autowired
	 private EtudiantRepository etudiantRepository;
    @Autowired
	 private FormationRepository formationRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(FormationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Stream.of("Java","J2EE","Oracle").forEach(nF->{
			Formation f=new Formation();
			f.setNom_formation(nF);f.setDuree(30);
			formationRepository.save(f);	
		});
	
		etudiantRepository.save(new Etudiant(null,"Yahyaoui","Abdelkader", new Formation(1L,null,0,null)));
		etudiantRepository.save(new Etudiant(null,"Yahyaoui","Mounir", new Formation(2L,null,0,null)));
		etudiantRepository.save(new Etudiant(null,"Yahyaoui","Houcin", new Formation(3L,null,0,null)));
		etudiantRepository.save(new Etudiant(null,"Yahyaoui","Hakim", new Formation(1L,null,0,null)));
		etudiantRepository.save(new Etudiant(null,"Yahyaoui","Omar", new Formation(1L,null,0,null)));
		etudiantRepository.save(new Etudiant(null,"Yahyaoui","Mounir", new Formation(2L,null,0,null)));
		etudiantRepository.save(new Etudiant(null,"Yahyaoui","Jerome", new Formation(3L,null,0,null)));
		etudiantRepository.save(new Etudiant(null,"Yahyaoui","Olivier", new Formation(1L,null,0,null)));
		
		formationRepository.findAll().forEach(f->{
			
			System.out.println(f.getNom_formation());
			
		});
		
		
		
	}

}

