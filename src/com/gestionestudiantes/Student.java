package com.gestionestudiantes;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
