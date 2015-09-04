package fr.cap.wikimnv.core.persistance.domain.dao.impl;

import java.util.List;
import java.util.Set;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.persistance.domain.dao.IDAOGenric;
import fr.cap.wikimnv.core.pojo.TypeStructure;


public class DaoMongoDB implements IDAOGenric {

	public Set<?> getAll(TypeStructure cls)  throws MNVException{
		
		return null;
	}

	public Object get(Object obj, TypeStructure cls) throws MNVException {
		return null;
	}

	public Object delete(Object obj) throws MNVException {
		
		return null;
	}

	public Object saveOrUpdate(Object obj) throws MNVException {
		
		return null;
	}

	
	/**
	 * redefinition de la methode executeQuery en provenance de l'interface IDAOGeneric
	 * cette methode permettra de faire des requetes paramatrées (attribut query)
	 */
	public List<?> executeQuery(String laVraiRequette) throws MNVException {
		
		return null;
	}

	


}
