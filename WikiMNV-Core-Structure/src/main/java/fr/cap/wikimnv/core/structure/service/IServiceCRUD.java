package fr.cap.wikimnv.core.structure.service;

import java.util.Map;

import javax.jws.WebService;
import javax.management.Query;

import fr.cap.wikimnv.core.commons.exception.MNVException;


@WebService(name="crudService", serviceName="crudService")
public interface IServiceCRUD extends IServiceCRUDGeneric{
	
	Object faireRequete(Query query, Map<String, Object> params) throws MNVException;
	
}
