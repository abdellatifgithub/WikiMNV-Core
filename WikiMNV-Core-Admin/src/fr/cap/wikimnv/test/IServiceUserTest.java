package fr.cap.wikimnv.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.cap.wikimnv.global.domain.pojo.User;

public class IServiceUserTest {

	User userwork;	
	
	@Test
	public void testBannir() {
		userwork = new User();
		userwork.setBannit(true);
		if(!userwork.isBannit()){
			fail("le user n'a pas été bannit");
		}
	}

}
