package fr.cap.wikimnv.service.impl;

import java.util.Set;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.pojo.TypeStructure;
import fr.cap.wikimnv.core.pojo.User;
import fr.cap.wikimnv.service.IServiceUser;




public class ServiceUserImpl implements IServiceUser {
	//besoin de persist
	public void bannir(Object id) {
		User u = (User)id;
		u.setBannit(true);		
	}

	public Object lire(Object arg0, TypeStructure arg1) throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<?> lister(TypeStructure arg0) throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}

	public Object sauver(Object arg0) throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}

	public Object supprimer(Object arg0) throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}


}
