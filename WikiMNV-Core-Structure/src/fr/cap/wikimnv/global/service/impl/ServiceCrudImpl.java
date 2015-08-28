package fr.cap.wikimnv.global.service.impl;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.domain.dao.impl.DaoMongoDB;
import fr.cap.wikimnv.global.domain.pojo.Query;
import fr.cap.wikimnv.global.service.IServiceCRUD;

public class ServiceCrudImpl implements IServiceCRUD {
	
	DaoMongoDB dao = new DaoMongoDB();
		
	//CONSTRUCTEURS
	public ServiceCrudImpl() {}
	
	
	@Override
	public Set<?> lister(Class cls) throws MNVException {
		return dao.getAll(cls);
	}

	@Override
	public Object supprimer(Object obj)  throws MNVException {
		return dao.delete(obj);
	}

	@Override
	public Object sauver(Object obj) throws MNVException {
		return dao.saveOrUpdate(obj);
	}
	
	@Override
	public Object lire(Object obj, Class cls) throws MNVException {
		return dao.get(obj);
	}


	@Override
	public Object faireRequete(Query query, Map<String, Object> params)  throws MNVException {
		String vraiRequete = query.getValue();
		for ( Entry<String, Object> tupleCleValeur : params.entrySet()) {
			vraiRequete.replaceAll(tupleCleValeur.getKey(), (String)tupleCleValeur.getValue());
		}
		return dao.executeQuery(vraiRequete);
	}

}
