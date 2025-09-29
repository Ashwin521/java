using System;
class Car {
    private int price = 5000;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class prac {
    public static void Main(String[] args) {
        Car c= new Car();
    Console.WriteLine("Initial Price: " + c.getPrice());

        // Using setter
        c.setPrice(8000);
        Console.WriteLine("Updated Price: " + c.getPrice());
    }
}
