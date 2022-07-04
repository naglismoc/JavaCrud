package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean addStudents = true;
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (addStudents) {
            System.out.println("Ką norite daryti?");
            System.out.println("1. Pridėti studentą.");
            System.out.println("2. Atspausdinti studentų sąrašą.");
            System.out.println("3. Uždaryti programą.");
            System.out.println("4. Ištrinti studentą.");

            int opt = Validation.getOption(sc);

            switch (opt) {
                case 1:
                    addStudent(sc, students);
                    break;
                case 2:
                    printStudents(students);
                    break;
                case 3:
                    addStudents = false;
                    break;
                case 4:
                    deleteStudent(sc, students);
                    break;
                case 5:
                    break;
            }
        }
    }

    public static void deleteStudent(Scanner sc, ArrayList<Student> students) {
        System.out.println("Įveskite studento id kurį norite ištrinti");
        printStudents(students);
        int id = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                System.out.println(students.get(i));
                //students.get(i).setName("Petras"); pvz editinimo išsaugojimui
                students.remove(i);
            }
        }
    }

    public static void printStudents(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    public static void addStudent(Scanner sc, ArrayList<Student> students) {
        Student student = new Student();

        while (true) {
            System.out.println("Įveskite vardą");
            if (student.setName(sc.nextLine())) {
                break;
            }
            System.out.println("Blogai įvestas vardas");
        }

        while (true) {
            System.out.println("Įveskite pavardę");
            if (student.setSurname(sc.nextLine())) {
                break;
            }
            System.out.println("Blogai įvesta pavardė");
        }

        while (true) {
            System.out.println("Įveskite amžių");
            if (student.setAge(sc)) {
                break;
            }
            System.out.println("Blogai įvestas amžius");
        }

        while (true) {
            System.out.println("Įveskite telefono numerį");
            if (student.setPhoneNo(sc.nextLine())) {
                break;
            }
            System.out.println("Blogai įvestas telefono numeris");
        }

        while (true) {
            System.out.println("Įveskite elektroninio pašto adresą");
            if (student.setEmail(sc.nextLine())) {
                break;
            }
            System.out.println("Blogai įvestas telefono elektroninio pašto adresas");
        }

        if (students.size() > 0) {
            student.setId(students.get(students.size() - 1).getId() + 1);
        } else {
            student.setId(1);
        }
        students.add(student);
    }
}