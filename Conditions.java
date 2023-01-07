public enum Conditions {
    ANGRY("злится"), CALM("спокоен"), SCARED("наполняется дурными предчувствиями");
    private String name;
    Conditions (String name){
        this.name = name;
    }
    public String toString(){
        return this.name;
    }
}