package fr.cap.wikimnv.test.service;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.IServiceCRUDTest;
import test.IServiceProfilTest;
import test.IServiceUserTest;

@RunWith(Suite.class)
@SuiteClasses({ IServiceCRUDTest.class, IServiceProfilTest.class, IServiceUserTest.class })
public class AllTests {
	
	

}
