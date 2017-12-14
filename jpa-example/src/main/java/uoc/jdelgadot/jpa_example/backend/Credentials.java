package uoc.jdelgadot.jpa_example.backend;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@SuppressWarnings("serial")
@Entity
public class Credentials extends AbstractEntity {

	@NotNull(message = "introduce un usuario")
	private String user;
	
	@NotNull(message = "introduce una contraseña")
	private String pass;
	
	public Credentials() {
		this("","");
	}
	
	public Credentials(String user, String pass) {
		this.user = user;
		this.pass = pass;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	
	
}
