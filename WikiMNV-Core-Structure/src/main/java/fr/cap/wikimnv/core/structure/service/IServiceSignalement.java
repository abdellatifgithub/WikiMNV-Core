package fr.cap.wikimnv.core.structure.service;



import fr.cap.wikimnv.core.commons.ICRUDGeneric;
import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.pojo.Contenu;
import fr.cap.wikimnv.core.pojo.User;

@WebService(name="signalementService", serviceName="signalementService")
public interface IServiceSignalement extends ICRUDGeneric
{
	void signaler(Contenu contenu, User user) throws MNVException;
	Signalement rejeter(Object id) throws MNVException;
	Signalement traiter(Object id) throws MNVException;
}


