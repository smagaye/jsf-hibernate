package sn.ucad.gestionCommerciale.controlleurs;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Component;

import sn.ucad.gestionCommerciale.dao.PersonneDao;
import sn.ucad.gestionCommerciale.dao.impl.PersonneDaoImpl;
import sn.ucad.gestionCommerciale.modeles.Personne;
import sn.ucad.gestionCommerciale.util.SpringUtil;

@Component
@ManagedBean
@SessionScoped
public class PersonneBean {
	
	private static PersonneDao personneDao = (PersonneDaoImpl) SpringUtil.getBean("personneDao");

	public List<Personne> personnesList() {
		return personneDao.getPersonnes();
	}

}
