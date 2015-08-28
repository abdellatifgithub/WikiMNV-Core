package fr.cap.wikimnv.service.impl;

import fr.cap.wikimnv.IServiceUser;
import fr.cap.wikimnv.global.domain.pojo.User;
import fr.cap.wikimnv.global.service.impl.ServiceCrudImpl;


public class ServiceUserImpl extends ServiceCrudImpl implements IServiceUser {

	@Override
	public void bannir(Object id) {
		User u = (User)id;
		u.setBannit(true);		
	}


}
