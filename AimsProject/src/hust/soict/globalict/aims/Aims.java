package hust.soict.globalict.aims;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        Cart order = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
       
        order.addDigitalVideoDisc(dvd1, dvd2, dvd3);

        order.searchDVD(3);
        order.searchDVD(5);
        order.searchDVD("Star Wars");
        order.searchDVD("Aladin");

        System.out.println(order);
        order.removeDigitalVideoDisc(dvd3);

        System.out.println(order);
    }
}