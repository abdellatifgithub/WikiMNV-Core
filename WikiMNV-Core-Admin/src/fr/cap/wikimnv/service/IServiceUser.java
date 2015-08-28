package fr.cap.wikimnv.service;

import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.service.IServiceCRUDGeneric;


public interface IServiceUser extends IServiceCRUDGeneric {
		
	void bannir(Object id) throws MNVException;
		
}
