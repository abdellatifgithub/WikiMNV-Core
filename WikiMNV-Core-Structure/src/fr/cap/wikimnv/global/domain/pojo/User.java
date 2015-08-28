package fr.cap.wikimnv.global.domain.pojo;

public class User {
	
	boolean bannit;

	public void setBannit(boolean b) {
		this.bannit = b;		
	}
	
	public boolean isBannit(){
		return bannit;
	}
	
	public User() {
		setBannit(false);
	}

}
