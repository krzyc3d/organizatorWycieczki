package KPprojects.OrganizerLot.w.repository;

import KPprojects.OrganizerLot.w.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends CrudRepository<User, Long> {

    Optional<User> findFirstByEmail(String email);
}
