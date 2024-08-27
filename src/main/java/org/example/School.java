package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students;

    public School() {
        students = new ArrayList<>();
    }

    public School(List<Student> lst) {
        students = lst;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public List<Course> getCoursesOfStudentById(int id) {
        Student student = findStudentById(id);
        if (student == null) {
            return new ArrayList<>();
        }
        return student.getCourses();
    }
}
