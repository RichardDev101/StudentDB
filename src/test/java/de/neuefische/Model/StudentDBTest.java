package de.neuefische.Model;

import org.junit.jupiter.api.Test;

import java.util.*;

import static java.util.Collection.*;
import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void getAllStudents_shouldReturn_threeStudents() {
        //GIVEN
        Student student1= new Student("Klaus Mustermann", 18, "KM462");
        Student student2= new Student("Susann Heinemann", 22, "SH034");
        Student student3= new Student("Johann Mayer", 19, "JM953");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        StudentDB studentDB = new StudentDB(students);
        //WHEN
        List<Student> actual = studentDB.getAllStudents();
        //THEN
        assertEquals(students, actual);
    }

@Test
    void getAllStudents_shouldReturn_threeStudentsShuffled() {
        //GIVEN
        Student student1= new Student("Klaus Mustermann", 18, "KM462");
        Student student2= new Student("Susann Heinemann", 22, "SH034");
        Student student3= new Student("Johann Mayer", 19, "JM953");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        StudentDB studentDB = new StudentDB(students);

        List<Student> expected = new ArrayList<>();
        expected.add(student3);
        expected.add(student2);
        expected.add(student1);

        Collections.sort(expected);

        //WHEN
        List<Student> actual = studentDB.getAllStudents();
        Collections.sort(actual);

        //THEN
        assertEquals(expected, actual);
        }
}
