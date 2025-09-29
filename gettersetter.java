class Car {
    private int price = 5000;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class gettersetter {
    public static void main(String[] args) {
        Car c= new Car();
    System.out.println("Initial Price: " + c.getPrice());

        // Using setter
        c.setPrice(8000);
        System.out.println("Updated Price: " + c.getPrice());
    }
}
