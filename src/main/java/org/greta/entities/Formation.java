package org.greta.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Entity
@XmlAccessorType(XmlAccessType.FIELD)

public class Formation implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String nom_formation;
	private int duree;
	//@OneToMany(mappedBy="formation")
	@JsonIgnore
	@XmlTransient
	@OneToMany(mappedBy="formation",fetch=FetchType.EAGER)
	private Collection<Etudiant> etudiants;
	
	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Formation(long id, String nom_formation, int duree, Collection<Etudiant> etudiants) {
		super();
		this.id = id;
		this.nom_formation = nom_formation;
		this.duree = duree;
		this.etudiants = etudiants;
	}

	public Formation(String nom_formation, int duree, Collection<Etudiant> etudiants) {
		super();
		this.nom_formation = nom_formation;
		this.duree = duree;
		this.etudiants = etudiants;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom_formation() {
		return nom_formation;
	}

	public void setNom_formation(String nom_formation) {
		this.nom_formation = nom_formation;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public Collection<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(Collection<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	
	
	
	
	
}
