package main.java.application.console.restaurant;

import main.java.Business.abstracts.OrderService;
import main.java.entities.concretes.Order;

import java.util.Scanner;

public class RestaurantBillGenerator {

    public void sectorRestaurant() {

        RestaurantService restaurantService = new RestaurantService();
        restaurantService.fillDishList();

        OrderService orderService = new OrderService();

    }


    public void getSelectionMenu(RestaurantService restaurantService, OrderService orderService) {
        int select = -1;
        while (select != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("------------------------------------------------------------------------");
            System.out.println("=========    Ana Restaurant Siparis Uygulamasi ===========");
            System.out.println("1-Menu");
            System.out.println("2-Siparis girme");
            System.out.println("3-Siparis iptal etme");
            System.out.println("4-Hesap Olustur");
            System.out.println("0-CIKIS");
            System.out.println("Seciminiz : ");
            select = sc.nextInt();
            System.out.println("------------------------------------------------------------------------");

            switch (select) {
                case 1:
                    restaurantService.showMenu();
                    break;
                case 2:
                    orderService.createOrder(restaurantService);
                    break;
                case 3:
                    orderService.deleteOrder();
                    break;
                case 4:
                    orderService.printBill();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatali Giris");
                    break;
            }


        }
    }
}
