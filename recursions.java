// // class recursions {
// //     public static void printNum(int n) {
// //         if (n == 6) {
// //             return;
// //         }
// //         System.out.println(n);
// //         printNum(n + 1);
// //     }

// //     public static void main(String[] args) {
// //         int n = 1;
// //         printNum(n);
// //     }
// // }
        
// //sum of n natural numbers
// class recursions{
//     public static void sum(int i, int n ,int sum){
//         if(i==n){
//             sum+=i;
//             System.out.println(sum);
//             return;
//         }
//         sum+=i;
//         sum(i+1,n,sum);
//         System.out.println();
//         System.out.println(i+" ");

//     }
//     public static void main(String[] args) {
//         sum(1, 5, 0);
//     }
// }

// //factorial of n
// class recursions{
//     public static int factorial(int n ,int i){

// if(i==0||i==1){
//     return 1;
// }
// return i*factorial(n, i-1);
//     }
//     public static void main(String[] args) {
//        int result= factorial(5,5);
//        System.out.println(result);
//     }


// }

//fibonacci till n
//0 1 1 2 3 5 agar n 5 hai to  n 1 or 2 to return 1 
class recursions{
    public static void calcFibo(int a,int b,int n){
        if(n==0) return;
        int c=a+b;
        System.out.println(c);
        calcFibo(b, c, n-1);

    }
    
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int n =7;
        calcFibo(a, b, n-2);

    }
}