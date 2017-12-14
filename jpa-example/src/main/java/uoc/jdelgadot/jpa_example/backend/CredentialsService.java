package uoc.jdelgadot.jpa_example.backend;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CredentialsService {

	@Inject CredentialsRepository repo;
	
	@PersistenceContext(unitName="credentialsdb")
	EntityManager em;
	
	
	private static final String[] users = new String[] {"user1", "user2", "user3", "jdelgadot"};
	
	
	public CredentialsService() {
	}
	
	public boolean isValid(String user) {
		return (! repo.findByUser(user).isEmpty());
	}
	
	//@PostConstruct
	public void loadDemoData() {
		for(String user : users) {
			final Credentials credential = new Credentials(user, user + "_pass");
			em.persist(credential);
			em.flush();
		}
	}

}
