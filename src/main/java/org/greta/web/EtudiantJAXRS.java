package org.greta.web;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.greta.dao.EtudiantRepository;
import org.greta.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/scolarite")
public class EtudiantJAXRS {
	@Autowired
	private EtudiantRepository etudiantRepository;
	
	@GET
	@Path("/etudiants")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Etudiant> list(){
		
		return etudiantRepository.findAll();
		
	}
	
	@GET
	@Path("/etudiants/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Etudiant getOne(@PathParam(value="id")Long id){
		
		return etudiantRepository.getOne(id);
		
	}
	
	@POST
	@Path("/etudiants")
	@Produces(MediaType.APPLICATION_JSON)
	public Etudiant save(Etudiant etudiant){
		
		return etudiantRepository.save(etudiant);
		
	}
	
	@PUT
	@Path("/etudiants/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Etudiant update(@PathParam(value="id")Long id,Etudiant etudiant){
		etudiant.setId(id);
		return etudiantRepository.save(etudiant);
		
	}
	
	@DELETE
	@Path("/etudiants/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void delete(@PathParam(value="id")Long id){
		
		etudiantRepository.deleteById(id);;
		
	}

}
