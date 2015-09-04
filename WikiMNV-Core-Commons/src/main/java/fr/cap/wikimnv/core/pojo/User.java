package fr.cap.wikimnv.core.pojo;

import org.mongojack.Id;
import org.mongojack.ObjectId;

public class User {
	
	@Id
	@ObjectId
	public boolean bannit;

	
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
