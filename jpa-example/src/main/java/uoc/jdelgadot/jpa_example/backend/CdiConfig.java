
package uoc.jdelgadot.jpa_example.backend;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CdiConfig {

    /**
     * Exposes entity manager for CDI tools like DeltaSpike Data
     */
    @Produces
    @Dependent
    @PersistenceContext(unitName = "credentialsdb")
    public EntityManager entityManager;

}