package de.neuefische.Model;

public class StudentDB {
    private String name;
    private int id;



    //K O N S T R U K T O R E N
    public StudentDB(String name, int id){
        this(name);
        this.id = id;
    }
    public StudentDB(String name){
        this.name = name;
    }
    public StudentDB(int id){
        this.id = id;
    }

    //  S E T T E R   U .   G E T T E R
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

}
