package fr.cap.wikimnv.ldap;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

import fr.cap.wikimnv.core.pojo.User;

public class LookupLDAPTest {

	@Test
	public void testFind() throws Exception {
		LookupLDAP ldap = new LookupLDAP();
		User u = (User)ldap.find("thilal", User.class);
		System.out.println(u.getOu());
		System.out.println(u.getDescription());

	}

}
