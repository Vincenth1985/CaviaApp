package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class CaviaCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CategoryId;
    private String name;

    //one category to many cavias.
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "caviaCategory")
    private List<Cavia> cavias = new ArrayList<>();


    public List<Cavia> getCavias() {
        return cavias;
    }

    public void setCavias(List<Cavia> cavias) {
        cavias = cavias;
    }

    public Integer getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(Integer categoryId) {
        CategoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCavia(Cavia cavia) {
        cavias.add(cavia);
        cavia.setCaviaCategory(this);
    }

    public void removeCavia(Cavia cavia) {
        cavias.remove(cavia);
        cavia.setCaviaCategory(this);
    }
}
