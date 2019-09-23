package be.intebrussel;

import model.Cavia;
import model.CaviaCategory;
import model.Owner;

import javax.persistence.*;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("datasourcelocal");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        entityManager.getTransaction();

        EntityTransaction tx = entityManager.getTransaction();

        Owner owner = new Owner();
        owner.setTelephoneNumber("0486589816");
        owner.setAdress("Rue de la Semence 39 1080");

        Cavia cavia = new Cavia();
        cavia.setWeight("1kg");
        cavia.setColor("Bruin");
        cavia.setGender("Male");

        CaviaCategory caviaCategory = new CaviaCategory();
        caviaCategory.setName("Hamster");

        owner.setCavia(cavia);
        cavia.setCaviaCategory(caviaCategory);


        tx.begin();

        entityManager.persist(owner);

        tx.commit();

        Cavia cavia1 = new Cavia();
        entityManager.persist(cavia1);
        Owner owner1 = new Owner();
        owner1.setCavia(cavia1);


        tx.begin();
        tx.commit();

        entityManager.close();
        entityManagerFactory.close();

    }
}
