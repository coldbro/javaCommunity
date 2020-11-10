package studyjava;

public class TestDemo {
    private  int x ;
    private  String name ;
    public TestDemo(){

    }

    public  String toString(){
        return "age:"+this.name;
    }
    public  TestDemo(int x, String name ){
        this.name= name;
        this .x = x;
    }
    public static void main(String[] args) {
        TestDemo testDemo =new TestDemo(18,"LJR");
        String str = "hello";
        System.out.println(testDemo.toString()+str);
        String s1= "123";
        String s2 = "123";
        System.out.println(s1==s2);
        String s3 = s1 ;
        System.out.println(s1);
        System.out.println(s3==s1);
        System.out.println(s3 ==s2 );
        int  x =Integer.parseInt("123");
        System.out.println(x);
        String string = " alksjdfbkb one bot";
        System.out.println(string.contains("bot"));


    }
}
