package com.gestionestudiantes;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        // Crear estudiantes
        Student student1 = new Student("Juan", 20);
        Student student2 = new Student("Maria", 22);

        // Agregar estudiantes al gestor
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);

        // Obtener y mostrar la lista de estudiantes
        System.out.println("Lista de Estudiantes:");
        for (Student student : studentManager.getStudents()) {
            System.out.println("Nombre: " + student.getName() + ", Edad: " + student.getAge());
        }
    }
}
