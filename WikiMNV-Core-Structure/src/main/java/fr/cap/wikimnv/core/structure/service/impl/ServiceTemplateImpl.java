package fr.cap.wikimnv.core.structure.service.impl;

import java.util.Set;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.pojo.Template;
import fr.cap.wikimnv.core.structure.service.IServiceTemplate;

public class ServiceTemplateImpl implements IServiceTemplate {
	
	ICRUD sCrud;
	
	public ICRUD getsCrud() {
		return sCrud;
	}

	public void setsCrud(ICRUD sCrud) {
		this.sCrud = sCrud;
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
		return sCrud.lire(obj, Template.class);
	}

	public Set<?> lister(Class cls) throws MNVException {
		// TODO Auto-generated method stub
		return sCrud.lister(Template.class);
	}

	public Object sauver(Object obj) throws MNVException {
		// TODO Auto-generated method stub
		return sCrud.sauver(obj);
	}

	public Object supprimer(Object obj) throws MNVException {
		// TODO Auto-generated method stub
		return sCrud.supprimer(obj);
	}

}
