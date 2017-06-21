package systems.ab4.workshop.spots.domain.location;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * @author Alexandru Artimon
 * @since 19/06/2017.
 */
@RepositoryRestResource
public interface LocationRepository extends CrudRepository<Location, Long> {
    List<Location> findByName(@Param("name") String name);
}
