package fr.cap.wikimnv.core.structure.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.persistance.CrudService;
import fr.cap.wikimnv.core.pojo.Query;
import fr.cap.wikimnv.core.pojo.Tag;
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

	@Override
	public Set<?> lister(Class cls) throws MNVException {
		return crud.lister(Tag.class);
	}

	@Override
	public Object lire(Object obj, Class cls) throws MNVException {
		return crud.lire(obj, Tag.class);
	}

	@Override
	public Object supprimer(Object obj) throws MNVException {
		return crud.supprimer(obj);
	}

	@Override
	public Object sauver(Object obj) throws MNVException {
		return crud.sauver(obj);
	}

	@Override
	public Set<Tag> rechercheTextuelle(String libelle) throws MNVException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("pTexte", libelle);
		return (Set<Tag>) crud.faireRequete(Query.TAG_RECHERCHETEXTUELLE, params);
		
	}
	
	
}
