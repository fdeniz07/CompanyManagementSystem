package main.java.application.console.cafe;

import main.java.Business.abstracts.OrderService;
import main.java.application.console.restaurant.RestaurantDishService;
import main.java.entities.concretes.Dish;
import main.java.entities.concretes.Order;

import java.util.Scanner;

public class CafeOrderService extends OrderService {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void createOrder(RestaurantDishService restaurantDishServicedishService) {

    }

//    public void createOrder(CafeDishService cafeService) {
//        int dishCode = -2;
//        while (dishCode != 0) {
//            System.out.println("Lutfen Urun Kodu Giriniz :  (CIKIS : 0)");
//            dishCode = scanner.nextInt();
//            Dish dish = cafeService.findDishByCode(dishCode);
//            if (dish.getCode() > 0) {
//                System.out.print("Adet Giriniz : ");
//                int num = scanner.nextInt();
//                Order order = new Order(dish, num);
//                order.setOrderCode(1000 + this.orderList.size());
//                this.orderList.add(order);
//            }
//            for (Order order : this.orderList) {
//                System.out.printf("Siparis Kodu :%-5s  Lezzet Kodu :%-3s     Adi :%-20s Adet : %-3s \n",
//                        order.orderCode, order.dish.getCode(), order.dish.getName(), order.numOfDish);
//            }
//        }
//
//    }
}
