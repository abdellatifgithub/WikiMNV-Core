package fr.cap.wikimnv.core.persistance.domain.dao;

import java.util.List;
import java.util.Set;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.pojo.TypeStructure;


public interface IDAOGenric {

	Set<?> getAll(TypeStructure cls) throws MNVException;

	Object get(Object obj, TypeStructure cls) throws MNVException;

	Object delete(Object obj) throws MNVException;

	Object saveOrUpdate(Object obj) throws MNVException;

	List<?> executeQuery(String laVraiRequette) throws MNVException;

}
