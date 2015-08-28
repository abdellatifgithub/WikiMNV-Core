package fr.cap.wikimnv.global.domain.dao.impl;

import java.util.Set;

import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.domain.dao.IDAOGenric;


public class DaoMongoDB implements IDAOGenric {

	@Override
	public Set<?> getAll(Class cls)  throws MNVException{
		
		return null;
	}

	@Override
	public Object get(Object obj) throws MNVException {
		
		return null;
	}

	@Override
	public Object delete(Object obj) throws MNVException {
		
		return null;
	}

	@Override
	public Object saveOrUpdate(Object obj) throws MNVException {
		
		return null;
	}

	@Override
	/**
	 * redefinition de la methode executeQuery en provenance de l'interface IDAOGeneric
	 * cette methode permettra de faire des requetes paramatrées (attribut query)
	 */
	public Object executeQuery(String laVraiRequette) throws MNVException {
		
		return null;
	}


}
