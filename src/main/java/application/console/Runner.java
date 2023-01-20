package main.java.application.console;

import main.java.Business.abstracts.OrderService;
import main.java.application.console.restaurant.RestaurantBillGenerator;
import main.java.application.console.restaurant.RestaurantService;
import main.java.entities.concretes.Order;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        start();
    }

    public static void start() {
        RestaurantBillGenerator restaurantBillGenerator = new RestaurantBillGenerator();
        Scanner scanner = new Scanner(System.in);
        int select = -1;
        while (select != 0) {

            String a = " =============         Lezzet Group'a Hos Geldiniz         =============";

            System.out.println();
            System.out.println("Lutfen Ana Restaurant ve Cafe Bolumlerimiz Icin Seciminizi Giriniz...");
            System.out.println(" 1-Restaurant Bolumu \n 2-Coffee Bolumu \n 0-CIKIS");
            System.out.println();
            System.out.print("Seciminiz  : ");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    restaurantBillGenerator.sectorRestaurant();
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

    public static void getSelectionMenu(RestaurantService restaurantService, OrderService orderService){

        int select = -1;

        Scanner inp = new Scanner(System.in);

        do {
            System.out.println("----------------------------------------------------");
            System.out.println("*** Lezzet Group'a Hos Geldiniz ***");
            System.out.println("1-Restaurant");
            System.out.println("2-Cafe");
            select = inp.nextInt();
            System.out.println("----------------------------------------------------");

            switch (select){
                case 1:
                    //Restaurant Menu
                    restaurantService.showMenu();
                    break;
                case 2:
                    //Cafe Menu
                    break;
                default:
                    System.out.println("Hatalı giriş");
                    break;
            }

        }while (select != 0);


    }
}
