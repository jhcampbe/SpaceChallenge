public class Rocket implements SpaceShip {
    int cost; // cost in millions
    int cargoCarried; // weight in kg
    int cargoLimit; // weight in kg

    Rocket(int cost, int cargoCarried, int cargoLimit){
        this.cost = cost;
        this.cargoCarried = cargoCarried;
        this.cargoLimit = cargoLimit;
    }

    public boolean launch(){
        return true;
    }

    public boolean land(){
        return true;
    }

    public boolean canCarry(Item item) {
        return this.cargoCarried + item.getWeight() <= cargoLimit;
    }

    public void carry(Item item){
        this.cargoCarried += item.getWeight();
    }
}
