package fr.cap.wikimnv.service.cli;

import fr.cap.wikimnv.service.ProfilService;
import fr.cap.wikimnv.service.ProfilService_Service;
//Class à implementer pour obtenir le client pour utiliser le @Webservice
public class ServiceProfilCli {

	ProfilService profilService = null;

	public ServiceProfilCli() {
		if (profilService == null) {
			profilService = (new ProfilService_Service()).getProfilServicePort();
		}
	}

}
