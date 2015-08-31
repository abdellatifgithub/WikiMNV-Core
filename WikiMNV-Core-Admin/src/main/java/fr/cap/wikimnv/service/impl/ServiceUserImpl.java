package fr.cap.wikimnv.service.impl;

import java.util.Set;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.pojo.TypeStructure;
import fr.cap.wikimnv.core.pojo.User;
import fr.cap.wikimnv.service.IServiceUser;


public class ServiceUserImpl implements IServiceUser {

	// Besoin du service persistence
	IServiceCRUD icrud;

	//getters et setter pour IOC Spring
	public IServiceCRUD getIcrud() { return icrud; }
	public void setIcrud(IServiceCRUD icrud) { this.icrud = icrud; }
	
	
	public void bannir(Object id) {
		User u = (User)id;
		u.setBannit(true);		
	}

	public Object lire(Object obj, TypeStructure type) throws MNVException {
		return icrud.lire(obj, type);
	}

	public Set<?> lister(TypeStructure type) throws MNVException {
		return icrud.lister(type);
	}

	public Object sauver(Object obj) throws MNVException {
		return icrud.sauver(obj);
	}

	public Object supprimer(Object obj) throws MNVException {
		return icrud.supprimer(obj);
	}


}
