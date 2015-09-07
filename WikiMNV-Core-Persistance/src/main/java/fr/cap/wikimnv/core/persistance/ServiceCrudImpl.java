package fr.cap.wikimnv.core.persistance;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.persistance.domain.dao.IDAOGenric;
import fr.cap.wikimnv.core.persistance.domain.dao.impl.DaoMongoDB;
import fr.cap.wikimnv.core.pojo.Query;
import fr.cap.wikimnv.core.pojo.TypeStructure;

public class ServiceCrudImpl implements IServiceCRUD {
	
	@Autowired
	IDAOGenric dao;

	public IDAOGenric getDao() {
		return dao;
	}
	public void setDao(IDAOGenric dao) {
		this.dao = dao;
	}


	//CONSTRUCTEURS
	public ServiceCrudImpl() {}
	
	
	public Set<?> lister(TypeStructure type) throws MNVException {
		try {
			return dao.getAll(Class.forName(type.getClassEffectiveName()));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public Object supprimer(Object obj)  throws MNVException {
		return dao.delete(obj);
	}

	public Object sauver(Object obj) throws MNVException {
		
		return dao.saveOrUpdate(obj);
	}
	
	public Object lire(Object obj, TypeStructure type) throws MNVException {
		return dao.get(obj, type);
	}


	public List<?> faireRequete(Query query, List<Meta> params)  throws MNVException {
		String vraieRequete = query.getValue();
		for ( Meta meta : params) {
			vraieRequete.replaceAll(":" + meta.getKey(), (String)meta.getValue());
		}
		return dao.executeQuery(vraieRequete);
	}

	



}
