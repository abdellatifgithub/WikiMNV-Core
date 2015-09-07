package fr.cap.wikimnv.core.persistance.domain.dao.impl;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.mongojack.DBCursor;
import org.mongojack.JacksonDBCollection;

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


	@SuppressWarnings({ "deprecation", "unchecked" })
	public DaoMongoDB() {
		
		mongo = new MongoClient();
		
		declaredCollections = new HashMap<String, JacksonDBCollection>();
		
		
		
		
		database = mongo.getDB("wikimnv");
		
		
		for (TypeStructure c : TypeStructure.values() )
		{
			try {
				collectionFactory(Class.forName(c.getClassEffectiveName()));
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
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

	public Set<?> getAll(Class cls) throws MNVException {
		String nomCollection = cls.getSimpleName().toLowerCase() + 's';
		JacksonDBCollection maJacksonCollection = declaredCollections.get(nomCollection);


		DBCursor cursor = maJacksonCollection.find();

		//System.out.println(cursor.count());
		
		Set<Object> set = new HashSet<Object>();
		
		for (Object o : cursor)
		{
			System.out.println(cls.cast(o));
			set.add(cls.cast(o));
		}
		
		return set;
	}

	public Object get(Object obj, TypeStructure cls) throws MNVException {
		return null;
	}

	public Object delete(Object obj) throws MNVException {

		return null;
	}

	public Object saveOrUpdate(Object obj) throws MNVException {

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
