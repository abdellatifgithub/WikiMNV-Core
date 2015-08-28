package fr.cap.wikimnv.service;

import javax.jws.WebService;

import fr.cap.wikimnv.core.commons.ICRUDGeneric;
import fr.cap.wikimnv.core.commons.exception.MNVException;


@WebService(name="profilUser", serviceName="profilUser")
public interface IServiceUser extends ICRUDGeneric {
		
	void bannir(Object id) throws MNVException;
		
}
