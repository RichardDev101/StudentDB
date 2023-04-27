package de.neuefische;


import de.neuefische.Model.BiologyStudent;
import de.neuefische.Model.Student;
import de.neuefische.Model.StudentDB;
import de.neuefische.Model.StudentNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String... args){

        StudentDB studentDb = new StudentDB();

        BiologyStudent stu1 = new BiologyStudent("Stu1", "B1", true);
        BiologyStudent stu2 = new BiologyStudent("Stu2", "B2", false);
        BiologyStudent stu3 = new BiologyStudent("Stu3", "B3", true);
        BiologyStudent stu4 = new BiologyStudent("Stu4", "B4", false);

        studentDb.addStudent(stu1);
        studentDb.addStudent(stu2);
        studentDb.addStudent(stu3);
        studentDb.addStudent(stu4);


        try{
            System.out.println((studentDb.findById("dgdsgfsdg")));
        }catch(StudentNotFoundException e){
            System.out.println("Oha, eine Exception")+ e.getMessage();
        }

/*

        Student student1= new Student("Klaus Mustermann", 18, "KM462");
        Student student2= new Student("Susann Heinemann", 22, "SH034");
        Student student3= new Student("Johann Mayer", 19, "JM953");

  */
/*    System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());*//*


        Map<String, Student> students = new HashMap<>();
        students.put(student1.getId(), student1);
        students.put(student2.getId(),student2);
        students.put(student3.getId(),student3);

        StudentDB studentDB = new StudentDB(students);

        System.out.println(studentDB.getAllStudents());
*/
/*
        for (int i =0; i < 30; i++) {
            System.out.println(studentDB.randomStudent());
        }*//*


    }





/*

import de.neuefische.Model.Student;
import de.neuefische.Model.StudentDB;

public class Main {
    static StudentDB stuDB;
    public static void main(String[] args) {

        Student student1 = new Student("Alexander Schmidt",22,1);
        Student student2 = new Student("Klaus Jakovski",23,2);
        Student student3 = new Student("Susann Mayer",19,3);

        stuDB.getAllStudents(1);

*/


}