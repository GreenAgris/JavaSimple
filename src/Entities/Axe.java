package Entities;


import Entities.Materials.Material;

public class Axe {
    Material material;
    Dwarf owner;
    Dwarf creator;
    double weight;
    double length;
    double width;
    String description;
    String name;
    String shape;

    //constructor with given parameters
    public Axe(Material material, Dwarf owner, Dwarf creator, double weight, double length, double width, String description, String name, String shape) {
        this.material = material;
        this.owner = owner;
        this.creator = creator;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.description = description;
        this.name = name;
        this.shape = shape;
    }

    public Axe() {

    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getSharpness() {
        return sharpness;
    }

    public void setSharpness(int sharpness) {
        this.sharpness = sharpness;
    }

    // 0 - 100
    int sharpness;
    // function for sharpness decrease per hit based on material, current sharpness and the material hit
    public int sharpnessDecrease(Material material, Material materialHit){
        //difference between densities of materials halved
        double difference = (materialHit.getDensity() - material.getDensity())/2;
        //if difference is negative, it is set to 0
        if(difference < 0.0){
            difference = 1.0;
        }
        //sharpness is a coefficient to how much sharpness is decreased
        double sharpnessDifference = sharpness - difference ;
        //if the difference is greater than 0, the sharpness is decreased by the difference
        return sharpness - (int)sharpnessDifference;
    }

    public double getWeight() { return weight; }

    //Axe class can be set up using builder pattern
    public static class Builder {
        Material material;
        Dwarf owner;
        Dwarf creator;
        double weight;
        double length;
        double width;
        String description;
        String name;
        String shape;
        int sharpness;

        public Builder setMaterial(Material material) {
            this.material = material;
            return this;
        }

        public Builder setOwner(Dwarf owner) {
            this.owner = owner;
            return this;
        }

        public Builder setCreator(Dwarf creator) {
            this.creator = creator;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder setLength(double length) {
            this.length = length;
            return this;
        }

        public Builder setWidth(double width) {
            this.width = width;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setShape(String shape) {
            this.shape = shape;
            return this;
        }

        public Builder setSharpness(int sharpness) {
            this.sharpness = sharpness;
            return this;
        }

        public Axe build() {
            Axe axe = new Axe();
            axe.material = this.material;
            axe.owner = this.owner;
            axe.creator = this.creator;
            axe.weight = this.weight;
            axe.length = this.length;
            axe.width = this.width;
            axe.description = this.description;
            axe.name = this.name;
            axe.shape = this.shape;
            axe.sharpness = this.sharpness;
            return axe;
        }
    }

}
