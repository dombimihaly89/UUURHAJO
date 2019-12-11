package hu.flowacademy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Starwars {
    private static String path = "/home/jmezo/flow/starwars_file.txt";

    public static void main(String[] args) {
        //System.out.println("hello");
        UrhajoFromConsole();


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
            case 1: urhajo = UrhajoENUM.XWING.toString();
                break;
            case 2: urhajo = UrhajoENUM.MILLENIUMFALCON.toString();
                break;
        }
        System.out.print("Hiperugrások száma:_");
        hiperugras = scanner.nextInt();
        System.out.println(urhajo);

        // UrhajoCreator(String urhajo, int hiperugras)
    }

    public static void urhajok(String path) {
        List<Urhajo> list = new ArrayList<>();

        File file = new File(path);
        Scanner scanner = new Scanner(path);
        while (scanner.hasNextLine()) {
            String urhajo = scanner.nextLine();
            
        }


    }
}
