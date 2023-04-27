package de.neuefische.Model;

public class BiologyStudent extends Student{

    private boolean hasScalpel;

    public BiologyStudent(String name, String id, boolean hasScalpel){
        super(name,id);
        this.hasScalpel=hasScalpel;
    }
    //MAIN METHODS

    //GETTER AND SETTER
    public boolean isHasScalpel() {
        return hasScalpel;
    }

    public void setHasScalpel(boolean hasScalpel) {
        this.hasScalpel = hasScalpel;
    }
}
