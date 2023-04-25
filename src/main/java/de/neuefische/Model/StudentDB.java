package de.neuefische.Model;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class StudentDB{
    //FIELDS
    private Student[] students;

    //METHODS
    public Student[] getAllStudents(){
        return students;
    }

    public Student randomStudent(){
        Random random = new Random();
        int index = random.nextInt(students.length);
        return students[index];
    }

    //DEFAULT METHODS
    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
    //CONSTRUCTOR
    public StudentDB(Student[] students) {
        this.students = students;
    }
    //GETTER AND SETTER
    public void setStudents(Student[] students){
        this.students = students;
    }
    public Student[] getStudents(){
        return students;
    }


}