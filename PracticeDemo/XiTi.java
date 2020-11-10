package PracticeDemo;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

//import  java.util.Format
public class XiTi {
    public static void main(String[] args) {
//        runN();
//        countSum();
//        monthJudge();
//        int i = 20;
//        Integer it = new Integer(i);
//        int i2 = it.intValue();
//        System.out.println(it);
//        double pi = 3.14;
//        String pi1 = String.valueOf(pi);
//        System.out.println(pi1);
//        double pi2 = 3.14;
//        Double pi3 = new Double(pi2);
//        String p4 = pi3.toString();
//        System.out.println(p4);
////        pi1 = "3.1a4";
//        double p5 = Double.parseDouble(pi1);
//        System.out.println(p5);
//        long  n =100000000;
//        double x1 = (double)(1+1.0/n);
//        double x2 = Math.pow(x1,n);
//        System.out.println(x2);
//        System.out.println(Math.E);
        XiTi ispr = new XiTi();
//        ispr.isPrime();
        ispr.abuse();
    }

    public void isPrime() {
        long sum = 0;
        for (long i = 2; i < 10; i++) {
            for (long j = 2; j <= i; j++) {
                if (i % j == 0 && i != j)
                    break;
                else if (i % j == 0) {
                    sum++;
                }
            }
        }
        System.out.println(sum);

    }

    /*浙江温州最大皮革厂江南皮革厂倒闭了，
    王八蛋老板黄鹤吃喝嫖赌，欠下了3.5个亿，带着他的小姨子跑了!
    我们没有办法，拿着钱包抵工资!原价都是一百多、两百多、三百多的钱包，
    现在全部只卖二十块，统统只要二十块!黄鹤王八蛋，
    你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱! */
    public void abuse() {
        Scanner a1 = new Scanner(System.in);
        System.out.println("输入地名");
        String a1a = a1.nextLine();
        Scanner a2 = new Scanner(System.in);
        System.out.println("输入公司类型");
        String a1t = a2.nextLine();
        Scanner a3 = new Scanner(System.in);
        System.out.println("输入公司名");
        String a1c = a3.nextLine();
        Scanner a4 = new Scanner(System.in);
        System.out.println("输入老板名称");
        String a1b = a4.nextLine();
        Scanner a5 = new Scanner(System.in);
        System.out.println("输入产品");
        String a1p = a5.nextLine();
        Scanner a6 = new Scanner(System.in);
        System.out.println("输入金额");
        String a1m = a6.nextLine();
        Scanner a7 = new Scanner(System.in);
        System.out.println("输入单位");
        String a1d = a7.nextLine();
        String abbbuse = "%s最大 %s %s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了 %s个亿， + 带着他的小姨子跑了！我们没有办法，拿着 %s低工资！原价都是一 %s多、 + 两 %s多、三 %s多的钱包，现在全部只卖二十块，统统只要二十块!%s王八蛋， 你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱";
        System.out.printf(abbbuse,a1a,a1t,a1m,a1p,a1d,a1d,a1d,a1b,a1b,a1c,a1d);
    }

    public void runN() {
        int year;
        Scanner in = new Scanner(System.in);
        year = in.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }

    static void countSum() {
        int n;
        double price;
        double sreceive;
        double receive;
        double cash;
        double discount;
        System.out.println("receive");
        Scanner customer = new Scanner(System.in);
        receive = customer.nextDouble();
        System.out.println("number");
        Scanner cherker = new Scanner(System.in);
        n = cherker.nextInt();
        System.out.println("price");
        price = cherker.nextDouble();
        sreceive = n * price;
        discount = sreceive * 0.8;
        cash = receive - sreceive;
        if (cash != 0) {
            if (n * price >= 100) {
                System.out.println("you can have discout");
                System.out.println("you should pay " + discount + "dollar");
                System.out.printf("and these are you foods and cash %.2f", cash);
            }
        } else {
            System.out.println("you will pay" + sreceive);
            System.out.printf("and this is you foods and cash %.2f", cash);
        }

    }

    static void monthJudge() {
        Scanner month = new Scanner(System.in);
        int year = month.nextInt();
        int m = month.nextInt();
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println(year + "是闰年，二月29天");
                } else {
                    System.out.println(year + "不是闰年，二月28天");
                }
                break;
            default:
                System.out.println("30");

        }
    }
}