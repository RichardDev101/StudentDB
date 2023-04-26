package de.neuefische.Model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static java.util.Collection.*;
import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    private StudentDB testStudentDB;

    @Test
    void getAllStudents_shouldReturn_threeStudents() {
        //GIVEN
        Student student1= new Student("Klaus Mustermann", 18, "KM462");
        Student student2= new Student("Susann Heinemann", 22, "SH034");
        Student student3= new Student("Johann Mayer", 19, "JM953");

        Map<String,Student> students = new HashMap<>();
        students.put(student1.getId(),student1);
        students.put(student2.getId(),student2);
        students.put(student3.getId(),student3);

        StudentDB studentDB = new StudentDB(students);
        //WHEN
        Map<String, Student> actual = studentDB.getAllStudents();
        //THEN
        assertEquals(students, actual);
    }
    /* @Test
    void getAllStudents_shouldReturn_threeStudentsShuffled() {
        //GIVEN
        Student student1= new Student("Klaus Mustermann", 18, "KM462");
        Student student2= new Student("Susann Heinemann", 22, "SH034");
        Student student3= new Student("Johann Mayer", 19, "JM953");

        Map<String, Student> students = new HashMap<>();
        students.put(student1.getId(),student1);
        students.put(student2.getId(),student2);
        students.put(student3.getId(),student3);

        StudentDB studentDB = new StudentDB(students);

        Map<String, Student> expected = new HashMap<>();
        students.put(student1.getId(),student1);
        students.put(student2.getId(),student2);
        students.put(student3.getId(),student3);

        Collections.sort(expected);

        //WHEN
        Map<String, Student> actual = studentDB.getAllStudents();
        Collections.sort(actual);

        //THEN
        assertEquals(expected, actual);
        }
*/
    @Test
    public void gfindById_ThrowsException_WhenStudentNorFound() {
        //GIVEN
        testStudentDB = new StudentDB();
        //WHEN & THEN
        try{
            testStudentDB.findById();
        } catch (exception){
            Assertions.asserTrue(condition: true);
        }
         //Assertions.assertThrows((NoSuchElementException.class, ()-> testStudentDB.findById))
}
