package fr.cap.wikimnv.global.domain.pojo;

import java.util.HashMap;
import java.util.Map;



public class Commentaire extends Contenu {     
	Template template;
	Map<String, Object> metaValeurs;
	public Commentaire(Profil author,Template template) {
		super(author);
		this.template=template;
		metaValeurs =new HashMap<String, Object>();
	}
	public void ajouterAttributDuContenu(String metaAttribut, Object valeurAttribut ) {
		metaValeurs.put(metaAttribut, valeurAttribut);
	}
}     
