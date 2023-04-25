package de.neuefische.Model;
public class Student{
    //FIELDS
    private String name;
    private int age;
    private String id;

    //DEFAULT METHODS
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }

    //CONSTRUCTOR
    public Student(String name, int age, String id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public Student() {
    }

    //GETTER AND SETTER
    public void setName(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age= age;
    }
    public void setId (String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
}