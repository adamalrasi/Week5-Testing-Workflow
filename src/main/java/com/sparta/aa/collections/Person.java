package com.sparta.aa.collections;

// public class Person implements Comparable<Person> {
    public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    // @Override
    // public int compareTo(Person o) {
    //     int lastNameComparison = lastName.compareTo(o.lastName);
    //     if (lastNameComparison == 0) {
    //         return firstName.compareTo(o.firstName);
    //     } else {
    //         return lastNameComparison;
    //     }
    // }
    
}
