package usingscanner;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        System.out.println("Would you want option 1 or 2?");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        switch (option) {
            case "1":
                System.out.println("blabla");
                break;
            case "2":
                System.out.println("great");
                break;
        }
        if(option.equals("1")) {
            System.out.println("that's my first option too!");
        } else {
            System.out.println("Alright, let's go!");
        }
    }
}
