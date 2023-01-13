package tn.enicarthage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class UserController {

	@Autowired
	UserRepository ur;

	@RequestMapping(value = {"/Login"}, method = {RequestMethod.POST, RequestMethod.GET})
	public RedirectView Logging(@ModelAttribute("l") LoginForm l, Model model)
	{
		try {
		Utilisateur u = ur.rechercherUtilisateurParEmailAndPass(l.getLogin(), l.getMdp());
		if(u!=null) 
			{RedirectView redirectView = new RedirectView();
			redirectView.setUrl("http://localhost:8888/MEDICATION-SERVICE/MedicationAdd.html");
			return redirectView;}
		else {
			RedirectView redirectView = new RedirectView();
			redirectView.setUrl("http://localhost:8888/USERS-SERVICE/home.html");
			return redirectView;
		}
		}catch (Exception e) {
			RedirectView redirectView = new RedirectView();
			redirectView.setUrl("http://localhost:8888/USERS-SERVICE/home.html");
			return redirectView;
	}
	}
}
