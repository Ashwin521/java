

// //     public int noOfWheels;
// //     public int noOfDoors;
// //     public int maxSpped;
// //     public String company;
// //     public String name;

// //     public Car1(int noOfWheels, int noOfDoors, int maxSpped, String company, String name) {
// //         this.noOfWheels = noOfWheels;
// //         this.noOfDoors = noOfDoors;
// //         this.maxSpped = maxSpped;
// //         this.company = company;
// //         this.name = name;
// //     }

// // }

// //  class Car {

// //     public static void main(String[] args) {
// //         Car1 car = new Car1(4, 4, 70, "Maruti", "Tata");
// //         System.out.println(car.toString());
// //     }
// // }

// class Moto {
//     public int noOfWheels;
//     public int noOfDoors;
//     public int maxSpped;
//     public String company;
//     public String name;

//     public Moto(int noOfWheels, int noOfDoors, int maxSpped, String company, String name) {
//         this.noOfWheels = noOfWheels;
//         this.noOfDoors = noOfDoors;
//         this.maxSpped = maxSpped;
//         this.company = company;
//         this.name = name;
//     }

// }

// class Car{
//     public static void main(String[] args) {
//         Moto m1= new Moto(4, 4, 4200, "TATA", "Maruti");
//         System.out.println(m1.toString());
//     }
// }

public class Car extends Vehicle {

    @Override
    public void makeStartSound() {
        System.out.println("broom broom....");
    }

    private int noOfDoors;

    public Car() {
        super(4);
    }
}