package fr.cap.wikimnv.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.service.IServiceProfil;



public class ServiceProfilImpl implements IServiceProfil {
	
	//TODO faire un getBean pour icrud	
	IServiceCRUD icrud;
		
	//Implem d'un logger
	
	
	public IServiceCRUD getIcrud() { return icrud; }
	public void setIcrud(IServiceCRUD icrud) { this.icrud = icrud; }

	//constructeur
	public ServiceProfilImpl() {
		super();

		
	}

	@Override
	/**
	 * countArticlesEcris()
	 * Methode qui renvoi le nb article ecrits par un profil<br/>
	 */
	public int countArticlesEcris(Profil p) throws MNVException {
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("pId", p.getId());

		return (int) icrud.faireRequete(Query.PROFIL_COUNTARTICLESECRIT, params);
	}

	@Override
	/**
	 * ranking()
	 * Methode qui renvoi la note la position d'un profil
	 */
	public int ranking(Profil p) throws MNVException {		
		Map<String, Object> params=new HashMap<String, Object>();
		params.put("pId", p.getId());

		
		return (int) icrud.faireRequete(Query.PROFIL_RANKING,params);	
	}

	@Override
	/**
	 * updateAvatar()
	 * Methode permettant de mettre à jour l'avatar
	 */
	public void updateAvatar(String urlAvatar, Profil profil) throws MNVException {
			profil.setAvatar(urlAvatar);
			icrud.sauver(profil);	
	}

	@Override
	public Set<?> lister(Class cls) throws MNVException {
		// TODO Auto-generated method stub
		return icrud.lister(cls);
	}

	@Override
	public Object lire(Object obj, Class cls) throws MNVException {
		// TODO Auto-generated method stub
		return icrud.lire(obj, cls);
	}

	@Override
	public Object supprimer(Object obj)  throws MNVException{
		// TODO Auto-generated method stub
		return icrud.supprimer(obj);
	}

	@Override
	public Object sauver(Object obj) throws MNVException {
		// TODO Auto-generated method stub
		return icrud.sauver(obj);
	}

}