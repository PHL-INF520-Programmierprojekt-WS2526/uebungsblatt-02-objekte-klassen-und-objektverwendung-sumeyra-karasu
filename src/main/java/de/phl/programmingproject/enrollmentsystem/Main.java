package de.phl.programmingproject.enrollmentsystem;

/**
 * PUT YOUR CODE FOR THE EXERCISE 'STUDENT ENROLLMENT SYSTEM' IN THIS CLASS
 */
package de.phl.programmingproject.enrollmentsystem;

import java.util.List;

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

        // 5) Erneut Infos ausgeben (zeigt erfolgreiche Einschreibung)
        System.out.println("Student-Info (nach Einschreibung): " + john.getInfo());
        System.out.println("Kurs-Info (nach Einschreibung): " + introCS.getInfo());

        // 6) Enrollment-Infos ausgeben
        System.out.println("Enrollment-Info: " + enrollment1.getInfo());

        // 7) Note setzen
        enrollment1.setGrade(4.0);

        // 8) Enrollment-Infos erneut ausgeben (mit aktualisierter Note)
        System.out.println("Enrollment-Info (aktualisiert): " + enrollment1.getInfo());

        // 9) Weiteren Kurs anlegen
        Course oop = new Course("Objektorientierte Programmierung");

        // 10) In neuen Kurs einschreiben
        Enrollment enrollment2 = john.enroll(oop);

        // 11) Liste der Kurse des Studenten ausgeben
        System.out.println("\nKurse von " + john.getInfo() + ":");
        List<Course> johnsCourses = john.getCourses();
        for (Course c : johnsCourses) {
            System.out.println(" - " + c.getInfo());
        }

        // 12) Studierende im ersten Kurs ausgeben
        System.out.println("\nStudierende in \"" + introCS.getInfo() + "\":");
        List<Student> studentsInIntro = introCS.getStudents();
        for (Student s : studentsInIntro) {
            System.out.println(" - " + s.getInfo());
        }

        // 13) Studenten aus erstem Kurs streichen
        introCS.drop(john); // alternativ: john.drop(introCS);

        // 14) Erneut Studierende im ersten Kurs ausgeben (nach Streichen)
        System.out.println("\nStudierende in \"" + introCS.getInfo() + "\" (nach Drop):");
        studentsInIntro = introCS.getStudents();
        for (Student s : studentsInIntro) {
            System.out.println(" - " + s.getInfo());
        }
    }
}


}
