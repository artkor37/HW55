package com.example.mvc.dao;

import com.example.mvc.model.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public class CarRepositoryImpl implements CarRepository {
    private final SessionFactory sessionFactory;

    @Autowired
    public CarRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public List<Car> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Car", Car.class).getResultList();
    }

    @Override
    @Transactional
    public void save(Car car) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(car);
    }
}
