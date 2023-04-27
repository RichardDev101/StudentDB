package de.neuefische.Model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.rmi.NoSuchObjectException;
import java.util.*;
import java.util.concurrent.locks.Condition;

import static java.util.Collection.*;
import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    private StudentDB testStudentDB;

    @Test
    void getAllStudents_shouldReturn_threeStudents() {
        //GIVEN
        Student student1 = new Student("Klaus Mustermann", 18, "KM462");
        Student student2 = new Student("Susann Heinemann", 22, "SH034");
        Student student3 = new Student("Johann Mayer", 19, "JM953");

        Map<String, Student> students = new HashMap<>();
        students.put(student1.getId(), student1);
        students.put(student2.getId(), student2);
        students.put(student3.getId(), student3);

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
    public void findById1_ThrowsException_WhenStudentNotFound() {
        //GIVEN

/*        Student student1 = new Student("Klaus Mustermann", 18, "KM462");
        Student student2 = new Student("Susann Heinemann", 22, "SH034");
        Student student3 = new Student("Johann Mayer", 19, "JM953");

        Map<String, Student> students = new HashMap<>();
        students.put(student1.getId(), student1);
        students.put(student2.getId(), student2);
        students.put(student3.getId(), student3);

        StudentDB testStudentDB = new StudentDB(students);*/
        StudentDB testStudentDB = new StudentDB();

        String id = "LM032"; // existiert nicht
        //String id = "SH034" // existiert

        //WHEN & THEN
        try {
            testStudentDB.findById(id);
        } catch (StudentNotFoundException exception) {
            Assertions.assertTrue(true);

        }
        //Assertions.assertThrows((NoSuchElementException.class, ()-> testStudentDB.findById(id))
    }

    @Test
    void findById_ShouldThrowException_WhenInvalidIdIsGiven() {
        //Given
        StudentDB studentDb = new StudentDB();

        String invalidID = "sdkgsdj";

        //WHEN & THEN
        try{
            studentDb.findById(invalidID);
        }catch(StudentNotFoundException e){
            assertTrue(true);
        }
    }

    @Test
    void findById_ShouldThrowException_WhenValidIdIsGiven() {
        //Given
        StudentDB studentDb = new StudentDB();

        BiologyStudent stu1 = new BiologyStudent("Stu1", "B1", true);
        studentDb.addStudent(stu1);

        String validID = stu1.getId();

        //WHEN & THEN
        try{
            studentDb.findById(validID);
        }catch(StudentNotFoundException e){
            fail();
        }
    }
}