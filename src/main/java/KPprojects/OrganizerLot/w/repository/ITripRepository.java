package KPprojects.OrganizerLot.w.repository;

import KPprojects.OrganizerLot.w.entity.Flight;
import KPprojects.OrganizerLot.w.entity.Trip;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITripRepository extends CrudRepository<Trip,Long> {
}
