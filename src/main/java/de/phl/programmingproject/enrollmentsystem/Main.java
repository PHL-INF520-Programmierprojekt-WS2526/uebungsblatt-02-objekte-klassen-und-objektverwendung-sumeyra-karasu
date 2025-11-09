package de.phl.programmingproject.enrollmentsystem;

import java.util.List;

/**
 * PUT YOUR CODE FOR THE EXERCISE 'STUDENT ENROLLMENT SYSTEM' IN THIS CLASS
 */

public class Main {
    public static void main(String[] args) {

     Student student = new Student("John Doe", "12345");
        Course course1 = new Course("Introduction to Computer Science");

       
        System.out.println(student.getInfo());
        System.out.println(course1.getInfo());
        System.out.println();

        
        Enrollment enrollment = student.enroll(course1);

      
        System.out.println("Nach der Einschreibung:");
        System.out.println(student.getCourses());
        System.out.println(course1.getStudents());
        System.out.println(enrollment.getInfo());
        System.out.println();

        
        enrollment.setGrade(4.0);
        System.out.println("Nach Notenänderung:");
        System.out.println(enrollment.getInfo());
        System.out.println();

       
        Course course2 = new Course("Object-Oriented Programming");
        student.enroll(course2);

      
        System.out.println("Kurse von " + student.getInfo() + ":");
        for (Course c : student.getCourses()) {
            System.out.println("- " + c.getInfo());
        }

        System.out.println("\nStudenten in " + course1.getInfo() + ":");
        for (Student s : course1.getStudents()) {
            System.out.println("- " + s.getInfo());
        }

        student.drop(course1);
        System.out.println("\nNach dem Streichen aus dem ersten Kurs:");
        for (Student s : course1.getStudents()) {
            System.out.println("- " + s.getInfo());
        }
    }
}