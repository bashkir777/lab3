public class Carlson extends Human implements dropAble{
    public Carlson(String name, Place place){
        super(name, place);
    }
    public void dropThing(Place place){
        System.out.println(this.toString() + " выбрасывает " + this.getThing().toString()+ " на "+ place.toString());
        this.getThing().broken();
        this.setThing();
        for (int i =0; i < 3; i++){
            if (place.getHumanList()[i] != null){
                place.getHumanList()[i].setCondition(Conditions.ANGRY);
            }
        }
    }
}
