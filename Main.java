import Services.ClientOrder;
import restaurantObjects.RestaurantTable;
import restaurantObjects.Restaurant;
import servicesHolder.Holder;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> menu = new HashSet<>(Arrays.asList("Soup", "Steak", "Desert", "Wine"));
        Restaurant restaurant = new Restaurant();
        int i;
        for ( i = 0; i < 5; i++) {
            restaurant.getTablesList().add(new RestaurantTable(menu));
        }

        while (i > 0) {
        Holder.getClientOrder().createOrder(restaurant);
        Holder.getGeneralOrders().createGeneralOrder(restaurant.getTablesList());
        Holder.getGeneralOrders().seeGeneralOrder();
        i--;
        }
    }
}
