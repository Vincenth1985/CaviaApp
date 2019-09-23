package model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cavia {


    private String color;
    private String weight;
    private String gender;

    @Id
    CaviaCategory caviaCategory;



    public Cavia(CaviaCategory caviaCategory) {
        this.caviaCategory = caviaCategory;
    }

    public void setCaviaCategory(CaviaCategory caviaCategory) {
        this.caviaCategory = caviaCategory;
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
