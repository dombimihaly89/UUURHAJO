package hu.flowacademy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Starwars {
    private static String path = "/home/jmezo/flow/starwars_file.txt";

    public static void main(String[] args) {
        System.out.println("hello");
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
