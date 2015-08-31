package fr.cap.wikimnv.service.impl;

import fr.cap.wikimnv.core.pojo.User;




public class ServiceUserImpl extends ServiceCrudImpl implements IServiceUser {
	//besoin de persist
	public void bannir(Object id) {
		User u = (User)id;
		u.setBannit(true);		
	}


}
