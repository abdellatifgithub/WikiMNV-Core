package fr.cap.wikimnv.moderation.service.impl;



import java.util.Set;

import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.domain.pojo.Contenu;
import fr.cap.wikimnv.global.domain.pojo.User;
import fr.cap.wikimnv.global.service.ICRUD;
import fr.cap.wikimnv.moderation.pojo.EtatSignalement;
import fr.cap.wikimnv.moderation.pojo.Signalement;
import fr.cap.wikimnv.moderation.service.IServiceSignalement;

public class ServiceSignalementImpl implements IServiceSignalement {

	ICRUD sCrud;
	public ICRUD getsCrud() {return sCrud;}
	public void setsCrud(ICRUD sCrud) {this.sCrud = sCrud;}
	
	

	private Signalement changerEtat(EtatSignalement etat, Object key) throws MNVException {
		Signalement sig = (Signalement) sCrud.lire(key, Signalement.class);
		sig.setEtat(etat);

		return (Signalement)sCrud.sauver(sig);		
	}

	@Override
	public Signalement rejeter(Object id) throws MNVException {
		return changerEtat(EtatSignalement.REJETE, id);
	}
	
	@Override
	public Signalement traiter(Object id) throws MNVException {
		return changerEtat(EtatSignalement.TRAITE, id);
	}


	@Override
	public Set<?> lister(Class cl) throws MNVException {
		return sCrud.lister(cl);
	}


	@Override
	public Object lire(Object key, Class cl) throws MNVException {
		return sCrud.lire(key, cl);
	}


	@Override
	public Object supprimer(Object obj) throws MNVException {
		return sCrud.supprimer(obj);
	}


	@Override
	public Object sauver(Object obj) throws MNVException {
		return sCrud.sauver(obj);
	}


	@Override
	public void signaler(Contenu contenu, User user) throws MNVException {
		Signalement sig = new Signalement(contenu, user);
		sauver(sig);		
	}
}
