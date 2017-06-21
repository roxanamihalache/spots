package systems.ab4.workshop.spots.domain.spot;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Alexandru Artimon
 * @since 19/06/2017.
 */
@RepositoryRestResource
public interface SpotRepository extends CrudRepository<Spot, Long> {
}
