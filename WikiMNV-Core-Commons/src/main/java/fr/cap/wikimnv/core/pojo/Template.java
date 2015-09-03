package fr.cap.wikimnv.core.pojo;

import java.util.List;

public class Template {
	String nom;
	List<String> meta;
	
	public Template(String nom, List<String> meta) {
		this.nom = nom;
		this.meta = meta;
	}
	
	public List<String> getMeta() {
		return meta;
	}
	
	/*public Template(String nom) {
		this.nom=nom;
		this.meta= new HashSet<String>();
	}
	
	public Set<String> getMeta() {
		return meta;
	}*/
}
