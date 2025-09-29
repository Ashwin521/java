class Test{
    public  String name="Ashwin";
    Test(String name){
        this.name=name;
    }
    
}

public class Stringss {
    public static void main(String[] args) {
        String s1="abc";
        String s2= "abc";
        String s3 = new String("abc");
        System.out.println(s1==s3);
        Test t1= new Test("Ashwin");
        System.out.println(t1);

    }
}
