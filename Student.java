package com.company;

import java.util.Scanner;

public class Student {

    private int id;
    private int age;
    private String name;
    private String surname;
    private String phoneNo;
    private String email;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (!Validation.isNameValid(name)) {
            return false;
        }
        this.name = name;
        return true;
    }

    public String getSurname() {
        return surname;
    }

    public boolean setSurname(String surname) {
        if (!Validation.isSurnameValid(surname)) {
            return false;
        }
        this.surname = surname;
        return true;
    }

    public int getAge() {
        return age;
    }

    public boolean setAge(Scanner sc) {
        if (!Validation.isAgeValid(sc.nextInt())) {
            sc.nextLine();
            return false;
        }
        sc.nextLine();
        this.age = age;
        return true;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public boolean setPhoneNo(String phoneNo) {
        if (!Validation.isPhoneNoValid(phoneNo)) {
            return false;
        }
        this.phoneNo = phoneNo;
        return true;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (! Validation.isEmailValid(email) ){
            return false;
        }
        this.email = email;
        return true;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phoneNo='" + phoneNo + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}