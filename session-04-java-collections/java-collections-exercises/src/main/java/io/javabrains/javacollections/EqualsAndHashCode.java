package io.javabrains.javacollections;

/*
Generate a Person class with the member variables firstName, lastName, age, lastModifiedDate.
Generate equals and hashcode methods using member variables firstName, lastName, age
Compare two instances of Person that have the same data
*/

import java.util.Date;
import java.util.Objects;

public class EqualsAndHashCode {


    public static void main(String[] args) {
        Date d = new Date();
        Person p1 = new Person("Iqra", "Ali", 25, d);
        Person p2 = new Person("Hiba", "Ahmed", 25, d);
        Person p3 = new Person("Iqra", "Ali", 25, d);

        System.out.println("p1 hashcode "+p1.hashCode());
        System.out.println("p2 hashcode "+p2.hashCode());
        System.out.println("p3 hashcode "+p3.hashCode());

        System.out.println("p1 eauals p2 "+p1.equals(p2));
        System.out.println("p1 eauals p3 "+p1.equals(p3));

    }
}
class Person{
    String firstName;
    String lastName;
    int age;
    Date lastModifiedDate;

    public Person(String firstName, String lastName, int age, Date lastModifiedDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && firstName.equals(person.firstName) && lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}

