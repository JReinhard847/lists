package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*List<Student> students = new ArrayList<>();
        Student student1 = new Student("John", "Doe", 123456);
        Student student2 = new Student("Max", "Mustermann", 654321);
        students.add(student1);
        students.add(student2);

        School school = new School();
        school.addStudent(student1);
        school.addStudent(student2);
        school.printStudents();
        System.out.println(school.findStudentById(123456));
        System.out.println(school.findStudentById(12345));

        Course course1 = new Course("a", "b", "c");
        Course course2 = new Course("d", "e", "f");
        student1.addCourse(course1);
        student1.addCourse(course2);
        System.out.println(school.getCoursesOfStudentById(123456));*/

        Sack<String> sack = new Sack<>();
        sack.add("abc");
        System.out.println(sack.size());
        System.out.println(sack.get(0));
        sack.removeLast();
        System.out.println(sack.size());
        sack.add("1");
        sack.add("2");
        sack.add("3");
        sack.add("4");
        sack.removeByIndex(3);
        System.out.println(sack.get(2));
    }
}