package com.auxolabs.general.ClassConstructorInheritance;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String secondName;
    private int age;
        private Person(){
            System.out.println("Enter Person Details");
        }
    public static void main(String[] args) {
        Person person = new Person();
        Scanner s1 = new Scanner(System.in);
        String firstName = s1.nextLine();
        String secondName = s1.nextLine();
        int age = s1.nextInt();
        person.setFirstName(firstName);
        person.setSecondName(secondName);
        person.setAge(age);
        System.out.println("Person FirstName ->"+person.getFirstName());
        System.out.println("Person LastName ->"+person.getSecondName());
        System.out.println("FullName ->"+person.getFullName());
        System.out.println("Person Age ->"+person.getAge());
        System.out.println("Teen ->"+person.getteen());
    }
    private void setFirstName (String firstName){
        this.firstName = firstName;
    }
    private void setSecondName(String secondName){
        this.secondName = secondName;
    }
    private void setAge(int age){
        this.age = age;
    }
    private String getFirstName(){
        return firstName;
    }
    private String getSecondName(){
        return secondName;
    }
    private int getAge(){
        return age;
    }
    private String getFullName(){
        if (firstName.isEmpty() && secondName.isEmpty()){
            return firstName+" "+secondName;
        }
        return firstName +" "+secondName;
    }
    private boolean getteen(){
        return age > 12 && age < 20;
    }
}
