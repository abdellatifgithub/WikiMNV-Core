package fr.cap.wikimnv.moderation.service;

import javax.jws.WebService;

import fr.cap.wikimnv.global.domain.pojo.Contenu;
import fr.cap.wikimnv.global.domain.pojo.User;
import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.service.ICRUDGeneric;
import fr.cap.wikimnv.moderation.pojo.Signalement;

@WebService(name="signalementService", serviceName="signalementService")
public interface IServiceSignalement extends ICRUDGeneric
{
	void signaler(Contenu contenu, User user) throws MNVException;
	Signalement rejeter(Object id) throws MNVException;
	Signalement traiter(Object id) throws MNVException;
}
