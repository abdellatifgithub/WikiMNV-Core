package fr.cap.wikimnv.core.structure.service.impl;



import java.util.List;
import java.util.Set;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.persistance.CrudService;
import fr.cap.wikimnv.core.persistance.MNVException_Exception;
import fr.cap.wikimnv.core.pojo.Contenu;
import fr.cap.wikimnv.core.pojo.EtatSignalement;
import fr.cap.wikimnv.core.pojo.Signalement;
import fr.cap.wikimnv.core.pojo.TypeStructure;
import fr.cap.wikimnv.core.pojo.User;
import fr.cap.wikimnv.core.structure.service.IServiceSignalement;

public class ServiceSignalementImpl implements IServiceSignalement {

	CrudService crud;
	public CrudService getsCrud() {return crud;}
	public void setsCrud(CrudService sCrud) {this.crud = sCrud;}
	
	

	private Signalement changerEtat(EtatSignalement etat, Object key) throws MNVException, MNVException_Exception {
		Signalement sig = (Signalement) crud.lire(key, TypeStructure.SIGNALEMENT);
		sig.setEtat(etat);

		return (Signalement)crud.sauver(sig);		
	}

	
	public Signalement rejeter(Object id) throws MNVException, MNVException_Exception {
		return changerEtat(EtatSignalement.REJETE, id);
	}
	
	
	public Signalement traiter(Object id) throws MNVException, MNVException_Exception {
		return changerEtat(EtatSignalement.TRAITE, id);
	}


	
	public List<Object> lister(Class cl) throws MNVException, MNVException_Exception {
		return crud.lister(TypeStructure.SIGNALEMENT);
	}


	
	public Object lire(Object key, Class cl) throws MNVException, MNVException_Exception {
		return crud.lire(key, TypeStructure.SIGNALEMENT);
	}


	
	public Object supprimer(Object obj) throws MNVException {
		try {
			return crud.supprimer(obj);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}


	
	public Object sauver(Object obj) throws MNVException {
		try {
			return crud.sauver(obj);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}


	
	public void signaler(Contenu contenu, User user) throws MNVException {
		Signalement sig = new Signalement(contenu, user);
		sauver(sig);		
	}
	@Override
	public Object lire(Object arg0, TypeStructure arg1) throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Set<?> lister(TypeStructure arg0) throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}
}
