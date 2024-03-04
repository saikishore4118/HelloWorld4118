package com;

public class Person {
private String firstName;
private String lastName;
private int id;
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
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Person(String firstName, String lastName, int id) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.id = id;
}
@Override
public String toString() {
	return "Person [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + "]";
}


}
