// class recursions {
//     public static void printNum(int n) {
//         if (n == 6) {
//             return;
//         }
//         System.out.println(n);
//         printNum(n + 1);
//     }

//     public static void main(String[] args) {
//         int n = 1;
//         printNum(n);
//     }
// }
        
//sum of n natural numbers
class recursions{
    public static void sum(int i, int n ,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        sum(i+1,n,sum);

    }
    public static void main(String[] args) {
        sum(1, 5, 0);
    }
}