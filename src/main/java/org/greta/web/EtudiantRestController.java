package org.greta.web;

import java.util.List;

import org.greta.dao.EtudiantRepository;
import org.greta.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EtudiantRestController {

	@Autowired
	private EtudiantRepository etudiantRepository;
	
	@GetMapping("/etudiants")
	public List<Etudiant> list(){
		
		return etudiantRepository.findAll();
	
	}
	
	@GetMapping("/etudiants/{id}")
	public Etudiant getOne(@PathVariable(name="id")Long id){
		
		return etudiantRepository.getOne(id);
		
	}
	
	@PostMapping("/etudiants")
	public Etudiant save(@RequestBody Etudiant etudiant){
		
		return etudiantRepository.save(etudiant);
		
	}
	
	@PutMapping("/etudiants/{id}")
	public Etudiant update(@PathVariable(name="id")Long id,
						   @RequestBody Etudiant etudiant){
		etudiant.setId(id);
		return etudiantRepository.save(etudiant);
		
	}
	
	@DeleteMapping("/etudiants/{id}")
	public void delete(@PathVariable(name="id")Long id){
		
		etudiantRepository.deleteById(id);;
		
	}

}
