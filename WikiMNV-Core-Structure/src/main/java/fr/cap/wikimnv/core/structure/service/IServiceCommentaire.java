package fr.cap.wikimnv.core.structure.service;

import fr.cap.wikimnv.core.commons.ICRUDGeneric;
import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.pojo.Commentaire;
import fr.cap.wikimnv.core.pojo.EtatPublication;


public interface IServiceCommentaire extends ICRUDGeneric {
	Commentaire banir(Commentaire commentaire,  EtatPublication etat) throws MNVException ;
	}
