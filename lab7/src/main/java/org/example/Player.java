package org.example;

import weapons.*;

public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    public static Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] {
            new Pistol("Пистолет","17 патронов"),
            new RPG("РПГ","1 снаряд"),
            new Rifle("Пулемет","100 патронов"),
            new Rogatka("Лук","1 стрела"),
            new WaterGun("Камень","1 бросок")
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO проверить на выход за границы
        if(slot> weaponSlots.length){
            System.out.println("Значение некорректно");
            System.exit(1);
        }
        // если значение slot некорректно, то
        // выйти из метода написав об этом в консоль

        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shot();
    }
}


