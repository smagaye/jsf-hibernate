package sn.ucad.gestionCommerciale.controlleurs;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.PrimeFaces;

import sn.ucad.gestionCommerciale.dao.PersonneDao;
import sn.ucad.gestionCommerciale.dao.impl.PersonneDaoImpl;
import sn.ucad.gestionCommerciale.modeles.Personne;
import sn.ucad.gestionCommerciale.util.SpringUtil;

@ManagedBean(name="connexionBean")
@SessionScoped
public class ConnexionBean {

	private PersonneDao personneDao = (PersonneDaoImpl) SpringUtil.getBean("personneDao");
	
	private String username = "";
     
    private String password = "";
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
   
    public void login() throws IOException {
        FacesMessage message = null;
        boolean loggedIn = false;
        Personne personne = personneDao.connexion(username, password);
        if(personne != null) {
        	FacesContext.getCurrentInstance().getExternalContext().redirect("pages/utilisateurs.xhtml");
            loggedIn = true;
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenu(e)", personne.getNom());
        } else {
        	loggedIn = false;
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Connexion Echouée!", "Nom d'utilisateur ou mot de passe incorrect!");
        }
         
        FacesContext.getCurrentInstance().addMessage(null, message);
        PrimeFaces.current().ajax().addCallbackParam("loggedIn", loggedIn);
    }   
}