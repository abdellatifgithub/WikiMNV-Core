package fr.cap.wikimnv.core.pojo;

import java.util.HashSet;
import java.util.Set;

public class Template {
	String nom;
	Set<String> meta;
	
	public Template(String nom) {
		this.nom=nom;
		this.meta= new HashSet<String>();
	}
	
	public Set<String> getMeta() {
		return meta;
	}
}
