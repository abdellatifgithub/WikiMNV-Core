package fr.cap.wikimnv.global.service;

import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.domain.pojo.Commentaire;
import fr.cap.wikimnv.global.domain.pojo.EtatPublication;

public interface IServiceCommentaire extends IServiceCRUDGeneric {
	Commentaire banir(Commentaire commentaire,  EtatPublication etat) throws MNVException ;
	}
