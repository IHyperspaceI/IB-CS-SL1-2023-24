package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter14;

public class Person implements Comparable<Person>{
    private int age;
    private String name = "jj";


    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }
}
