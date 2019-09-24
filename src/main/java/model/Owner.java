package model;


import javax.persistence.*;

@Entity
public class Owner {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ownerId;
    private String telephoneNumber;
    private String adress;

    @OneToOne(cascade = CascadeType.ALL)
    private Cavia cavia;

    public Cavia getCavia() {
        return cavia;
    }

    public void setCavia(Cavia cavia) {
        this.cavia = cavia;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
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
