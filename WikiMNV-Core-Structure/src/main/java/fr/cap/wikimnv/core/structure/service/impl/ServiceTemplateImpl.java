package fr.cap.wikimnv.contribution.service.impl;

import java.util.Set;

import fr.cap.wikimnv.contribution.service.IServiceTemplate;
import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.domain.pojo.Template;
import fr.cap.wikimnv.global.service.ICRUD;


public class ServiceTemplateImpl implements IServiceTemplate {
	
	ICRUD sCrud;
	
	public ICRUD getsCrud() {
		return sCrud;
	}

	public void setsCrud(ICRUD sCrud) {
		this.sCrud = sCrud;
	}

	@Override
	public void ajouterMeta(Template template, String metadonnee) throws MNVException {
		template.getMeta().add(metadonnee);
		this.sauver(template);
	}

	@Override
	public void supprimerMeta(Template template, String metadonnee) throws MNVException{
		template.getMeta().remove(metadonnee); 
		this.sauver(template);
	}

	@Override
	public Object lire(Object obj, Class cls) throws MNVException {
		// TODO Auto-generated method stub
		return sCrud.lire(obj, Template.class);
	}

	@Override
	public Set<?> lister(Class cls) throws MNVException {
		// TODO Auto-generated method stub
		return sCrud.lister(Template.class);
	}

	@Override
	public Object sauver(Object obj) throws MNVException {
		// TODO Auto-generated method stub
		return sCrud.sauver(obj);
	}

	@Override
	public Object supprimer(Object obj) throws MNVException {
		// TODO Auto-generated method stub
		return sCrud.supprimer(obj);
	}

}
