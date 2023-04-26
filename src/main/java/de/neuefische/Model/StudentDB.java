package de.neuefische.Model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class StudentDB{
    //FIELDS
    private ArrayList<Student> students =new ArrayList<>();



    public ArrayList<Student> addStudent (Student newStudent){
        students.add(newStudent);
        return this.students;
    }
    public ArrayList<Student> removeStudent(Student studentToRemove) {
        students.remove(studentToRemove);
        return this.students;
    }
    //METHODS
    public ArrayList<Student> getAllStudents(){
        return this.students;
    }

    public Student randomStudent(){
        Random random = new Random();
        int index = random.nextInt(students.size());
        return students.get(index);
    }

    //DEFAULT METHODS

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDB studentDB = (StudentDB) o;
        return Objects.equals(students, studentDB.students);
    }
    @Override
    public int hashCode() {
        return Objects.hash(students);
    }
    //CONSTRUCTOR
    public StudentDB(ArrayList<Student> students) {
        this.students = students;
    }
    //GETTER AND SETTER
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
}