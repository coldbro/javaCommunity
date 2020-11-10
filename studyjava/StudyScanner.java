package studyjava;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class StudyScanner {
  public static void main(String[] args){
      Scanner scan= new Scanner(System.in);
      String str = scan.nextLine();
      String str2= scan.next();
      System.out.println("我的输入"+str);
      System.out.println("next和nextLine的区别"+str2);
  }
}
