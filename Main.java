package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //No.1. Create Array consisting of 10 titles of different plants
        System.out.println("_____First task____");
        String[] plants = {"Liepa", "Klevas", "Obelis", "Egle", "Pusis", "Berzas", "Azuolas", "Vysnia", "Tuja", "Slyva"};
        System.out.println(Arrays.toString(plants));
        System.out.println();

        //No.2. Print every plant in a separate column.
        System.out.println("_____Second task_____");
        for (int i = 0; i < plants.length; i++) {
            System.out.println(plants[i]);
        }
    }
}