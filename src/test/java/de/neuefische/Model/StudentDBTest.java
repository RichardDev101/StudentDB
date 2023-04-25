package de.neuefische.Model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void getAllStudents_shouldReturn_threeStudents() {
        //GIVEN
        Student student1= new Student("Klaus Mustermann", 18, "KM462");
        Student student2= new Student("Susann Heinemann", 22, "SH034");
        Student student3= new Student("Johann Mayer", 19, "JM953");

        Student[] students = {student1, student2, student3};
        StudentDB studentDB = new StudentDB(students);
        //WHEN
        Student[] actual = studentDB.getAllStudents();
        //THEN
        assertArrayEquals(students, actual);

    }
    @Test
    void getAllStudents_shouldReturn_threeStudentsShuffled() {
        //GIVEN
        Student student1= new Student("Klaus Mustermann", 18, "KM462");
        Student student2= new Student("Susann Heinemann", 22, "SH034");
        Student student3= new Student("Johann Mayer", 19, "JM953");

        Student[] students = {student1, student2, student3};

        StudentDB studentDB = new StudentDB(students);

        Student[] expected = {student2,student3,student1};
        Arrays.sort(expected);

        //WHEN
        Student[] actual = studentDB.getAllStudents();
        Arrays.sort(actual);

        //THEN
        assertArrayEquals(expected, actual);

    }
}