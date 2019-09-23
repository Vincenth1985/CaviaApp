package model;


import javax.persistence.*;

@Entity
public class Cavia {


    @Id
    @GeneratedValue
    private Integer caviaId;
    private String color;
    private String weight;
    private String gender;

//    @OneToOne
//    private Owner owner;


    @ManyToOne(cascade = CascadeType.PERSIST)
    CaviaCategory caviaCategory;


    public CaviaCategory getCaviaCategory() {
        return caviaCategory;
    }

    public void setCaviaCategory(CaviaCategory caviaCategory) {
        this.caviaCategory = caviaCategory;
    }

    public Integer getCaviaId() {
        return caviaId;
    }

    public void setCaviaId(Integer caviaId) {
        this.caviaId = caviaId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
