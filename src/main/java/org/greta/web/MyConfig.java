package org.greta.web;

import org.glassfish.jersey.server.ResourceConfig;
import org.greta.rmi.ScolariteRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;
import org.springframework.remoting.rmi.RmiServiceExporter;

@Configuration
public class MyConfig {

	//@Bean
	//POUR LE DEPLOIMENT DE JERSEY
	public ResourceConfig getJersey() {
		
     	ResourceConfig config=new ResourceConfig();
		config.register(EtudiantJAXRS.class);
		return config;
	
	}
  
	
	 //POUR DEPLOYER JAXWS SAOP 
	//@Bean
	public SimpleJaxWsServiceExporter getJWS() {
		
		SimpleJaxWsServiceExporter exporter=new SimpleJaxWsServiceExporter();
		exporter.setBaseAddress("http://0.0.0.0:8585/service");
		return exporter;	
		
	}
	//POUR DEPLOYER RMI REMOTE METHODE INVOCATION
	//@Bean
	//@Autowired
	public RmiServiceExporter getRmiExporter(ScolariteRemote rmiService) {
		
		RmiServiceExporter exporter= new RmiServiceExporter();
		exporter.setRegistryPort(1099);
		exporter.setServiceName("Scolarite");
		exporter.setService(rmiService);
		return exporter;
	}
	
}
