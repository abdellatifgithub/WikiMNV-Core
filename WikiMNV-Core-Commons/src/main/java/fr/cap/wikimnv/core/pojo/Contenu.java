package fr.cap.wikimnv.core.pojo;

import java.util.Calendar;
import java.util.Date;

public abstract class Contenu {
	Profil author;
	EtatPublication  etat;
	Date dateCreation;
	Date datePublication;
	String version;
	
	public Contenu(Profil author) {
		super();
		this.author = author;
		this.dateCreation = Calendar.getInstance().getTime();
		this.etat=EtatPublication.BROUILLON;
		this.version="0.1";
	}

	public void setEtat(EtatPublication etat) {
		this.etat = etat;
	}
	
	public EtatPublication getEtat() {
		return etat;
	}
	
	public void setAuthor(Profil author) {
		this.author = author;
	}
	public Profil getAuthor() {
		return author;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDatePublication() {
		return datePublication;
	}

	public void setDatePublication(Date datePublication) {
		this.datePublication = datePublication;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
}
