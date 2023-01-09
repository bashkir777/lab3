package Classes;

import AbstractClasses.Human;
import Interfaces.Interactive;

public class Place {
    private String name;
    private Human[] HumanList = new Human[3];
    private short HumanCounter = 0;
    public Interactive interactiveObj;

    public Place(String name) {
        this.name = name;
    }

    public Human[] getHumanList() {
        return this.HumanList;
    }

    public short getHumanCounter() {
        return HumanCounter;
    }

    public void setHumanCounter(short humanCounter) {
        HumanCounter = humanCounter;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}