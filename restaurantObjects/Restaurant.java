package restaurantObjects;

import java.util.ArrayList;

public class Restaurant {
    private ArrayList<RestaurantTable> tablesList = new ArrayList<>();

    /**
     *This is getter for "tablesList" field.
     * @see RestaurantTable
     * @return "tablesList" field.
     */
    public ArrayList<RestaurantTable> getTablesList() {
        return tablesList;
    }

    /**
     * This method outputs to the console elements of "tablesList" field.
     */
    public void viewOfTables() {
        for (int i = 0; i < tablesList.size(); i++) {
            System.out.printf("Table number: %d; table is busy: %s%n", i+1, tablesList.get(i).isBusy());
        }
    }
}
