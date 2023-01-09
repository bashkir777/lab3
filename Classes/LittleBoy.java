package Classes;

import AbstractClasses.Human;

public class LittleBoy extends Human {
    public LittleBoy(String name, Place place) {
        super(name, place);
    }
    public void runTo(Place place){
        this.setPlace(place);
        System.out.println(this.toString() + " забегает в " + place.toString());
        PlaceController.addHuman(place, this);
    }
}
