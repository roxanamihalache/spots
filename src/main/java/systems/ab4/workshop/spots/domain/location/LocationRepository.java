package systems.ab4.workshop.spots.domain.location;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Alexandru Artimon
 * @since 19/06/2017.
 */
public interface LocationRepository extends CrudRepository<Location, Long> {
    List<Location> findByName(String name);
}
