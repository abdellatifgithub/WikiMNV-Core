package fr.cap.wikimnv.core.structure.service.impl;

import java.util.List;
import java.util.Set;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.persistance.CrudService;
import fr.cap.wikimnv.core.persistance.MNVException_Exception;
import fr.cap.wikimnv.core.persistance.TypeStructure;
import fr.cap.wikimnv.core.pojo.Article;
import fr.cap.wikimnv.core.pojo.EtatPublication;
import fr.cap.wikimnv.core.structure.service.IServiceArticle;

public class ServiceArticleImpl implements IServiceArticle {
	CrudService crud;

	public void changerEtat(EtatPublication etatPublication, Object idArticle) throws MNVException {
		Article article = null;
		try {
			article = (Article) crud.lire(idArticle, TypeStructure.ARTICLE);
		} catch (MNVException_Exception e) {
			e.getMessage();
		}
		article.setEtat(etatPublication);
	}

	public List<Object> lister(Class cl) throws MNVException {
		try {
			return crud.lister(TypeStructure.ARTICLE);
		} catch (MNVException_Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @param idArticle
	 * @throws MNVException
	 */

	public Object supprimer(Object idArticle) throws MNVException {
		// TODO Auto-generated method stub
		try {
			return crud.supprimer(idArticle);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return idArticle;
	}

	public Object sauver(Object idArticle) throws MNVException {
		// TODO Auto-generated method stub
		try {
			return crud.sauver(idArticle);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// passer l'id et le type
		return idArticle;
	}

	public CrudService getsCrud() {
		return crud;
	}

	public void setsCrud(CrudService sCrud) {
		this.crud = sCrud;
	}

	public Object lire(Object idArticle, Class cls) throws MNVException {
		try {
			return crud.lire(idArticle, TypeStructure.ARTICLE);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return cls;

	}

	@Override
	public Object lire(Object arg0, fr.cap.wikimnv.core.pojo.TypeStructure arg1)
			throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<?> lister(fr.cap.wikimnv.core.pojo.TypeStructure arg0)
			throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}

}
