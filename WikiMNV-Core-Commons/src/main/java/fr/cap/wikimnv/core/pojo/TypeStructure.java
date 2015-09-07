package fr.cap.wikimnv.core.pojo;

public enum TypeStructure {
	
	ARTICLE("Article"), 
	PROFIL("Profil"), 
	TAG("Tag"), 
	TEMPLATE("Template"), 
	SIGNALEMENT("Signalement");

	private String classe;
	
	private TypeStructure(String classe) {
		this.setClasse(classe);
	}

	public String getClasse() {
		return "fr.cap.wikimnv.core.pojo."+classe;
	}

	private void setClasse(String classe) {
		this.classe = classe;
	}
	
	
	
}
