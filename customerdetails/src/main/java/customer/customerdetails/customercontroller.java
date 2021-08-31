package customer.customerdetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class customercontroller {
    @Autowired
    private customerrepository repo;
    @GetMapping("/customer/{id}")
    public customer getCompanyById(
        @PathVariable(value = "id") int id)
    {
        return repo.findById(id);
    }
}
