package model;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Cavia {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer caviaId;
    private String color;
    private String weight;
    private String gender;


    private LocalDate birthDay;


    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private CaviaCategory caviaCategory;


    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

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
