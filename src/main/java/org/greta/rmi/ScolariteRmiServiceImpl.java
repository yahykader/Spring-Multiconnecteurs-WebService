package org.greta.rmi;

import java.rmi.RemoteException;
import java.util.List;

import org.greta.dao.EtudiantRepository;
import org.greta.dao.FormationRepository;
import org.greta.entities.Etudiant;
import org.greta.entities.Formation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//pour etre un composant spring 
@Component

public class ScolariteRmiServiceImpl implements ScolariteRemote{
    @Autowired  
	private EtudiantRepository etudaintRepository;
    @Autowired
	private FormationRepository formationRepository;
	@Override
	
	
	public List<Etudiant> listEtudiant() throws RemoteException {
		// TODO Auto-generated method stub
		return etudaintRepository.findAll();
	}

	@Override
	public Etudiant getEtudiant(Long id) throws RemoteException {
		// TODO Auto-generated method stub
		return etudaintRepository.getOne(id);
	}

	@Override
	public Formation saveFormation(Formation f) throws RemoteException {
		// TODO Auto-generated method stub
		return formationRepository.save(f);
	}

}
