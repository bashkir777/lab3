public class Window implements Interactive{
    private Place viewOn;
    public Window(Place plc){
        this.viewOn = plc;
    }
    @Override
    public void interaction(Human human) {
        System.out.println(human.toString() + " " + "высовывается в окно");
        Human list[] = human.getPlace().getHumanList();
        for (int i =0; i < 3; i++){
            if(!(list[i]==null) & !(human.equals(list[i]))) {
                list[i].setCondition(Conditions.SCARED);
            }
        }
        if (human instanceof dropAble){
            dropAble human_drop = (dropAble) human;
            human_drop.dropThing(viewOn);
        }
    }
}
