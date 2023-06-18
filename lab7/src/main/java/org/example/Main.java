package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        System.out.println("----------------------------");

        for (int i = 0; i < Player.weaponSlots.length ; i++) {
            System.out.println((i+1)+". "+Player.weaponSlots[i].toString());
        }

        System.out.println("----------------------------");

        while (true) {
            System.out.println("Выберите оружике");
            int slot = scanner.nextInt()-1;
            if(slot==-2||slot > player.getSlotsCount()){
                break;
            }
            // TODO главный цикл игры:
            player.shotWithWeapon(slot);
        }
        // запрашивать номер с клавиатуры
        // с помощью scanner.nextInt(),
        // пока не будет введено -1
        System.out.println("Game over");
    }
}