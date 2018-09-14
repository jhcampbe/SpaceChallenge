import java.util.*;

public class Main {
    public static void main(String[] args){
        Simulation simulation = new Simulation();
        ArrayList<Item> items = simulation.loadItems();
        ArrayList<U1> U1rockets = simulation.loadU1(items);
        ArrayList<U2> U2rockets = simulation.loadU2(items);
        System.out.println("Budget for U1 rockets: $" + simulation.runSimulation(U1rockets) + " million");
        System.out.println("Budget for U2 rockets: $" + simulation.runSimulation(U2rockets) + " million");
    }
}
