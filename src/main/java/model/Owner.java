package model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Owner {



    private String telephoneNumber;
    private String adress;

    @Id
    @OneToOne
    private Cavia cavia;


    public Owner() {
    }

    public Owner(Cavia cavia) {
        this.cavia = cavia;
    }

    public Cavia getCavia() {
        return cavia;
    }

    public void setCavia(Cavia cavia) {
        this.cavia = cavia;
    }

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
