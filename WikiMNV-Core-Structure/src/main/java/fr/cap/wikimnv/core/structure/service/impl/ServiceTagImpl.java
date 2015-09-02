package fr.cap.wikimnv.core.structure.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.persistance.CrudService;
import fr.cap.wikimnv.core.persistance.MNVException_Exception;
import fr.cap.wikimnv.core.pojo.Query;
import fr.cap.wikimnv.core.pojo.Tag;
import fr.cap.wikimnv.core.pojo.TypeStructure;
import fr.cap.wikimnv.core.structure.service.IServiceTag;


@Service("sTag")
public class ServiceTagImpl implements IServiceTag {
	
	@Autowired
	CrudService crud;
	
	public CrudService getsCrud() {
		return crud;
	}

	public void setsCrud(CrudService sCrud) {
		this.crud = sCrud;
	}

	
	public List<Object> lister(Class cls) throws MNVException, MNVException_Exception {
		return crud.lister(TypeStructure.TAG);
	}

	
	public Object lire(Object obj, Class cls) throws MNVException, MNVException_Exception {
		return crud.lire(obj, TypeStructure.TAG);
	}

	@Override
	public Object supprimer(Object obj) throws MNVException {
		try {
			return crud.supprimer(obj);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public Object sauver(Object obj) throws MNVException {
		try {
			return crud.sauver(obj);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public Set<Tag> rechercheTextuelle(String libelle) throws MNVException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("pTexte", libelle);
		// return (Set<Tag>) crud.faireRequete(Query.TAG_RECHERCHETEXTUELLE, params);
		return null ;
		
	}

	@Override
	public Object lire(Object arg0, TypeStructure arg1) throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<?> lister(TypeStructure arg0) throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
