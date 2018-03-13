package Services;

import restaurantObjects.RestaurantTable;

import java.util.*;

public class GeneralOrder {
    ArrayDeque<String> generalOrder = new ArrayDeque<>();

    /**
     *this method gradually collects orders from all tables,
     * i.e. "order" field values of "RestaurantTable" exemplars
     * from "Restaurant" exemplar are added to the "generalOrder" field.
     * @see RestaurantTable#order
     * @param tablesList - is list of tables from exemplar of "Restaurant" class.
     */
    public void createGeneralOrder(ArrayList<RestaurantTable> tablesList) {
        for (RestaurantTable table : tablesList) {
            for (String dish : table.getOrder()) {
                generalOrder.add(dish);
            }
        }
    }

    /**
     *This method outputs to the console elements of "generalOrder" field.
     */
    public void seeGeneralOrder() {
        System.out.printf("General order: %s%n", Arrays.toString(generalOrder.toArray()));
    }
}
