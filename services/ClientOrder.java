package services;

import restaurantObjects.RestaurantTable;
import restaurantObjects.Restaurant;
import java.util.HashSet;
import java.util.Scanner;

public class ClientOrder {

    private void makeAnOrder(RestaurantTable table) {
        table.setBusy(true);
        System.out.println("Select dishes. After your choice, enter 'esc'.");
        HashSet<String> dishNamesSet = table.getMenu();
        seeMenu(dishNamesSet);
        int size = dishNamesSet.size();
        selectDishes(size, table);
    }

    private void seeMenu(HashSet<String> dishNamesSet) {
        for (String dishName : dishNamesSet) {
            System.out.println(dishName);
        }
    }

    private void selectDishes(int size, RestaurantTable table) {
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

    /**
     *This method make an order from one table,
     * i.e. "order" field in exemplar of "RestaurantTable" class
     * is filled with some value.
     * @see RestaurantTable#order
     * @param restaurant - this is the restaurant that owns the table with the order being made.
     */
    public void createOrder(Restaurant restaurant) {
        restaurant.viewOfTables();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a number of free table.");
        int tableNumber;
        RestaurantTable table;
        while (true) {
            tableNumber = scanner.nextInt() - 1;
            table = restaurant.getTablesList().get(tableNumber);
            if (!table.isBusy()) {
                makeAnOrder(table);
                return;
            } else {
                System.out.println("Select a number of FREE table, please.");
            }
        }
    }
}
