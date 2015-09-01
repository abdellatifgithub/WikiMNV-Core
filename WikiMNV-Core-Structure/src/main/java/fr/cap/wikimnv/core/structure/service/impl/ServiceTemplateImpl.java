package fr.cap.wikimnv.core.structure.service.impl;

import java.util.Set;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.persistance.CrudService;
import fr.cap.wikimnv.core.pojo.Template;
import fr.cap.wikimnv.core.structure.service.IServiceTemplate;

public class ServiceTemplateImpl implements IServiceTemplate {
	
	CrudService crud;
	
	public CrudService getsCrud() {
		return crud;
	}

	public void setsCrud(CrudService sCrud) {
		this.crud = sCrud;
	}

	public void ajouterMeta(Template template, String metadonnee) throws MNVException {
		template.getMeta().add(metadonnee);
		this.sauver(template);
	}

	public void supprimerMeta(Template template, String metadonnee) throws MNVException{
		template.getMeta().remove(metadonnee); 
		this.sauver(template);
	}

	public Object lire(Object obj, Class cls) throws MNVException {
		// TODO Auto-generated method stub
		return crud.lire(obj, Template.class);
	}

	public Set<?> lister(Class cls) throws MNVException {
		// TODO Auto-generated method stub
		return crud.lister(Template.class);
	}

	public Object sauver(Object obj) throws MNVException {
		// TODO Auto-generated method stub
		return crud.sauver(obj);
	}

	public Object supprimer(Object obj) throws MNVException {
		// TODO Auto-generated method stub
		return crud.supprimer(obj);
	}

}
