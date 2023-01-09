package Classes;

import AbstractClasses.Human;
import Classes.Place;

public class Stranger extends Human {
    public Stranger(String name, Place place){
        super(name, place);
    }
    public void onGo(Place place1){
        System.out.println(this.toString() + " идет в " + place1.toString());
    }
}