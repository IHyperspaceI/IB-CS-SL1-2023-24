package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter5;

public class PersonTester {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("null");

        if (person.getName() != null) {
            System.out.printf("Your name is %d characters long\n", person.getName().length());
        } else {
            System.out.println("Name is not set!");
        }

        try{
            System.out.printf("Your name is %d characters long\n", person.getName().length());
        }catch (Exception e){
            System.out.println("Name is not set! Error: " + e);
        }
    }
}