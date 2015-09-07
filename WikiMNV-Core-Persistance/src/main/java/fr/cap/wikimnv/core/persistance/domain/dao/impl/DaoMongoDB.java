package fr.cap.wikimnv.core.persistance.domain.dao.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

	private DB database;
	private MongoClient mongo;
	//Map regroupant ttes les collections
	private Map<String,JacksonDBCollection> declaredCollections; 

	private DBCollection articleCollection = null;
	private JacksonDBCollection<Article, String> articleCollectionJackson;

	@SuppressWarnings("deprecation")
	public DaoMongoDB() {
		
		mongo = new MongoClient();
		
		declaredCollections = new HashMap<String, JacksonDBCollection>();
		
		database = mongo.getDB("wikimnv");
		 //Collection de contenus (articles + commentaires)
		articleCollection = database.getCollection("contenus");
		articleCollectionJackson = JacksonDBCollection.wrap(articleCollection, Article.class, String.class);
		//TODO Collection de templates		
		
		//TODO Collection de tags		
		
		//TODO Collection de profil		
		
		//TODO Collection de signalements
		
		
		
		


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
		
		if( obj instanceof Article ){
			articleCollectionJackson.insert((Article)obj);
		}
		
	

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
