package model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Owner {


    @Id
    String telephoneNumber;
    String adress;


    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
