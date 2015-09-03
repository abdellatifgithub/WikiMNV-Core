package fr.cap.wikimnv.core.pojo;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Article extends Contenu {     
	@XmlTransient
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
