import Classes.*;

public class Main {
    public static void main(String[] args) {
        Place street = new Place("улица");
        Place cafe = new Place("молочное кафе в соседнем доме");
        Place flat = new Place("квартира");
        Window window = new Window(street);
        flat.interactiveObj = window;

        Stranger stranger1 = new Stranger("тетенька", street);
        Carlson carl = new Carlson("Карлсон", flat);
        LittleBoy boy = new LittleBoy("малыш", street);

        stranger1.onGo(cafe);
        boy.runTo(flat);
        carl.setThing(new Bag("мешок"));
        flat.interactiveObj.interaction(carl);

    }
}