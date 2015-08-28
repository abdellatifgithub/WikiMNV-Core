package fr.cap.wikimnv.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.IServiceProfil;
import service.copy.ServiceProfilImpl;
import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.domain.pojo.Profil;
import fr.cap.wikimnv.global.domain.pojo.Query;
import fr.cap.wikimnv.global.service.IServiceCRUD;

public class IServiceProfilTest {

	Profil pwork;

	//on recupere une implem de serviceProfil pour nos tests
	ServiceProfilImpl serviceProfil;
	
	public IServiceProfilTest() {
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//serviceProfil = (ServiceProfilImpl) applicationContext.getBean("sProfil");
	}
	
	@Test
	public void testCountArticlesEcris() {
		pwork = new Profil();
		try {
			int nbArticles = serviceProfil.countArticlesEcris(pwork);
		} catch (MNVException e) {
			fail("la methode testCountArticlesEcris() genere une erreur");
			e.printStackTrace();
		}
	}

	@Test
	public void testRanking() {
		pwork = new Profil();
		try {
			int ranking = serviceProfil.ranking(pwork);
		} catch (MNVException e) {
			fail("la methode testRanking() genere une erreur");
			e.printStackTrace();
		}
	}

	@Test
	public void testUpdateAvatar() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void testLister() {
		//fail("Not yet implemented");
	}

	@Test
	public void testLire() {
		//fail("Not yet implemented");
	}

	@Test
	public void testSupprimer() {
		//fail("Not yet implemented");
	}

	@Test
	public void testSauver() {
		//fail("Not yet implemented");
	}
	
	

}
