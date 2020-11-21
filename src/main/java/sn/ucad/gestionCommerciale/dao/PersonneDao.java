package sn.ucad.gestionCommerciale.dao;

import java.util.List;

import sn.ucad.gestionCommerciale.modeles.Personne;

public interface PersonneDao {

	public List<Personne> getPersonnes();
	
	public Personne connexion(String login, String password);

}
