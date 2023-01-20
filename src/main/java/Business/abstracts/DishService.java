package main.java.Business.abstracts;

import main.java.entities.concretes.Dish;

public abstract class DishService {

    public abstract void fillDishList();

    public void showMenu() {
//        System.out.println("                  Lezzetlerimiz                  ");
//        System.out.printf("%-3s    %-20s   %-5s \n", "Kod", "Adi", "Fiyat");
//        System.out.printf("%-3s    %-20s   %-5s \n", "---", "---", "-----");
    }

    public abstract Dish findDishByCode(int code);
}
