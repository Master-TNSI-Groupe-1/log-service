package ServiceLog.Repository;

import ServiceLog.Entity.Location;
import org.springframework.data.repository.CrudRepository;


public interface LocationRepository extends CrudRepository<Location,Integer> {
}
