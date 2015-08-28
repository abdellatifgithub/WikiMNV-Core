package fr.cap.wikimnv.service;

import javax.jws.WebService;

import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.service.IServiceCRUDGeneric;

@WebService(name="profilUser", serviceName="profilUser")
public interface IServiceUser extends IServiceCRUDGeneric {
		
	void bannir(Object id) throws MNVException;
		
}
