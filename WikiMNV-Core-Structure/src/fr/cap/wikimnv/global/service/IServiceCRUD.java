package fr.cap.wikimnv.global.service;

import java.util.Map;

import javax.jws.WebService;

import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.domain.pojo.Query;

@WebService(name="crudService", serviceName="crudService")
public interface IServiceCRUD extends IServiceCRUDGeneric{
	
	Object faireRequete(Query query, Map<String, Object> params) throws MNVException;
	
}
