// public class passByValandRef {
// //pass by value
//     public static void main(String[] args) {
//         int a=10;
//         int b=40;
//         int sum = add(a,b);
//         System.out.printf("x=%d ,y=%d , sum=%d",a,b,sum);
//     }
//   public static int add(int a,int b){
//     a+=b;
//         return a;
//     }
// }

//pass by reference
public class passByValandRef {

    public static class Point{
         int x;
         int y;
         Point(int x,int y){
            this.x=x;
            this.y=y;
         }
    }
    public static void move(Point p){
        p.x++;
        p.y++;
        System.out.println(p);
    }
    public static void main(String[] args) {
        Point p = new Point(4, 5);

    }
}