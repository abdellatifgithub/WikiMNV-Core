package fr.cap.wikimnv.service.cli;

import fr.cap.wikimnv.service.ProfilService;
import fr.cap.wikimnv.service.ProfilService_Service;

public class ServiceProfilCli {

	ProfilService profilService = null;

	public ServiceProfilCli() {
		if (profilService == null) {
			profilService = (new ProfilService_Service()).getProfilServicePort();
		}
	}

}
