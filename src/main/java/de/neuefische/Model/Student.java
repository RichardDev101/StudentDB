package de.neuefische.Model;

public class Student {
    private static int idCount=0;
    private String name;
    private int age;
    private int id;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    // K O N S T R U K T O R
    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id =++idCount;

    }
    // G e t t e r   S t r i n g e r
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public static void setIdCount(int idCount) {
        Student.idCount = idCount;
    }
    public static int getIdCount() {
        return idCount;
    }
}
