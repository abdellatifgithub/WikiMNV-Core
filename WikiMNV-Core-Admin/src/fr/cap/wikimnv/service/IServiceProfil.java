package fr.cap.wikimnv.service;

import javax.jws.WebService;

import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.domain.pojo.Profil;
import fr.cap.wikimnv.global.service.IServiceCRUDGeneric;

@WebService(name="profilService", serviceName="profilService")
public interface IServiceProfil extends IServiceCRUDGeneric {

	 //grace à l'heritage de l'ICRUD 
	// possibilité de lister, creer/update/effacer des profils
	
	/**
	 * grace à l'heritage de l'ICRUD 
	 * possibilité de lister, creer/update/effacer des profils
	 */
		
	/**
	 * 
	 * @param profil
	 * @return
	 * renvoi le nombre d'article ecrits par le profil
	 */
	int countArticlesEcris(Profil profil) throws MNVException;
	
	/**
	 * 
	 * @param profil
	 * @return
	 * ranking est la note (la position) d'un profil
	 */
	int ranking(Profil profil) throws MNVException;
	/**
	 * 
	 * @param urlAvatar
	 * @param profil
	 */
	void updateAvatar(String urlAvatar, Profil profil) throws MNVException;

		
}
    