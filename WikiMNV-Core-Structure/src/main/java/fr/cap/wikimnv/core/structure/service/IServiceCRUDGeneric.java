package fr.cap.wikimnv.core.structure.service;

import java.util.Set;
import fr.cap.wikimnv.core.commons.exception.MNVException;

public interface IServiceCRUDGeneric  {
	
	Set<?> lister(Class cls) throws MNVException ;
	Object lire(Object obj, Class cls)  throws MNVException;
	Object supprimer(Object obj)  throws MNVException;
	Object sauver(Object obj) throws MNVException ;
	
}




