package org.greta.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="p2", types={Etudiant.class})
public interface EtudiantProjection2 {
	
	@Value("#{target.nom} #{target.prenom}")
	public String getfullName();
 
}
