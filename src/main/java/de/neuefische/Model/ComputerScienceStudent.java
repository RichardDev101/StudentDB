package de.neuefische.Model;

import java.util.Objects;

public class ComputerScienceStudent {

    private boolean hasNoebook;



    public ComputerScienceStudent(boolean hasNoebook) {
        this.hasNoebook = hasNoebook;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "hasNoebook=" + hasNoebook +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerScienceStudent that = (ComputerScienceStudent) o;
        return hasNoebook == that.hasNoebook;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasNoebook);
    }

    public boolean isHasNoebook() {
        return hasNoebook;
    }

    public void setHasNoebook(boolean hasNoebook) {
        this.hasNoebook = hasNoebook;
    }
}
