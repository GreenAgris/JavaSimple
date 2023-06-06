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
     String toString() {
        return "Material{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", density=" + density +
                ", volume=" + volume +
                ", color='" + color + '\'' +
                '}';
    }
     String getName() {
        return this.name;
    }
     String getDescription() {
        return this.description;
    }
     double getDensity() {
        return this.density;
    }
     double getVolume() {
        return this.volume;
    }
     String getColor() {
        return this.color;
    }
     void setId(long id) {
        this.id = id;
    }
     void setName(String name) {
        this.name = name;
    }
     void setDescription(String description) {
        this.description = description;
    }
     void setDensity(double density) {
        this.density = density;
    }
     void setVolume(double volume) {
        this.volume = volume;
    }
     void setColor(String color) {
        this.color = color;
    }
     public Material() {
    }
     public Material(long id, String name, String description, double density, double volume, String color) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.density = density;
        this.volume = volume;
        this.color = color;
    }
     String getMaterial() {
        return "Material{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", density=" + density +
                ", volume=" + volume +
                ", color='" + color + '\'' +
                '}';
    }
     void setMaterial(long id, String name, String description, double density, double volume, String color) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.density = density;
        this.volume = volume;
        this.color = color;
    }
     String getMaterial(long id, String name, String description, double density, double volume, String color) {
        return "Material{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", density=" + density +
                ", volume=" + volume +
                ", color='" + color + '\'' +
                '}';
    }
     String getMaterial(long id, String

}
