package service.log.repository;

import service.log.entity.Attendances;
import org.springframework.data.repository.CrudRepository;

public interface AttendancesRepository extends CrudRepository<Attendances,Integer>{

}
