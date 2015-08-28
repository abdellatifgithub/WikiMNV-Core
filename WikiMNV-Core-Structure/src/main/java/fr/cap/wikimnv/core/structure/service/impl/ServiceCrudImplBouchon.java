package fr.cap.wikimnv.core.structure.service.impl;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.management.Query;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.structure.service.IServiceCRUD;


public class ServiceCrudImplBouchon implements IServiceCRUD {

	Map<String, Object> pseudobase;
	
	public ServiceCrudImplBouchon() {
		super();
		pseudobase = new HashMap<String, Object>();
	}


	public Set<?> lister(Class cls) {
		Set<Object> hs = new HashSet<Object>();
		
		for (Object o : pseudobase.values())
		{
			hs.add(o);
		}
		
		return hs;
	}

	public Object lire(Object key, Class cls) throws MNVException {	
		return pseudobase.get(key);
	}
	
	
	public Object supprimer(Object obj) {
		return pseudobase.remove(obj);
	}


	public Object sauver(Object obj) {
		
		pseudobase.put(obj.toString(), obj);
		return obj;
	}

	public Object faireRequete(Query query, Map<String, Object> params) throws MNVException{
		Object data = new Object();
		return data;
	}

	

}
