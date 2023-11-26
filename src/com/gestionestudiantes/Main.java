package com.gestionestudiantes;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        // Crear estudiantes
        Student student1 = new Student("Juan", 20, 180);
        Student student2 = new Student("Maria", 22, 175);

        //Modificación
        Student student3 = new Student("Pepe", 30, 170);
        Student student4 = new Student("Elena", 25, 172);

        // Agregar estudiantes al gestor
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);

        // Modificación
        studentManager.addStudent(student3);
        studentManager.addStudent(student4);

        // Obtener y mostrar la lista de estudiantes
        System.out.println("Lista de Estudiantes:");
        for (Student student : studentManager.getStudents()) {
            System.out.println("Nombre: " + student.getName() + ", Edad: " + student.getAge() +
                    ", Altura: " + student.getAltura());
        }
    }
}
