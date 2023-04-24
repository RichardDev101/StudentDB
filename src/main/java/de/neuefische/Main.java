package de.neuefische;

import de.neuefische.Model.Student;
import de.neuefische.Model.StudentDB;

public class Main {
    StudentDB stuDB;
    public static void main(String[] args) {

        Student student1 = new Student("Alexander Schmidt",22,1);
        Student student2 = new Student("Klaus Jakovski",23,2);
        Student student3 = new Student("Susann Mayer",19,3);

        System.out.println(StudentDB());

    }
}