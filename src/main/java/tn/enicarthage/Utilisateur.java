package tn.enicarthage;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Utilisateur {
	@Id
	private long cin;
    private String nom;
    private String prenom;
    private String datenaissance;
    private int numtelephone;
    private String sexe;
    private String adresse;
    private String login;
    private String motdepasse;

}
