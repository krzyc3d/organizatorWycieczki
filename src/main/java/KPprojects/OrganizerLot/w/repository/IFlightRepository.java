package KPprojects.OrganizerLot.w.repository;

import KPprojects.OrganizerLot.w.entity.Flight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFlightRepository extends CrudRepository<Flight,Long> {

}
