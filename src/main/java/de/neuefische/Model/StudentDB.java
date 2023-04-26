package de.neuefische.Model;

import java.lang.reflect.Array;
import java.util.*;

public class StudentDB {
    //FIELDS
    private Map<String, Student> students = new HashMap<>();


    //METHODS

    public Student findById (String id){
       return this.students.get(id);
    }
    public List<Student> clearList(List<Student> students) {
        this.students.clear();
        return students;
    }

    public Map<String, Student> addStudent(Student newStudent) {
        students.put(newStudent.getId(),newStudent);
        return this.students;
    }

    public Map<String,Student> removeStudent(Student studentToRemove) {
        students.remove(studentToRemove.getId(), studentToRemove);
        return this.students;
    }

    public Map<String, Student> getAllStudents() {
        return this.students;
    }

    public Student randomStudent() {
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
    public StudentDB(Map<String, Student> students) {
        this.students = students;
    }

    //GETTER AND SETTER

    public Map<String, Student> getStudents() {
        return students;
    }

    public void setStudents(Map<String, Student> students) {
        this.students = students;
    }
}