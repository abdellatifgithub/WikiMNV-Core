package fr.cap.wikimnv.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.pojo.Profil;
import fr.cap.wikimnv.core.pojo.Query;
import fr.cap.wikimnv.core.pojo.TypeStructure;
import fr.cap.wikimnv.service.IServiceProfil;

public class ServiceProfilImpl implements IServiceProfil {

	// Besoin du service persistence
	IServiceCRUD icrud;

	public IServiceCRUD getIcrud() {
		return icrud;
	}

	public void setIcrud(IServiceCRUD icrud) {
		this.icrud = icrud;
	}

	// constructeur
	public ServiceProfilImpl() {
		super();
	}

	public int countArticlesEcris(Profil p) throws MNVException {

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("pId", p.getId());

		return (int) icrud.faireRequete(Query.PROFIL_COUNTARTICLESECRIT, params);
	}

	public int ranking(Profil p) throws MNVException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("pId", p.getId());

		return (int) icrud.faireRequete(Query.PROFIL_RANKING, params);
	}

	public void updateAvatar(String urlAvatar, Profil profil)
			throws MNVException {
		profil.setAvatar(urlAvatar);
		icrud.sauver(profil);
	}

	public Object lire(Object arg0, TypeStructure arg1) throws MNVException {
		
		return null;
	}

	public Set<?> lister(TypeStructure arg0) throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}

	public Object sauver(Object arg0) throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}

	public Object supprimer(Object arg0) throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}


}