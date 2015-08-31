package fr.cap.wikimnv.core.pojo;

import java.util.HashMap;
import java.util.Map;

public class Article extends Contenu {     
	Template template;
	
	Map<String, Object> metaValeurs;
	public Article(Profil author,Template template) {
		super(author);
		this.template=template;
		metaValeurs =new HashMap<String, Object>();
	}
	public void ajouterAttributDuContenu(String metaAttribut, Object valeurAttribut) {
		metaValeurs.put(metaAttribut, valeurAttribut);
	}
}
