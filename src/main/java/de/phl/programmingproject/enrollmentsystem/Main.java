package de.phl.programmingproject.enrollmentsystem;

import java.util.List;

/**
 * PUT YOUR CODE FOR THE EXERCISE 'STUDENT ENROLLMENT SYSTEM' IN THIS CLASS
 */


public class Main {
    public static void main(String[] args) {

    // 1) Student anlegen
        Student john = new Student("John Doe", "12345");

        // 2) Kurs anlegen
        Course introCS = new Course("Einführung in die Informatik");

        // 3) Infos ausgeben
        System.out.println("Student-Info: " + john.getInfo());
        System.out.println("Kurs-Info: " + introCS.getInfo());

        // 4) In Kurs einschreiben und Enrollment speichern
        Enrollment enrollment1 = john.enroll(introCS);

        // 5) Erneut Infos ausgeben
        System.out.println("Student nach Einschreibung: " + john.getInfo());
        System.out.println("Kurs nach Einschreibung: " + introCS.getInfo());

        // 6) Enrollment-Infos ausgeben
        System.out.println(enrollment1.getInfo());

        // 7) Note setzen
        enrollment1.setGrade(4.0);

        // 8) Enrollment-Infos erneut ausgeben
        System.out.println(enrollment1.getInfo());

        // 9) Weiteren Kurs anlegen
        Course oop = new Course("Objektorientierte Programmierung");

        // 10) In neuen Kurs einschreiben
        john.enroll(oop);

        // 11) Liste der Kurse des Studenten ausgeben
        System.out.println("\nKurse von " + john.getName() + ":");
        List<Course> courses = john.getCourses();
        for (Course c : courses) {
            System.out.println(" - " + c.getInfo());
        }

        // 12) Studierende im ersten Kurs ausgeben
        System.out.println("\nStudierende in \"" + introCS.getName() + "\":");
        for (Student s : introCS.getStudents()) {
            System.out.println(" - " + s.getInfo());
        }

        // 13) Student aus erstem Kurs streichen
        introCS.drop(john); // alternativ: john.drop(introCS);

        // 14) Studierende erneut ausgeben (nach Drop)
        System.out.println("\nNach dem Drop in \"" + introCS.getName() + "\":");
        for (Student s : introCS.getStudents()) {
            System.out.println(" - " + s.getInfo());
        }
    }
}