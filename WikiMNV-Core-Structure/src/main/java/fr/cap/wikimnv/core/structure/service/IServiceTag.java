package fr.cap.wikimnv.contribution.service;

import java.util.Set;

import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.domain.pojo.Tag;
import fr.cap.wikimnv.global.service.ICRUDGeneric;


public interface IServiceTag extends ICRUDGeneric{
	
	/**
	 * Liste les tags contenant le texte sélectionné.
	 * @param setTag
	 * @param libelle
	 * @return
	 */
	Set<Tag> rechercheTextuelle(String libelle) throws MNVException;
}

