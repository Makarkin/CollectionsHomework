
import restaurantObjects.RestaurantTable;
import restaurantObjects.Restaurant;
import services.AuxilaryService;
import servicesHolder.Holder;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> menu = new HashSet<>(Arrays.asList("Soup", "Steak", "Desert", "Wine"));
        Restaurant restaurant = new Restaurant();
        int i = 5;
        AuxilaryService.fillRestaurant(restaurant, menu, i);

        while (i > 0) {
            Holder.getClientOrder().createOrder(restaurant);
            Holder.getGeneralOrders().createGeneralOrder(restaurant.getTablesList());
            AuxilaryService.seeGeneralOrder(Holder.getGeneralOrders());
            i--;
        }
    }
}
