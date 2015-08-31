package fr.cap.wikimnv.contribution.service;

import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.domain.pojo.Template;
import fr.cap.wikimnv.global.service.ICRUDGeneric;


public interface IServiceTemplate extends ICRUDGeneric {
	
	/**
	 * elle permet d'ajouter une metadonnee à mon template
	 * @param template
	 * @param metadonnee
	 */
	public void ajouterMeta(Template template,String metadonnee) throws MNVException;
	
	/**
	 * elle permet de supprimer une metadonnee de mon template
	 * @param template
	 * @param metadonnee
	 */
	public void supprimerMeta(Template template,String metadonnee) throws MNVException;
}
