import java.io.*;
import java.util.*;

public class Simulation {

    private void loadItems(){
        File file = new File("phase-1.txt");
        Scanner scanner = null;
        try{
            scanner = new Scanner(file);
        } catch (FileNotFoundException exception){
            System.out.println("File not found.");

        }

        while (scanner.hasNextLine()){
//            String[] data = scanner.nextLine().split("=");
//            Item item = new Item();

        }

    }
}
