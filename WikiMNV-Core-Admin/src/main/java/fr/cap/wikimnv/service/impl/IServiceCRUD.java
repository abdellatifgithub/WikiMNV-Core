package fr.cap.wikimnv.service.impl;

import java.util.Map;

import fr.cap.wikimnv.core.commons.ICRUDGeneric;
import fr.cap.wikimnv.core.pojo.Profil;
import fr.cap.wikimnv.core.pojo.Query;
//impleme bouchon en attente de persistence
public interface IServiceCRUD extends ICRUDGeneric{

	int faireRequete(Query profilRanking, Map<String, Object> params);

	void sauver(Profil profil);

}
