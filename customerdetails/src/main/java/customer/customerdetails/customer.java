package customer.customerdetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class customer {
    @Id
    @GeneratedValue(strategy
                    = GenerationType.AUTO)
    int id;
  
    String name;
  
    // In months
   
    String address;
  
    // Can be 0
  
  
    public customer()
    {
    }
  
    // Parameterized constructor
    public customer(String name,
                   String address)
    {
        this.name = name;
        this.address=address;
       
    }
  
    // Getters and setters of
    // the variables
    public int getId()
    {
        return id;
    }
  
    public String getName()
    {
        return name;
    }
  
    public String getaddress()
    {
        return address;
    }
  
  
  
    public void setId(int id)
    {
        this.id = id;
    }

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "customer [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
  