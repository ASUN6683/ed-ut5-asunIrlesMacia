package com.gestionestudiantes;

public class Student {
    private String name;
    private int age;
    private int altura; // Mod

    public Student(String name, int age, int altura) {
        this.name = name;
        this.age = age;
        this.altura = altura; // Mod
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public int getAltura() { return altura; } //Mod
}
