import java.io.*;
import java.util.*;

public class Simulation {

    public ArrayList<Item> loadItems(){
        File file = new File("phase-1.txt");
        Scanner scanner = null;
        try{
            scanner = new Scanner(file);
        } catch (FileNotFoundException exception){
            System.out.println("File not found.");

        }

        ArrayList<Item> items = new ArrayList<>();
        while (scanner.hasNextLine()){
            String[] data = scanner.nextLine().split("=");
            String name = data[0];
            int weight = Integer.parseInt(data[1]);
            Item item = new Item(name, weight);
            items.add(item);
        }

        return items;

    }

    public ArrayList<U1> loadU1(ArrayList<Item> items){
        int i = 0;
        ArrayList<U1> U1rockets = new ArrayList<>();
        while (i < items.size()){
            U1 u1 = new U1();
            while(i < items.size() && u1.canCarry(items.get(i))){
                u1.carry(items.get(i));
                i++;
            }
            U1rockets.add(u1);
        }

        return U1rockets;
    }

    public ArrayList<U2> loadU2(ArrayList<Item> items){
        int i = 0;
        ArrayList<U2> U2rockets = new ArrayList<>();
        while (i < items.size()){
            U2 u2 = new U2();
            while(i < items.size() && u2.canCarry(items.get(i))){
                u2.carry(items.get(i));
                i++;
            }
            U2rockets.add(u2);
        }

        return U2rockets;
    }


}
