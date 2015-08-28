package fr.cap.wikimnv.service.impl;



public class ServiceTransverseImpl implements IServiceTransverse {
/**
 * 	concrétisation du centre de service <br/>
 * 	implementation de l'interface ITransverse <br/>
 */
	
	@Override
	public IServiceUser getServiceUser() {
		return new ServiceUserImpl();
	}

	public IServiceProfil getServiceProfil() {
		return new ServiceProfilImpl();
	}


}
