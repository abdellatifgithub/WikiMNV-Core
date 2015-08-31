package fr.cap.wikimnv.core.structure.service;

import fr.cap.wikimnv.core.commons.ICRUDGeneric;
import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.pojo.Template;



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
