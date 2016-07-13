package com.springcustomer.app.ProcessOnCustomer;

import com.springcustomer.app.CustomerInfo.Customer;
import com.springcustomer.app.CustomerInfo.CustomerObjectId;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;


@Service
public class CustomerImpl extends MappingProcess implements CustomerService {

    @Override
    public List<CustomerObjectId> listAll() {
        return super.listAll();
    }

    @Override
    public Customer getById(Integer id) {return (Customer) super.getById(id);}

    @Override
    public Customer saveOrUpdate(Customer domainObject) {
        return (Customer) super.saveOrUpdate(domainObject);
    }

    @Override
    public void delete(Integer id) {
        super.delete(id);
    }


    @Override
    protected void loadDomainObjects() {
        domainMap = new HashMap<>();

        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setFirstName("Jeff");
        customer1.setLastName("Prevost");
        customer1.setAddressLine1("1 UTSA St");
        customer1.setLastpurchased("Bread and Eggs");
        customer1.setPrice("$10.33");
        customer1.setCity("Houston");
        customer1.setState("Texas");
        customer1.setZipCode("55301");
        customer1.setEmail("jeff.prevost@somewhere.com");

        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setFirstName("Sos");
        customer2.setLastName("Again");
        customer2.setAddressLine1("1 Chavez Blvd");
        customer2.setLastpurchased("Yogurt and Blue Cheese");
        customer2.setPrice("$7.99");
        customer2.setCity("Richardson");
        customer2.setState("Texas");
        customer2.setZipCode("77101");
        customer2.setEmail("sos.again@somewhere.com");

        Customer customer3 = new Customer();
        customer3.setId(3);
        customer3.setFirstName("Junghee");
        customer3.setLastName("Lee");
        customer3.setAddressLine1("1 Portranco Road");
        customer3.setLastpurchased("Noodles and Wine");
        customer3.setPrice("$15.99");
        customer3.setCity("Texas");
        customer3.setState("Dallas");
        customer3.setZipCode("88101");
        customer3.setEmail("junhee.lee@somewhere.com");


        domainMap.put(1, customer1);
        domainMap.put(2, customer2);
        domainMap.put(3, customer3);

    }

}
