package customer.customerdetails;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface customerrepository
    extends CrudRepository<customer,
                           Integer> {
  
    customer findById(int id);
    List<customer> findAll();
    void deleteById(int id);
}
