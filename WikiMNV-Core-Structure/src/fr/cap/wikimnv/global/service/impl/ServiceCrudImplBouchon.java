package fr.cap.wikimnv.global.service.impl;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.domain.pojo.Query;
import fr.cap.wikimnv.global.service.IServiceCRUD;

public class ServiceCrudImplBouchon implements IServiceCRUD {

	Map<String, Object> pseudobase;
	
	public ServiceCrudImplBouchon() {
		super();
		pseudobase = new HashMap<String, Object>();
	}


	@Override
	public Set<?> lister(Class cls) {
		Set<Object> hs = new HashSet<Object>();
		
		for (Object o : pseudobase.values())
		{
			hs.add(o);
		}
		
		return hs;
	}

	@Override
	public Object lire(Object key, Class cls) throws MNVException {	
		return pseudobase.get(key);
	}
	
	
	@Override
	public Object supprimer(Object obj) {
		return pseudobase.remove(obj);
	}


	@Override	
	public Object sauver(Object obj) {
		
		pseudobase.put(obj.toString(), obj);
		return obj;
	}

	@Override
	public Object faireRequete(Query query, Map<String, Object> params) throws MNVException{
		Object data = new Object();
		return data;
	}

	

}
