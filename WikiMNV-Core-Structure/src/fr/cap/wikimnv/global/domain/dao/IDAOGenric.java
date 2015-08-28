package fr.cap.wikimnv.global.domain.dao;

import java.util.Set;

import fr.cap.wikimnv.exception.MNVException;

public interface IDAOGenric {

	Set<?> getAll(Class cls) throws MNVException;

	Object get(Object obj) throws MNVException;

	Object delete(Object obj) throws MNVException;

	Object saveOrUpdate(Object obj) throws MNVException;

	Object executeQuery(String laVraiRequette) throws MNVException;

}
