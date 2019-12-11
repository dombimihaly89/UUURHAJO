package hu.flowacademy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Starwars {
    private static String path = "starwars_file.txt";
    private static List<Urhajo> list = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        fileReader(path);
    }



    public static Urhajo UrHajoCreator(String name, int hiperugras) {
        if (name.equals("XWing")) {
            XWing xwing = new XWing();
            for (int i = 0; i < hiperugras; i++) {
               xwing.HiperUgras();
            }
            putUrHajoInList(xwing);
            return xwing;
        } else {
            MilleniumFalcon milleniumfalcon = new MilleniumFalcon();
            for (int i = 0; i < hiperugras; i++) {
                milleniumfalcon.HiperUgras();
            }
            putUrHajoInList(milleniumfalcon);
            return milleniumfalcon;
        }
    }

    public static void fileReader(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String urhajo = scanner.nextLine();
            String[] array = urhajo.split(" ");
            UrHajoCreator(array[0], Integer.parseInt(array[1]));
        }
    }

    public static void putUrHajoInList(Urhajo urhajo) {
        list.add(urhajo);
    }
}
