package org.greta.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import org.greta.entities.Etudiant;
import org.greta.entities.Formation;

public interface ScolariteRemote extends Remote{
	
	public List<Etudiant> listEtudiant() throws RemoteException;
	public Etudiant getEtudiant(Long id) throws RemoteException;
	public Formation saveFormation(Formation f)  throws RemoteException; 
	

}
