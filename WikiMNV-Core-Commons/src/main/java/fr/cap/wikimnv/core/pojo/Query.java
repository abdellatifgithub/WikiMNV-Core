package fr.cap.wikimnv.core.pojo;

public enum Query {
		
	/**
	 * Définition des requetes
	 * nommage genérique, à parser sur les "_"
	 * pour defenir comment construire nos requetes
	 */
	PROFIL_SELECT_COUNTARTICLESECRIT("select px from profil where py= pz"),
	PROFIL_SELECT_RANKING("comme d'hab requete pour avoir le ranking d'un profil"),
	TAG_RECHERCHETEXTUELLE("bouge toi le cul thierry");
	
	private String value;
	
	private Query(String value){
		this.value=value;
	}

	public String getValue() {
		return value;
	}

}
