package nl.avans.drivio;

import java.awt.*;
import java.util.Scanner;

public class car {
    public static void typeOfCar() {
        String[] typeOfCar = {"Benzine", "Diesel", "Hybride", "Elektrisch", "lpg"};
        Choice choice = new Choice();
        for (int i=0; i < typeOfCar.length; i++) {
            choice.add(typeOfCar[i]);
        }
        int choice1 = 0; //TODO: Deze vervangen met de keuze van de klant
        System.out.println(typeOfCar[choice1]);
        // TODO: Ervoor zorgen dat de keuze hierna in de DB opgeslagen wordt
    }

    public static void makeOfCar() {
        String[] brandOfCar = {"Audi", "Mercedes"};
        String[] modelOfCar = {"A1", "S6", "R8"}; //TODO: Ervoor zorgen dat deze array aangepast worden a.d.v. de keuze van de klant bij het merk
        int choice = 1; //TODO: Deze vervangen met de keuze van de klant
        System.out.println(brandOfCar[choice]);
        System.out.println(modelOfCar[choice]);
        // TODO: Ervoor zorgen dat de keuze hierna in de DB opgeslagen wordt
    }

    public static void yearOfCar() {
        Scanner yearInput = new Scanner(System.in);
        System.out.println("Jaartal van de auto");
        int yearOfCar = yearInput.nextInt();
        System.out.println("De auto komt uit: " + yearOfCar);
        yearInput.close();
        // TODO: Ervoor zorgen dat de keuze hierna in de DB opgeslagen wordt
    }

    public static void bodyType() {
        String[] bodyType = {"Station", "Hatchback", "Cabrio"};
        int choice = 2;
        System.out.println(bodyType[choice]);
    }

    public static void overviewOfCars() {
        // TODO: Informatie van de ingevoerde auto's ophalen uit de DB
    }
}
