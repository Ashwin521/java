// // // class Parent{
// // //     private String name;
// // //     private int age;
// // //     public Parent(String name, int age){
// // //         this.name=name;
// // //         this.age=age;
// // //     }
// // //     public String getName(){
// // //         return name;
// // //     }
// // //     public int getAge(){
// // //         return age;
// // //     }

// // // }
// // // class prac2{
// // //     public static void main(String[] args) {
// // //         Parent p=new Parent("Alice",50);
// // //         System.out.println("Name: "+p.getName());
// // //         System.out.println("Age: "+p.getAge());
// // //     }
// // // }

// // class Person {
// //     String name;

// //     Person(String name) {
// //         this.name = name;
// //         System.out.println("Person constructor called for : " + name);
// //     }
// // }

// // class Student extends Person{
// //     int rollno;
// //     double marks;

// //     static int totalstudents=0;
// //     Student(String name,int rollno,double marks){
// //         super(name);
// //         this.rollno=rollno;
// //         this.marks=marks;
// //         // System.out.println("Student constructor called for : "+name);
// //         totalstudents++;
// //     }

// //     // / Display details method
// //     void displayDetails() {
// //         System.out.println("Name: " + name + ", Roll No: " + rollno + ", Marks: " + marks);
// //     }

// //     // Static method (can be called without creating object)
// //     static void showTotalStudents() {
// //         System.out.println("Total Students: " + totalstudents);
// //     }
// // }

// // // Main class
// // public class Main {
// //     public static void main(String[] args) {
// //         // Create students
// //         Student s1 = new Student("Ashwin", 101, 95.5);
// //         Student s2 = new Student("Ravi", 102, 88.0);

// //         // Show details
// //         s1.displayDetails();
// //         s2.displayDetails();

// //         // Call static method
// //         Student.showTotalStudents();

// //     }

// // }

// class Person {
//     String name;

//     Person(String name) {
//         this.name = name;
//         System.out.println("Person constructor called for : " + name);
//     }
// }

// class Student extends Person {
//     int rollno;
//     double marks;

//     static int totalstudents = 0;

//     Student(String name, int rollno, double marks) {
//         super(name);
//         this.rollno = rollno;
//         this.marks = marks;

//         totalstudents++;
//     }

//     void displayDetails() {
//         System.out.println("Name: " + name + ", Roll No: " + rollno + ", Marks: " + marks);
//     }

//     static void showTotalStudents() {
//         System.out.println("Total Students: " + totalstudents);
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Student s1 = new Student("Ashwin", 23, 89);
//         Student s2 = new Student("Ravi", 45, 78);
//         s1.displayDetails();
//         s2.displayDetails();
//         Student.showTotalStudents();

//     }
// }

// import java.util.*;
// // class Main {
// //     public static void main(String[] args) {
// //         int[] arr = { 1, 2, 3, 4, 5 };
// //         System.out.println(arr.length);
// //         System.out.println("Array elements are: ");
// //         for (int i = 0; i < arr.length; i++) {
// //             System.out.print(arr[i] + " ");
// //         }
// //     }
// // }
// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a string: ");
//         String str = sc.nextLine();
// System.out.println(str.length());
//         for (int i = str.length() - 1; i >= 0; i--) {
//             System.out.print(str.charAt(i) + " ");
//         }
//     }
// }

//checking whether a string is palindrome or not
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter to check its palindrome or not :- ");
        String str = sc.nextLine();
        boolean isPalindrome = true;
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");

        }

    }
}

