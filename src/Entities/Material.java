package Entities;

public abstract class Material {

    long id;
    String name;
    String description;
    double density;
    double volume;
    String color;

    long getId() {
        return this.id;
    }

}
