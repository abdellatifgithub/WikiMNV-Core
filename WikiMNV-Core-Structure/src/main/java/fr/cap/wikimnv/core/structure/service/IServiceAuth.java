package fr.cap.wikimnv.core.structure.service;

import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.domain.pojo.Profil;


public interface IServiceAuth {
	
	Profil getConnection(String login, String pass) throws MNVException;
	
}
