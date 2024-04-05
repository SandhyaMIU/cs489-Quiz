import model.Contact;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ContactManagementApp {


    public static void main(String[] args) {
        System.out.println("Hello Quiz");

        Contact c1 = new Contact("David", "Sanger", "Argos LLC", "Sales Manager");
        Contact c2 = new Contact("Carlos", "Jimenes", "Zappos", "Director");
        Contact c3 = new Contact("Ali", "Gafar", "BMI Services", "HR Manager");

        c1.addPhoneNumber("240-133-0011", "Home");
        c1.addEmailAddress("Home", " dave.sang@gmail.com");

        c3.addPhoneNumber("412-116-9988", "Work");
        c3.addEmailAddress("Work", "ali@bmi.com");

        Contact[] contacts = {c1,c2,c3};
        System.out.println("Contacts are created!");

        printInJsonContact(contacts);

    }

    private static void printInJsonContact(Contact[] contacts) {
        System.out.println("Printed in Json Format..............");

        Arrays.sort(contacts, Comparator.comparing(Contact::getLastName));
        for(Contact c : contacts){
            System.out.println(c);
        }
    }


}
