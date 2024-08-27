package org.example;

public class Course {
    private String courseName, instructor, room;

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", instructor='" + instructor + '\'' +
                ", room='" + room + '\'' +
                '}';
    }

    public Course(String courseName, String instructor, String room) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.room = room;
    }
}
