package org.greta.web;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.greta.dao.EtudiantRepository;
import org.greta.dao.FormationRepository;
import org.greta.entities.Etudiant;
import org.greta.entities.Formation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
@WebService

public class EtudiantSOAP {
	
	@Autowired
	private EtudiantRepository etudiantRepository;
	@Autowired
	private FormationRepository formationRepository;
	
	@WebMethod(operationName="listEtudiants")
	public List<Etudiant> listAll(){
		
		return etudiantRepository.findAll();
	}
	@WebMethod
    public Etudiant getOne(@WebParam(name="id") Long id){
		
		return etudiantRepository.getOne(id);
		
	}
	@WebMethod
    public Formation save(@WebParam(name="formation")Formation f) {
    	
    	return formationRepository.save(f);
    	
    }
	@WebMethod
	public Etudiant update(@WebParam(name="id")Long id, @WebParam(name="etudiant")Etudiant etudiant) {
		
		etudiant.setId(id);
		return etudiantRepository.save(etudiant);
		
	}
	@WebMethod
	public void delete(@WebParam(name="id")Long id) {
		
		etudiantRepository.deleteById(id);
	}
	
	
	
}
