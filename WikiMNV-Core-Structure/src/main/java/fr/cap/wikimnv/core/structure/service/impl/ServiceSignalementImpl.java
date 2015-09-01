package fr.cap.wikimnv.core.structure.service.impl;



import java.util.Set;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.persistance.CrudService;
import fr.cap.wikimnv.core.pojo.Contenu;
import fr.cap.wikimnv.core.pojo.EtatSignalement;
import fr.cap.wikimnv.core.pojo.Signalement;
import fr.cap.wikimnv.core.pojo.User;
import fr.cap.wikimnv.core.structure.service.IServiceSignalement;

public class ServiceSignalementImpl implements IServiceSignalement {

	CrudService crud;
	public ICRUD getsCrud() {return crud;}
	public void setsCrud(ICRUD sCrud) {this.crud = sCrud;}
	
	

	private Signalement changerEtat(EtatSignalement etat, Object key) throws MNVException {
		Signalement sig = (Signalement) crud.lire(key, Signalement.class);
		sig.setEtat(etat);

		return (Signalement)crud.sauver(sig);		
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
		return crud.lister(cl);
	}


	@Override
	public Object lire(Object key, Class cl) throws MNVException {
		return crud.lire(key, cl);
	}


	@Override
	public Object supprimer(Object obj) throws MNVException {
		return crud.supprimer(obj);
	}


	@Override
	public Object sauver(Object obj) throws MNVException {
		return crud.sauver(obj);
	}


	@Override
	public void signaler(Contenu contenu, User user) throws MNVException {
		Signalement sig = new Signalement(contenu, user);
		sauver(sig);		
	}
}
