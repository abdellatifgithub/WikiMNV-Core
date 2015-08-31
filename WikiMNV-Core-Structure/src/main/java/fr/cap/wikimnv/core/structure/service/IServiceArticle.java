package fr.cap.wikimnv.core.structure.service;

import fr.cap.wikimnv.core.commons.ICRUDGeneric;
import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.pojo.EtatPublication;



public interface IServiceArticle extends ICRUDGeneric {
	/**
	 * elle permet de changer l'etat de mon article
	 * les �tats possible :<br/>
	 * -Publi� <br/>
	 * -Archiv�<br/>
	 * -Brouillon "�tat initial"
	 * @param etatPublication
	 * @param idArticle
	 */
	void changerEtat (EtatPublication etatPublication, Object idArticle)throws MNVException;

}
