package fr.cap.wikimnv.core.pojo;

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
