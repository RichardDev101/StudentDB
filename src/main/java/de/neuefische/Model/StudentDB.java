package de.neuefische.Model;

import java.util.Arrays;

public class StudentDB {
    //Field Declaration
    int studentCount = Student.getIdCount();
    Student[] students = new Student[studentCount];

    //Konstructor
    public StudentDB(Student[] students) {
        this.students = students;
    }
    //Method
    public Student[] getAllStudents (){
        for(int i=0; i<=studentCount; i++) {
            this.students[i] = this.toString(students.toString(i));

        }

    }

}