package fr.cap.wikimnv.service;

import service.IServiceProfil;
import service.IServiceUser;
import fr.cap.wikimnv.exception.MNVException;


public interface IServiceTransverse {
	
	/**
	 * 	// Interface exposants les différents services de global <br/>
	 *  // véritable centre de service <br/>
	 *  // HUB ou multiprise de services en qq sorte
	 */
	
	IServiceUser getServiceUser() throws MNVException;
	IServiceProfil getServiceProfil() throws MNVException;

	
}
