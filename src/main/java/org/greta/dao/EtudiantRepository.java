package org.greta.dao;

import java.util.List;

import org.greta.entities.Etudiant;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface EtudiantRepository extends JpaRepository<Etudiant,Long>{

	/*
	 * @RestResource(path="/parNom")
	 * //@Query("select p from Etudiant p where p.nom like :x") public
	 * Page<Etudiant> findByNomContains(@Param("x")String mc,Pageable pageable);
	 */

}
