package be.intebrussel;

import model.Cavia;
import model.CaviaCategory;
import model.Owner;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasourcelocal");
        EntityManager em = emf.createEntityManager();


        em.getTransaction();

        EntityTransaction tx = em.getTransaction();

        Owner owner = new Owner();
        owner.setAdress(" Rue de La Semence nr39/9 1080 ");
        owner.setTelephoneNumber(" 0486/589816 ");

        Owner owner2 = new Owner();
        owner2.setAdress(" Rue de laiterie nr10 1060 ");
        owner2.setTelephoneNumber(" 02/4101794 ");

        Cavia cavia = new Cavia();
        cavia.setGender("Male");
        cavia.setColor("Brown");
        cavia.setWeight("1kg");
        cavia.setBirthDay(LocalDate.now());

        Cavia cavia2 = new Cavia();
        cavia2.setGender("Female");
        cavia2.setColor("White");
        cavia2.setWeight("0,5kg");
        cavia2.setBirthDay(LocalDate.now());


        CaviaCategory caviaCategory = new CaviaCategory();
        caviaCategory.setName("Hamster");

        caviaCategory.addCavia(cavia);
        caviaCategory.addCavia(cavia2);

        owner.setCavia(cavia);
        owner2.setCavia(cavia2);

        tx.begin();
        em.persist(owner);
        em.persist(owner2);
        tx.commit();


        em.close();
        emf.close();

    }
}
