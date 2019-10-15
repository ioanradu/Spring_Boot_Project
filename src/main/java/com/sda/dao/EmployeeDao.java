package com.sda.dao;

import com.sda.entities.Employee;
import com.sda.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ionel Radu on 10/15/2019
 */
@Repository
public class EmployeeDao {

    public List<Employee> displayAllEmployees(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        List<Employee> employeeList = new ArrayList<>();
        try {
            String hql = "from Employee";

            Query query = session.createQuery(hql);
            employeeList = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
        return employeeList;
    }
}
