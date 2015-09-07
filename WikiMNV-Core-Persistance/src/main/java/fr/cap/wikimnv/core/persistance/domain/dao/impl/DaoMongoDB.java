package fr.cap.wikimnv.core.persistance.domain.dao.impl;

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
import fr.cap.wikimnv.core.pojo.Contenu;
import fr.cap.wikimnv.core.pojo.Profil;
import fr.cap.wikimnv.core.pojo.Signalement;
import fr.cap.wikimnv.core.pojo.Tag;
import fr.cap.wikimnv.core.pojo.Template;
import fr.cap.wikimnv.core.pojo.TypeStructure;

public class DaoMongoDB implements IDAOGenric {

	private DB database;
	private MongoClient mongo;
	//Map regroupant ttes les collections
	private Map<String,JacksonDBCollection> declaredCollections; 


	@SuppressWarnings({ "deprecation", "unchecked" })
	public DaoMongoDB() {
		
		mongo = new MongoClient();
		
		declaredCollections = new HashMap<String, JacksonDBCollection>();
		
		
		
		
		database = mongo.getDB("wikimnv");
		
		
		for (Class c : new Class[]{Contenu.class, Template.class, Tag.class, Profil.class, Signalement.class})
		{
			String nomCollection = c.getSimpleName().toLowerCase() + 's';
			DBCollection maCollection = database.getCollection(nomCollection); 
			JacksonDBCollection<Object, String> maJacksonCollection = JacksonDBCollection.wrap(maCollection, c, String.class);
			declaredCollections.put(nomCollection, maJacksonCollection);
		}
		
		
		
		


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
		
		/*
		if( obj instanceof Article ){
			articleCollectionJackson.insert((Article)obj);
		}
		*/
		String nomCollection = obj.getClass().getSimpleName().toLowerCase() + 's';
		JacksonDBCollection maJacksonCollection = declaredCollections.get(nomCollection);
		maJacksonCollection.insert(obj);
	

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
