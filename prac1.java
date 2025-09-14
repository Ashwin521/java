import java.util.Scanner;
// class prac1{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter first number: ");
//         int a =sc.nextInt();
//         System.out.println("Enter second number: ");
//         int b = sc.nextInt();
//         int sum = a+b;
//         System.out.println("The sum of two numbers is: "+sum);
       
//     }
// // }

// class prac1{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value for n : ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
// cla

//encapsulation


// class Student{
//   private String name;
//   public String getName(){
//     return name;
//   }
//   public void setName(String name){
//     this.name=name;
//   }

// } 
// class prac1{
//     public static void main(String[] args) {
//         Student s1= new Student();
//         s1.setName("John");
//         System.out.println(s1.getName());
//     }
// }

class Animal{
    void eat(){
        System.out.println("Animals eat some are veg some are non veg");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}
class prac1{
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();
        c.eat();
        
    }
}