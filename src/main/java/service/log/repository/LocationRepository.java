package service.log.repository;

import service.log.entity.Location;
import org.springframework.data.repository.CrudRepository;


public interface LocationRepository extends CrudRepository<Location,Integer> {
}
