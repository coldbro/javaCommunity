package How2J;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Item xueping = new Item();
        xueping.name = "血瓶";
        xueping.price = 20;
        System.out.println(xueping.name);
        Scanner interge = new Scanner(System.in);
//        int x = interge.nextInt();
//        int y = interge.nextInt();
//        System.out.println(x + y);
//        String s1 = interge.nextLine();
//        String s2 = interge.nextLine();
//        System.out.println(s2);
        //首先创建一个长度是5的数组
        //然后给数组的每一位赋予随机整数
        //通过for循环，遍历数组，找出最小的一个值出来
        int[][] arr = new int[5][];
        arr[0] =new int[5];
        arr[1] = new int [7];
        arr[0][4]= 1;
        arr[1][6]=2;
        System.out.println(arr[0][4]);
        System.out.println(arr[1][6]);
        System.out.println(arr[2].length);
    }
}
