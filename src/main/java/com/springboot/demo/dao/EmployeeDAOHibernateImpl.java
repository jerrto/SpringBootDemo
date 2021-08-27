/*
package com.springboot.demo.dao;

import com.springboot.demo.model.Employee;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeDAO{

    private EntityManager entityManager;

    //set constructor based injection
    @Autowired
    public EmployeeDAOHibernateImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll(int theId) {
        Session sess = entityManager.unwrap(Session.class);
        Employee emp = sess.get(Employee.class, theId);

        List<Employee> employees = query.getResultList();
        return employees;
    }
}
*/
