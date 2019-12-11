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
        //System.out.println("hello");
        System.out.println(list.size());
        UrhajoFromConsole();
        System.out.println(list.size());
        fileReader(path);
        System.out.println(list.size());

    }

    public static void UrhajoFromConsole() {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int select = 1;
        int hiperugras = 0;

        for (UrhajoENUM uh : UrhajoENUM.values()) {
            System.out.println(i + "." + uh);
            i++;
        }
        System.out.print("Válassz űrhajót a megfelelő számmal:_");
        select = scanner.nextInt();
        String urhajo = "";
        switch (select) {
            case 1:
                urhajo = UrhajoENUM.XWING.toString();
                break;
            case 2:
                urhajo = UrhajoENUM.MILLENIUMFALCON.toString();
                break;
        }
        System.out.print("Hiperugrások száma:_");
        hiperugras = scanner.nextInt();
        System.out.println(urhajo);

        UrHajoCreator(urhajo, hiperugras);
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
