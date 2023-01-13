package tn.enicarthage;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullUser",types=Utilisateur.class)
public interface userProjection {

	public Long getCin();
	public String getNom();
	public String getPrenom();
	public String getDatenaissance();
	public int getNumtelephone();
	public String getSexe();
	public String getAdresse();
	public String getlogin();
	public String getMotdepasse();
}
