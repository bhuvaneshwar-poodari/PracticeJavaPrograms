package com.practice.test;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Bhuvaneshwar", 23);
        System.out.println(s);  // Calls toString()
    }
}

