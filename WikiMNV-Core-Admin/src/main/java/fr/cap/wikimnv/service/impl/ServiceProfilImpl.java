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

	//getters et setter pour IOC Spring
	public IServiceCRUD getIcrud() { return icrud; }
	public void setIcrud(IServiceCRUD icrud) { this.icrud = icrud; }

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

	public Object lire(Object obj, TypeStructure type) throws MNVException {
		return icrud.lire(obj, type);
	}

	public Set<?> lister(TypeStructure type) throws MNVException {
		return icrud.lister(type);
	}

	public Object sauver(Object obj) throws MNVException {
		return icrud.sauver(obj);
	}

	public Object supprimer(Object obj) throws MNVException {
		return icrud.supprimer(obj);
	}

}