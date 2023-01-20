package main.java.application.console.restaurant;

import java.util.Scanner;

public class RestaurantBillGenerator {

    public void sectorRestaurant() {

        RestaurantDishService restaurantService = new RestaurantDishService();
        restaurantService.fillDishList();

       RestaurantOrderService restaurantOrderService = new RestaurantOrderService();

    }


    public void getSelectionMenu(RestaurantDishService restaurantDishService, RestaurantOrderService restaurantOrderService) {
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
                    restaurantDishService.showMenu();
                    break;
                case 2:
                    restaurantOrderService.createOrder(restaurantDishService);
                    break;
                case 3:
                    restaurantOrderService.deleteOrder();
                    break;
                case 4:
                    restaurantOrderService.printBill();
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
