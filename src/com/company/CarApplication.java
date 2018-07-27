package com.company;
public class CarApplication {

    public static void main(String[] args) {
        Car c = new Car();

        c.run();
        c.accelerate();
        c.stop();

        Car d = new Car("Green", "Dodge");
        d.run();
        d.accelerate();
        d.accelerate();
        d.stop();
    }

}
