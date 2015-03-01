package org.diosoft.spring.messaging;

public class Person {

    private final String firstName;

    public Person(String firstName) {this.firstName = firstName;}

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
