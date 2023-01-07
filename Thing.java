
public abstract class Thing {
    private String name;
    public Thing(String name) {
        this.name = name;
    }

    public void broken(){
        System.out.println(this.name + "ломается");
    }

    @Override
    public String toString(){
        return this.name;
    }
    @Override
    public int hashCode(){
        return this.name.hashCode();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}