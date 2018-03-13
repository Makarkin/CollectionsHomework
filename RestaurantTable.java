package restaurantObjects;

import java.util.HashSet;

public class RestaurantTable {
    private boolean busy = false;
    private HashSet<String> menu;
    private HashSet<String> order = new HashSet<>();

    /**
     *This is getter for "busy" field.
     * @return "busy" field.
     */
    public boolean isBusy() {
        return busy;
    }

    /**
     *This is setter for "busy" field.
     * @param busy is substitute value.
     */
    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    /**
     *This is getter for "menu" field.
     * @return "menu" field.
     */
    public HashSet<String> getMenu() {
        return menu;
    }

    /**
     *This is getter for "order" field.
     * @return "order" field.
     */
    public HashSet<String> getOrder() {
        return order;
    }

    /**
     *Constructor of "RestaurantTable" class
     * @param menu is substitute value of "menu" field.
     */
    public RestaurantTable(HashSet<String> menu) {
        this.menu = menu;
    }
}
