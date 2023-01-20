package main.java.application.console;

import main.java.Business.abstracts.OrderService;
import main.java.application.console.restaurant.RestaurantBillGenerator;
import main.java.application.console.restaurant.RestaurantDishService;
import main.java.application.console.restaurant.RestaurantOrderService;
import main.java.entities.concretes.Dish;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        start();
    }

    public static void start() {
        RestaurantBillGenerator restaurantBillGenerator = new RestaurantBillGenerator();
        RestaurantOrderService restaurantOrderService = new RestaurantOrderService();
        RestaurantDishService restaurantDishService = new RestaurantDishService();


        Scanner scanner = new Scanner(System.in);
        int select = -1;
        while (select != 0) {

            System.out.println(" =============         Lezzet Group'a Hos Geldiniz         =============");
            System.out.println();
            System.out.println("Lutfen Ana Restaurant ve Cafe Bolumlerimiz Icin Seciminizi Giriniz...");
            System.out.println(" 1-Restaurant Bolumu \n 2-Cafe Bolumu \n 0-CIKIS");
            System.out.println();
            System.out.print("Seciminiz  : ");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    restaurantBillGenerator.getSelectionMenu(restaurantDishService,restaurantOrderService);
                    break;
                case 2:
                    //cafe billinggenerator cagrilacak
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatali Giris Yaptiniz");
            }
        }
        System.out.println("Iyi Gunler Tekrar Bekleriz");

    }
}
