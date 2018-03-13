package servicesHolder;

import Services.ClientOrder;
import Services.GeneralOrder;

public class Holder {
    private static ClientOrder clientOrder;
    private static GeneralOrder generalOrder;

    /**
     *This is getter for "clientOrder" field.
     * @see ClientOrder
     *@return "generalOrder" field.
     */
    public static ClientOrder getClientOrder() {
        if (clientOrder == null) {
            clientOrder = new ClientOrder();
        }
        return clientOrder;
    }

     /**
     *This is getter for "generalOrder" field.
      * @see  GeneralOrder
     *@return "generakOrder" field.
     */
    public static GeneralOrder getGeneralOrders() {
        if (generalOrder == null) {
            generalOrder = new GeneralOrder();
        }
        return generalOrder;
    }
}
