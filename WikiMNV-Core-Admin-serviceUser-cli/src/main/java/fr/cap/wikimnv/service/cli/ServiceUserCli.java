package fr.cap.wikimnv.service.cli;

import fr.cap.wikimnv.service.UserService;
import fr.cap.wikimnv.service.UserService_Service;
//Class � implementer pour obtenir le client pour utiliser le @Webservice
public class ServiceUserCli {
	
	UserService userService = null;
	
	public ServiceUserCli() {
		if(userService == null){
			userService = (new UserService_Service()).getUserServicePort();
		}
	}
	

}