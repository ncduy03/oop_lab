package hust.soict.globalict.aims.cart;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 50;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBERS_ORDERED){
            System.out.println("The cart is already full, please remove some items before adding this one.");
            return;
        }
        itemsOrdered[qtyOrdered] = disc;
        ++qtyOrdered;
        System.out.println("The disc has been added");
        if (qtyOrdered >= MAX_NUMBERS_ORDERED){
            System.out.println("The cart is almost full");
        }
    }

    // public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
    // if (qtyOrdered + dvdList.length >= MAX_NUMBERS_ORDERED){
    // System.out.println("The cart is already full, please remove some items before
    // adding this one.");
    // return;
    // }
    // for (DigitalVideoDisc dvd : dvdList){
    // addDigitalVideoDisc(dvd);
    // }
    // }
    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
        if (qtyOrdered + dvdList.length > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is already full, please remove some items before adding this one.");
            return;
        }
        for (DigitalVideoDisc dvd : dvdList) {
            addDigitalVideoDisc(dvd);
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered + 2 > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is already full, please remove some items before adding this one.");
            return;
        }
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);

    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; ++i){
            if (itemsOrdered[i] == disc) {
                --qtyOrdered;
                System.out.println("The disc has been removed");
                for (int j = i + 1; j < qtyOrdered; ++j){
                    itemsOrdered[j - 1] = itemsOrdered[j];
                }
                itemsOrdered[qtyOrdered] = null;
                return;
            }
        }
        System.out.println("Cannot find the item.");
    }
    public float totalCost(){
        float cost = 0;
        for (DigitalVideoDisc item : itemsOrdered) {
            if (item != null)
                cost += item.getCost();
        }
        return cost;
    }
    public Boolean searchDVD(int id){
        for (DigitalVideoDisc dvd: itemsOrdered){
            if (dvd != null && dvd.getId() == id) {
                System.out.println("Found DVD: ");
                System.out.println(dvd);
                return true;
            }
        }
        System.out.println("Not found DVD.");
        return false;
    }
    public Boolean searchDVD(String title){
        for (DigitalVideoDisc dvd: itemsOrdered){
            if (dvd != null && title.equals(dvd.getTitle())) {
                System.out.println("Found DVD: ");
                System.out.println(dvd);
                return true;
            }
        }
        System.out.println("Not found DVD.");
        return false;
    }
    
    public String toString() {
        String cartString = "";
        String cartHeader = "***********************CART***********************\n";
        String cartTitle = "Ordered Items: \n";
        cartString += cartHeader;
        cartString += cartTitle;
        for (int i = 0; i < qtyOrdered; ++i) {
            String itemString = String.format("%d. %s",
                    i + 1,
                    itemsOrdered[i]);
            cartString += itemString;
        }
        String totalCostString = String.format("Total Cost: %f\n", totalCost());
        String cartFooter = "**************************************************\n";
        cartString += totalCostString;
        cartString += cartFooter;
        return cartString;
    }
}
