package fr.cap.wikimnv.core.persistance.domain.dao.impl;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.mongojack.JacksonDBCollection;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.persistance.domain.dao.IDAOGenric;
import fr.cap.wikimnv.core.pojo.Article;
import fr.cap.wikimnv.core.pojo.EtatPublication;
import fr.cap.wikimnv.core.pojo.Profil;
import fr.cap.wikimnv.core.pojo.Template;
import fr.cap.wikimnv.core.pojo.TypeStructure;

public class DaoMongoDB implements IDAOGenric {

	private static DB database;
	private static MongoClient mongo;

	private static DBCollection articleCollection;
	private static JacksonDBCollection<Article, String> articleCollectionJackson;

	@SuppressWarnings("deprecation")
	public DaoMongoDB() {
		
		mongo = new MongoClient();
		database = mongo.getDB("wikimnv");
		 
		articleCollection = database.getCollection("contenus");
		articleCollectionJackson = JacksonDBCollection.wrap(articleCollection, Article.class, String.class);
		//articleCollectionJackson.ensureIndex(new BasicDBObject(« email », « 1″), new BasicDBObject(« unique »,« true »));

	}

	public Set<?> getAll(TypeStructure cls) throws MNVException {

		return null;
	}

	public Object get(Object obj, TypeStructure cls) throws MNVException {
		return null;
	}

	public Object delete(Object obj) throws MNVException {

		return null;
	}

	public Object saveOrUpdate(Object obj) throws MNVException {
		Profil author = null;
		Template template = null;
		Article a = new Article(author, template);
		a.ajouterAttributDuContenu("promo", "Blagueurs");
		a.ajouterAttributDuContenu("promo1", "Blagueurs1");
		a.ajouterAttributDuContenu("promo2", "Blagueurs2");
		a.ajouterAttributDuContenu("promo3", "Blagueurs3");
		a.ajouterAttributDuContenu("promo4", "Blagueurs4");
		a.ajouterAttributDuContenu("promo5", "Blagueurs5");
		a.ajouterAttributDuContenu("promo6", "Blagueurs6");
		a.ajouterAttributDuContenu("promo7", "Blagueurs7");
		a.setDateCreation(new Date());
		a.setEtat(EtatPublication.PUBLIE);
		a.setVersion("0.1.22.2.3.4486");
		articleCollectionJackson.insert(a);
		return null;
	}

	/**
	 * redefinition de la methode executeQuery en provenance de l'interface
	 * IDAOGeneric cette methode permettra de faire des requetes paramatrées
	 * (attribut query)
	 */
	public List<?> executeQuery(String laVraiRequette) throws MNVException {

		return null;
	}

}
