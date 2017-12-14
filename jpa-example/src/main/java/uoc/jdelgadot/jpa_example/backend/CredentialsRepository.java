/**
 * 
 */
package uoc.jdelgadot.jpa_example.backend;

import java.util.List;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

/**
 * @author jdelgadot
 *
 */
@Repository
public interface CredentialsRepository extends EntityRepository<Credentials, Long> {

	public List<Credentials> findByUser(String user);
	
}
