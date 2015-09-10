package fr.cap.wikimnv.service;

import java.util.List;

import javax.jws.WebService;

import fr.cap.wikimnv.core.commons.ICRUDGeneric;
import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.pojo.User;


@WebService(name="userService", serviceName="userService")
public interface IServiceUser extends ICRUDGeneric {
		
	void bannir(Object id) throws MNVException;
	User lookup(String filter) throws MNVException;
}
