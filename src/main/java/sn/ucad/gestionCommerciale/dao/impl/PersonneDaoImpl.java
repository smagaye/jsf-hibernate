package sn.ucad.gestionCommerciale.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import sn.ucad.gestionCommerciale.dao.PersonneDao;
import sn.ucad.gestionCommerciale.modeles.Personne;
import sn.ucad.gestionCommerciale.util.HibernateUtil;

public class PersonneDaoImpl implements PersonneDao {

	private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	@Override
	public List<Personne> getPersonnes() {
		Session session = sessionFactory.openSession();
		List<Personne> personsList = session.createQuery("from Personne").list();
		return personsList;
	}

	@Override
	public Personne connexion(String login, String motpasse) {
		Session session = sessionFactory.openSession();
		Personne personne = session.createQuery("from Personne p WHERE p.login = :login and p.motPasse = :motpasse", Personne.class)
				.setParameter("login", login)
				.setParameter("motpasse", motpasse)
				.uniqueResult();
		return personne;
	}

}
