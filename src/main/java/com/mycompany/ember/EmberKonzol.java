package com.mycompany.ember;

import java.util.Scanner;

public class EmberKonzol {
    private EmberController controller;

    public EmberKonzol(EmberController controller) {
        this.controller = controller;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---Ember program konzol---");
            System.out.println("1. Hozzáad");
            System.out.println("2. Kilép");
            
            int valaszt = scanner.nextInt();
            scanner.nextLine();

            switch (valaszt) {
                case 1:
                    System.out.print("Név: ");
                    String nev = scanner.nextLine();
                    System.out.print("Születési év: ");
                    int ev = scanner.nextInt();
                    controller.bemutatkozas(nev, ev);
                    break;
                case 2:
                    System.out.println("Kilépett");
                    System.exit(0);
                default:
                    System.out.println("Nincs ilyen menüpont.");
            }
        }
    }

    public void kiirBemutatkozas(String bemutatkozas) {
        System.out.println(bemutatkozas);
    }

    public void setController(EmberController controller) {
        this.controller = controller;
    }
}