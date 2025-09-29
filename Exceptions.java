// // public class Exceptions {

// //     public static void main(String[] args) {
// //         int arr[]= {1,2,3,4};
// //         try{
// //             System.out.println(arr[5]);
// //         }catch(ArrayIndexOutOfBoundsException e){
// //             System.out.println("Index out of range" + e.getStackTrace());
// //         }
// //     }
// // }

// import java.util.Scanner;
// public class Exceptions {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter two numbers: ");
        
//             int a= input.nextInt();
//         int b = input.nextInt();
//         try{
//         int result=a/b;
//         System.out.printf("Result is %d",result);
//         }catch(ArithmeticException e){
//             System.out.println("Dividing by Zero");
//         }
//     }
// }

//throw and throws
public class Exceptions {
public static void main(String[] args) {
    
    getName("Ashwi-n");
}
    public static void getName(String name) throws IllegalArgumentException {
if(name.contains("-")){
    throw new IllegalArgumentException("Name contains '-' ");
}else{
    System.out.println("Your name is "+name);
}
    }
}