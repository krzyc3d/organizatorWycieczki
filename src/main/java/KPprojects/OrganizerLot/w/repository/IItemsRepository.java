package KPprojects.OrganizerLot.w.repository;

import KPprojects.OrganizerLot.w.entity.Items;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IItemsRepository extends CrudRepository<Items, Long>{
}
