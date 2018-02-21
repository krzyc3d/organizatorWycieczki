package KPprojects.OrganizerLot.w.repository;

import KPprojects.OrganizerLot.w.entity.Flight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITripRepository extends CrudRepository<Flight,Long> {
}
