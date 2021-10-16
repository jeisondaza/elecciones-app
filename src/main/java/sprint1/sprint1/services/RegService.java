package sprint1.sprint1.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sprint1.sprint1.entities.Persons;

@Repository
public interface RegService  extends JpaRepository<Persons, Integer>{
    
}
