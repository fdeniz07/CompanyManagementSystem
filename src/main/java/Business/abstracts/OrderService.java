package main.java.Business.abstracts;

import main.java.application.console.cafe.CafeDishService;
import main.java.application.console.restaurant.RestaurantDishService;
import main.java.entities.concretes.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class OrderService {

    Scanner scanner = new Scanner(System.in);
    protected List<Order> orderList = new ArrayList<>();

    public void deleteOrder() {
        boolean isValid = true;
        if (this.orderList.isEmpty()) {
            System.out.println("Siparisiniz Bulunmamaktadir..");
        } else {
            System.out.print("Iptal Etmek Istediginiz Siparisin kodunu giriniz : ");
            int code = scanner.nextInt();
            for (Order siparis : this.orderList) {
                if (siparis.orderCode == code) {
                    this.orderList.remove(siparis);
                    System.out.println("Siparisiniz Iptal Edildi " + siparis.orderCode + " " + siparis.dish.toString());
                    isValid = true;
                    break;
                } else {
                    isValid = false;
                }
            }

            if (!isValid) {
                System.out.println("Siparis Kodu Gecersiz");
            }
        }
    }

    public void printBill() {
        double totalPrice = 0.0;
        System.out.println("                   ====>       Lezzet Fisiniz        <====                 ");
        for (Order order : this.orderList) {
            System.out.printf("Lezzet kodu : %-5s     adi : %-20s   adeti : %-5s   siparis tutari : %-5s  Lira\n",
                    order.dish.getCode(), order.dish.getName(), order.numOfDish, order.orderPrice);
            totalPrice += order.orderPrice;
        }
        System.out.println("Toplam Tutar : " + totalPrice);
        System.out.println("============   Afiyet Olsun  ============");
        this.orderList = new ArrayList<>();

    }

    public void createOrder(RestaurantDishService restaurantDishServicedishService) {
    }

    public void crateOrder(CafeDishService cafeDishService) {
    }

}
