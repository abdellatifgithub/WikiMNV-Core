package fr.cap.wikimnv.core.structure.service;


import java.util.Set;

import fr.cap.wikimnv.core.commons.ICRUDGeneric;
import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.pojo.Tag;


public interface IServiceTag extends ICRUDGeneric{
	
	/**
	 * Liste les tags contenant le texte sélectionné.
	 * @param setTag
	 * @param libelle
	 * @return
	 */
	Set<Tag> rechercheTextuelle(String libelle) throws MNVException;
}

