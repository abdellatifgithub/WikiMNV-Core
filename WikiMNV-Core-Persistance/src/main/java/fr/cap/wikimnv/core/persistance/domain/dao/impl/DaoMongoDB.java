package fr.cap.wikimnv.core.persistance.domain.dao.impl;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.mongojack.DBCursor;
import org.mongojack.JacksonDBCollection;
import org.springframework.stereotype.Component;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.persistance.domain.dao.IDAOGenric;
import fr.cap.wikimnv.core.pojo.Article;
import fr.cap.wikimnv.core.pojo.Contenu;
import fr.cap.wikimnv.core.pojo.Profil;
import fr.cap.wikimnv.core.pojo.Signalement;
import fr.cap.wikimnv.core.pojo.Tag;
import fr.cap.wikimnv.core.pojo.Template;
import fr.cap.wikimnv.core.pojo.TypeRecherche;
import fr.cap.wikimnv.core.pojo.TypeStructure;


public class DaoMongoDB implements IDAOGenric {

	private DB database;
	private MongoClient mongo;
	//Map regroupant ttes les collections
	private Map<String,JacksonDBCollection> declaredCollections; 


	
	public DaoMongoDB() {
		
		mongo = new MongoClient();		
		declaredCollections = new HashMap<String, JacksonDBCollection>();				
		database = mongo.getDB("wikimnv");
		
		for (TypeStructure c : TypeStructure.values() )
		{
			try {
				collectionFactory(Class.forName(c.getClassEffectiveName()));
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		 }
		
	 }
	

	private void collectionFactory(Class c) {
		String nomCollection = c.getSimpleName().toLowerCase() + 's';
		DBCollection maCollection = database.getCollection(nomCollection); 
		JacksonDBCollection<Object, String> maJacksonCollection = JacksonDBCollection.wrap(maCollection, c, String.class);
		declaredCollections.put(nomCollection, maJacksonCollection);
	}

	
	public synchronized Set<?> getAll(Class cls) throws MNVException {
		String nomCollection = cls.getSimpleName().toLowerCase() + 's';
		JacksonDBCollection maJacksonCollection = declaredCollections.get(nomCollection);

		DBCursor cursor = maJacksonCollection.find();
		
		Set returnSet = new HashSet();
		
		for (Object o : cursor)
		{
			System.out.println(cls.cast(o));
			returnSet.add(cls.cast(o));
		}
		
		return returnSet;
	}

	
	public Object saveOrUpdate(Object obj) throws MNVException {
		String nomCollection = obj.getClass().getSimpleName().toLowerCase() + 's';
		JacksonDBCollection maJacksonCollection = declaredCollections.get(nomCollection);
		maJacksonCollection.insert(obj);
	
		return null;
	}
	
	public Object get(Object id, Class cls) throws MNVException {
		
		return null;
	}

	
	public Object delete(Object id, Class cls) throws MNVException {
		
		return null;
	}

	
	public List<?> executeQuery(String laVraiRequette) throws MNVException {

		return null;
	}

	
	


	

}
