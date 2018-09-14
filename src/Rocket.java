public class Rocket implements SpaceShip {
    private int weight;
    private int maxWeight;

    public boolean launch(){
        return true;
    }

    public boolean land(){
        return true;
    }

    public boolean canCarry(Item item) {
        return this.weight + item.weight <= maxWeight;
    }

    public void carry(Item item){
        this.weight += item.weight;
    }
}
