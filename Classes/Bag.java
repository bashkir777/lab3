package Classes;

import AbstractClasses.Thing;

public class Bag extends Thing {
    public Bag(String name){
        super(name);
    }
    @Override
    public void broken(){
        System.out.println(this.toString() + " разрывается словно бомба");
    }
}