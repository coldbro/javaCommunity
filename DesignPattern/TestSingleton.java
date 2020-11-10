package DesignPattern;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton s0 = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s0);
        System.out.println(s1);
        System.out.println(s2);
    }
}
