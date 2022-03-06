package be.thomasmore.project.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Charac {
    @Id
    private Integer id;
    private String advancedClass;
    private String gender;
    private String basicClass;
    private String description;

    public Charac(String advancedClass, String gender, String basicClass, String description) {
        this.advancedClass = advancedClass;
        this.gender = gender;
        this.basicClass = basicClass;
        this.description = description;
    }

    public Charac() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdvancedClass() {
        return advancedClass;
    }

    public void setAdvancedClass(String advancedClass) {
        this.advancedClass = advancedClass;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBasicClass() {
        return basicClass;
    }

    public void setBasicClass(String basicClass) {
        this.basicClass = basicClass;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
