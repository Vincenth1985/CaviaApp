package be.intebrussel;

import javax.persistence.*;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("datasourcelocal");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction();

    }
}
