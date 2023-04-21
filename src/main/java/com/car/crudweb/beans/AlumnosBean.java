package com.car.crudweb.beans;

import com.car.crudweb.entities.Alumnos;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import java.util.List;

@Stateless
public class AlumnosBean {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Alumnos> getAlumnos() {
        Query query = entityManager.createQuery("SELECT a FROM Alumnos a");
        List<Alumnos> resultList = query.getResultList();
        return resultList;
    }
}
