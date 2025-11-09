package de.phl.programmingproject.petadoption;

import java.util.Date;

/**
 * PUT YOUR CODE FOR THE EXERCISE 'Pet Adoption Center' HERE.
 */

public class Main {
    public static void main(String[] args) {
        // 1) Neues Pet-Objekt
        Pet buddy = new Pet("Buddy", 3, "Labrador Retriever");

        // 2) Neues Adopter-Objekt
        Adopter jane = new Adopter("Jane Smith", "555-555-5555", "janesmith@email.com");

        // 3) Info des Haustiers ausgeben
        System.out.println("Haustier-Info: " + buddy.getInfo());

        // 4) Info des Adoptierenden ausgeben
        System.out.println("Adoptierenden-Info: " + jane.getInfo());

        // 5) Adoptionsstatus vor der Adoption prüfen
        System.out.println("Ist Buddy adoptiert? " + buddy.isAdopted());

        // 6) Haustier adoptieren (heutiges Datum verwenden)
        Date today = new Date();
        Adoption adoption = buddy.adopt(jane, today);

        // 7) Adoptionsinformationen ausgeben
        System.out.println("Adoptions-Info: " + adoption.getInfo());

        // 8) Adoptionsstatus nach der Adoption erneut prüfen
        System.out.println("Ist Buddy jetzt adoptiert? " + buddy.isAdopted());
    }

    }

