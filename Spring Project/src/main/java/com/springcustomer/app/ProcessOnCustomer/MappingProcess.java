package com.springcustomer.app.ProcessOnCustomer;

import com.springcustomer.app.CustomerInfo.CustomerObjectId;
import java.util.*;


public abstract class MappingProcess {
    protected Map<Integer, CustomerObjectId> domainMap;

    public MappingProcess() {
        domainMap = new HashMap<>();
        loadDomainObjects();
    }

    public List<CustomerObjectId> listAll() {
        return new ArrayList<>(domainMap.values());
    }

    public CustomerObjectId getById(Integer id) {
        return domainMap.get(id);
    }

    public CustomerObjectId saveOrUpdate(CustomerObjectId domainObject) {
        if (domainObject != null){

            if (domainObject.getId() == null){
                domainObject.setId(getNextKey());
            }
            domainMap.put(domainObject.getId(), domainObject);

            return domainObject;
        } else {
            throw new RuntimeException("Object Can't be null");
        }
    }

    public void delete(Integer id) {
        domainMap.remove(id);
    }

    private Integer getNextKey(){
        return Collections.max(domainMap.keySet()) + 1;
    }

    protected abstract void loadDomainObjects();

}
