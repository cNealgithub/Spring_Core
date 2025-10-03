package com.springcore.Ci;

public class Animal {
    private int animalId;
    private String name;
    private String habitat;
    private String species;

    public Animal(int animalId, String name, String habitat, String species) {
        this.animalId = animalId;
        this.name = name;
        this.habitat = habitat;
        this.species = species;
    }

    public Animal(int animalId, String name, String habitat) {
        this.animalId = animalId;
        this.name = name;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalId=" + animalId +
                ", name='" + name + '\'' +
                ", habitat='" + habitat + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}
