package demo5;

import demo4.Honda;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();

        Toyota t = new Toyota();
        t.run();
        System.out.println(t.getBrand());
        Honda h = new Honda();
        h.speedUp();
        System.out.println(h.getBrand());

        Car.type="Moto and Car";

    }
}
