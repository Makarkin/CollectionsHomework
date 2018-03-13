package services;

import restaurantObjects.Restaurant;
import restaurantObjects.RestaurantTable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class AuxilaryService {

    public static void seeMenu(HashSet<String> dishNamesSet) {
        for (String dishName : dishNamesSet) {
            System.out.println(dishName);
        }
    }

    public static void selectDishes(int size, RestaurantTable table) {
        String dishName;
        Scanner scanner = new Scanner(System.in);
        HashSet<String> dishNamesSet;
        for (int i = 0; i < size; i++) {
            dishName = scanner.nextLine();
            if ("esc".equals(dishName)) {
                break;
            }

            table.getOrder().add(dishName);
        }
    }

    public static void seeGeneralOrder(GeneralOrder generalOrder) {
        System.out.printf("General order: %s%n", Arrays.toString(generalOrder.orderDeque.toArray()));
    }

    public static void fillRestaurant (Restaurant restaurant, HashSet<String> menu, int numberOfTables) {
        for ( int i = 0; i < numberOfTables; i++) {
            restaurant.getTablesList().add(new RestaurantTable(menu));
        }
    }
}
