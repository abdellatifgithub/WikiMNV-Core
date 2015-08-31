package fr.cap.wikimnv.contribution.service.impl;

import java.util.Set;

import fr.cap.wikimnv.contribution.service.IServiceArticle;
import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.domain.pojo.Article;
import fr.cap.wikimnv.global.domain.pojo.EtatPublication;
import fr.cap.wikimnv.global.service.ICRUD;

public class ServiceArticleImpl implements IServiceArticle {
	ICRUD sCrud;

	public void changerEtat(EtatPublication etatPublication, Object idArticle) throws MNVException {
		Article article = (Article) sCrud.lire(idArticle, Article.class);
		article.setEtat(etatPublication);
	}

	public Set<?> lister(Class cl) throws MNVException {
		// TODO Auto-generated method stub
		return sCrud.lister(cl);
	}

	/**
	 * @param idArticle
	 * @throws MNVException
	 */

	public Object supprimer(Object idArticle) throws MNVException {
		// TODO Auto-generated method stub
		return sCrud.supprimer(idArticle);
	}

	public Object sauver(Object idArticle) throws MNVException {
		// TODO Auto-generated method stub
		return sCrud.sauver(idArticle);
		// passer l'id et le type
	}

	public ICRUD getsCrud() {
		return sCrud;
	}

	public void setsCrud(ICRUD sCrud) {
		this.sCrud = sCrud;
	}

	public Object lire(Object idArticle, Class cls) throws MNVException {
		return sCrud.lire(idArticle, Article.class);
		// TODO Auto-generated method stub

	}

}
