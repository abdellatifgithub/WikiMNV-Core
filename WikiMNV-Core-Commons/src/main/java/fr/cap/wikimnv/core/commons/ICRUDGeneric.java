package fr.cap.wikimnv.core.commons;

import java.util.Set;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.pojo.TypeStructure;

public interface ICRUDGeneric  {
	
	Set<?> lister(TypeStructure type) throws MNVException ;
	Object lire(Object obj, TypeStructure type)  throws MNVException;
	Object supprimer(Object obj)  throws MNVException;
	Object sauver(Object obj) throws MNVException ;
	
}
