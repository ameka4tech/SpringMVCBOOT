package com.springcustomer.app.ProcessOnCustomer;

import java.util.List;

/**
 * Created by Ameya on 7/6/2016.
 */
public interface CRUDProvision<R> {

        List<?> listAll();

        R getById(Integer id);

        R saveOrUpdate(R domainObject);

        void delete(Integer id);
    }

