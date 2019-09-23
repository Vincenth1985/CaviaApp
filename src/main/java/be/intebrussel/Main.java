package be.intebrussel;

import model.Cavia;
import model.CaviaCategory;
import model.Owner;
import org.hibernate.Transaction;

import javax.persistence.*;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("datasourcelocal");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        entityManager.getTransaction();


        EntityTransaction tx = entityManager.getTransaction();


        Owner owner = new Owner(new Cavia(new CaviaCategory()));
        entityManager.persist(owner);
        tx.commit();


    }
}
