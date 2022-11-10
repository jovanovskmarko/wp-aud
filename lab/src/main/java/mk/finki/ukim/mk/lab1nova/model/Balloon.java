package mk.finki.ukim.mk.lab1nova.model;

import lombok.Data;

@Data
public class Balloon {
    private String name;
    private String description;
    private Long id;
    private Manufacturer manufacturer;
    //stavi vo konstruktor ako e potrebno

    public Balloon(String name, String description) {
        this.name = name;
        this.description = description;
        this.id = (long)(Math.random()*1000);
    }

    public Balloon(String name, String description,Long id) {
        this.name = name;
        this.description = description;
        this.id = (long)(Math.random()*1000);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
