package studyjava;

import javax.xml.parsers.SAXParser;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

public class Start2 {
    public void Ch() {
//        String ch1 = "asAG53GAFgASDfmladg164";
        String ch1;
        Scanner x = new Scanner(System.in);
        ch1 = x.nextLine();
        char[] cha = ch1.toCharArray();

        //转换成数组
        // 开始判断大小字符和数字
        for (int i = 0; i < cha.length; i++) {
            if (cha[i] < '9' && cha[i] > '0' || cha[i] < 'a') {
                System.out.println(cha[i]);
            }
        }
    }

    public void RanC() {
        char[] ch = new char[5];
        char start = '0';
        char end = 'z' + 1;
        for (int i = 0; i < ch.length; i++) {
            while (true) {
                char s = (char) (Math.random() * (end - start) + start);
                if (Character.isLetter(s) || Character.isDigit(s)) {
                    ch[i] = s;
                    break;
                }
            }

        }
        for (char c : ch) {
            System.out.println(c);
        }
    }

    public String randomString(int k) {
        char[] sa = new char[k];
        for (int i = 0; i < k; i++) {
            while (true) {
                char x = (char) (Math.random() * 'z' + 1);
                if (Character.isLetter(x) || Character.isDigit(x)) {
                    sa[i] = x;
                    break;
                }
            }
        }

        String s = new String(sa);

        return s;

    }

    public void RS() {
        //创建一个长度是8的字符串数组
        //使用8个长度是5的随机字符串初始化这个数组
        //对这个数组进行排序，按照每个字符串的首字母排序(无视大小写)
        //
        //注1： 不能使用Arrays.sort() 要自己写
        //注2： 无视大小写，即 Axxxx 和 axxxxx 没有先后顺序
        String[] Sa = new String[8];
        for (int i = 0; i < Sa.length; i++) {
            Sa[i] = randomString(5);
        }
        for (int i = 0; i < Sa.length; i++) {
            for (int j = 0; j < Sa.length - 1 - i; j++) {
                if (Character.toLowerCase(Sa[j].charAt(0)) >= Character.toLowerCase(Sa[j + 1].charAt(0))) {
                    String temp = Sa[j + 1];
                    Sa[j + 1] = Sa[j];
                    Sa[j] = temp;
                }
            }
        }
        for (String x : Sa) {
            System.out.println(x);
        }


    }

    /*1. 生成一个长度是3的随机字符串，把这个字符串作为当做密码

    2. 使用穷举法生成长度是3个字符串，匹配上述生成的密码

    要求： 分别使用多层for循环 和 递归解决上述问题 */
    public void secret() {
        String st = randomString(3);
        System.out.println(st);
        char[] ss = st.toCharArray();
        char[] guess = new char[3];
        for (int i = 0; i < ss.length; i++) {
            for (char j = 0; j < 'z'; j++) {
                if (j == ss[i]) {
                    guess[i] = j;
                }
            }
        }
        String m = new String(guess);
        System.out.println(m);
    }

    //
//    public char concern(){
//        while(true){
//
//        }
//    }
    public void LetterC() {
        String n = "  i am bAt man  ";
        String t = n.trim();
        String[] cc = t.split(" ");
//        for (String x:cc){System.out.println(x);}
        for (int i = 0; i < cc.length; i++) {
            String m = cc[i];
            char z = Character.toUpperCase(m.charAt(0));
            String a = m.substring(1);
            String nn = a.toLowerCase();
            String b = z + nn;
            cc[i] = b;
        }

        for (String x : cc) {
            System.out.println(x);
        }
    }

    public void Rkl() {
        String rkl = "peter piper picked a peck of pickled peppers";
        String[] duanc = rkl.split(" ");
        int num = 0;
        for (int i = 0; i < duanc.length; i++) {
            if (duanc[i].charAt(0) == 'p') {
                num++;
            }
        }
        System.out.println(num);
    }

    public void GU() {
        String w = "dsfadgjarjg";
        char[] d = w.toCharArray();
        for (int i = 0; i < d.length; i++) {
            if (i % 2 == 0) {
                d[i] = Character.toUpperCase(d[i]);
            }

        }
        String www = new String(d);
        System.out.println(www);
    }

    public void LW() {
        String ss = "adlfjla";
        char[] ars = ss.toCharArray();
        char x = Character.toUpperCase(ss.charAt(ars.length - 1));
        ars[ars.length - 1] = x;
        String m = new String(ars);
        System.out.println(m);
    }

    public void LT() {
        String two = "Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
        int lt = two.lastIndexOf("two");
        char[] cc = two.toCharArray();
        char atwo = Character.toUpperCase(two.charAt(lt));
        cc[lt] = atwo;
        String z = new String(cc);
        System.out.println(z);
    }

    public void RepeatCount() {
        String[] strings = new String[100];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = randomString(2);
        }
        int count = 0;
        for (String string : strings) {
            System.out.print(string + " ");
            count++;
            if (count % 20 == 0) {
                System.out.println();
            }
        }
        String[] repeatstring = new String[100];
        int repeattimes = 0;
        boolean flag = false;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < repeatstring.length; j++)
                if (strings[i].equals(repeatstring[j])) {
                    flag = true;
                    break;
                }
            if (flag)   // 如果repeat数组中已经存在该字符串，就终止本次循环
                continue;
            for (int k = i + 1; k < strings.length; k++) {
                if (strings[i].equals(strings[k])) {
                    repeatstring[repeattimes] = strings[k];
                    repeattimes++;
                    break;
                }
            }

        }
        System.out.println("总共有 " + repeattimes + " 种重复的字符串");
        if (repeattimes == 0) {
            System.out.println("没有重复");
        } else {
            System.out.println("分别是：");
            for (int z = 0; z < repeattimes; z++) {
                System.out.print(repeatstring[z] + " ");
            }
        }
    }

    public void StringB() {
        String tenbit = randomString(10);
        long x = System.currentTimeMillis();
        for (long i = 0; i < 100000; i++) {
            tenbit += randomString(10);
        }
        long y = System.currentTimeMillis();
        System.out.println(y-x);
        StringBuffer tenbit2 = new StringBuffer(randomString(10));
        long x2 = System.currentTimeMillis();
        for (long i = 0; i < 100000; i++) {
            tenbit2.append(randomString(10));
        }
        long y2 = System.currentTimeMillis();
        System.out.println(y2-x2);

    }

    public static void main(String[] args) {
        Start2 start2 = new Start2();
//        start2.Ch();
//        start2.RanC();
//        start2.RS();
//        start2.secret();
//        start2.LetterC();
//        start2.Rkl();
//        start2.GU();
//        start2.LW();
//        start2.LT();
//        start2.RepeatCount();
        start2.StringB();
    }


}