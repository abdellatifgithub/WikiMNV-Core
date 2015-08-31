package fr.cap.wikimnv.core.structure.service.impl;

import java.util.Set;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.pojo.Commentaire;
import fr.cap.wikimnv.core.pojo.EtatPublication;
import fr.cap.wikimnv.core.structure.service.IServiceCommentaire;


public class ServiceCommentaireImpl implements IServiceCommentaire {
	IServiceCRUD crud ;
	  
	
	public ServiceCommentaireImpl() {
		crud = new ServiceCrudImpl();
		
		
	}
	
	/**
	 * Permet d'obtenir la liste de tous les commentaires
	 *@return  Renvoie la liste des comentaires
	 *@author  Sohail, Messan  
	 */ 
	
	public Set<?> lister() throws MNVException {
		
		return  crud.lister(Commentaire.class) ;
	}
	
	/**
	 * Permet de chargé un commentaire depuis la base
	 * @param Le commentaire à lire
	 * @return  Renvoie le commentaire demandé en paramètre
	 * @author Sohail, Messan
	 */ 

	
	public Object lire(Object commentaire) throws MNVException {
		return crud.lire(commentaire, Commentaire.class) ;
	}
	
	/**
	 * Permet de sauvegarde un commentaire
	 * @param Le commentaire à sauvegarder
	 * @return le commentaire passé en paramètre après le sauvegarde
	 * @author Sohail, Messan
	 * @throws MNVException 
	 */ 

	
	public Object sauver(Object commentaire) throws MNVException {
		return crud.sauver(commentaire) ;
	}
	
	/**
	 * Supprime le commentaire depuis la base passé en paramètre
	 * @param le commentaire à supprimer
	 * @return le commentaire supprimé 
	 * @author Sohail, Messan
	 * @throws MNVException 
	 */

	
	public Commentaire supprimer(Commentaire commentaire) throws MNVException {
		return (Commentaire) crud.supprimer(commentaire) ;
	}

	/**
	 * Permet de publier ou dépublier un commentaire
	 * @param le commentaire à banir
	 * @return le commentaire banis
	 * @author Sohail, Messan
	 * @throws MNVException 
	 */
	
	
	public Commentaire banir(Commentaire commentaire, EtatPublication etat) throws MNVException {
		// Publie ou dépublie un commentaire
		commentaire.setEtat(etat);
		return (Commentaire) sauver(commentaire) ;
	}

	@Override
	public Set<?> lister(Class cls) throws MNVException {
		
		return null;
	}

	@Override
	public Object lire(Object obj, Class cls) throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object supprimer(Object obj) throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}
}
	