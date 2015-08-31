package fr.cap.wikimnv.contribution.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cap.wikimnv.contribution.service.IServiceTag;
import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.domain.pojo.Query;
import fr.cap.wikimnv.global.domain.pojo.Tag;
import fr.cap.wikimnv.global.service.ICRUD;

@Service("sTag")
public class ServiceTagImpl implements IServiceTag {
	
	@Autowired
	ICRUD sCrud;
	
	public ICRUD getsCrud() {
		return sCrud;
	}

	public void setsCrud(ICRUD sCrud) {
		this.sCrud = sCrud;
	}

	@Override
	public Set<?> lister(Class cls) throws MNVException {
		return sCrud.lister(Tag.class);
	}

	@Override
	public Object lire(Object obj, Class cls) throws MNVException {
		return sCrud.lire(obj, Tag.class);
	}

	@Override
	public Object supprimer(Object obj) throws MNVException {
		return sCrud.supprimer(obj);
	}

	@Override
	public Object sauver(Object obj) throws MNVException {
		return sCrud.sauver(obj);
	}

	@Override
	public Set<Tag> rechercheTextuelle(String libelle) throws MNVException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("pTexte", libelle);
		return (Set<Tag>) sCrud.faireRequete(Query.TAG_RECHERCHETEXTUELLE, params);
		
	}
	
	
}
