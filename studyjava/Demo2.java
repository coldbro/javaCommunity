package studyjava;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args){
        String[] strings = new String[3];
        String[]  str = new String[6];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = s.nextLine();}
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].contains("zhang")){
                System.out.println(strings[i]);
            }
        }
    }
}
