package studyjava;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;

public class AItem {
    String name;
    float price;
    float hp;

    public AItem() {
    }

    ;

    public AItem(String name, float price, float hp) {
        this.name = name;
        this.price = price;
        this.hp = hp;
    }

    public AItem(float hp) {
        this.hp = hp;
    }

    public static void main(String[] args) {
        AItem he = new AItem(100);
//        he.blood(4000);
//        short a = 1;
//        short b = 2;
//        System.out.println();
//        Scanner in = new Scanner(System.in);
//        float f = in.nextFloat();
//        System.out.println(f);
//        he.goldSplit();
//        he.sum();
//        he.minium();
//        he.reverse();
//        he.sort();
//        he.strengthA();
//        he.copyArray();
//        he.doubleArray();
//        he.lastArray();
    }


    public float gethp() {
        System.out.println("返回hp：" + hp);
        return hp;
    }

    public void blood(float blood) {
        System.out.println(blood);
    }

    public void goldSplit() {
        float i, j, m = 0, n = 0.0f, min = 1.0f, value;

        for (i = 1.0f; i <= 20.0; i++) {
            for (j = i + 1; j <= 20.0; j++) {//取值在0.618附近式，分数值必小于1，故分母＞分子
                if (i % 2 != 0 || j % 2 != 0) {//在分子分母不同时为偶数的前提下，再计算分数值
                    if (i / j > 0.618)
                        value = i / j - 0.618f;
                    else
                        value = 0.618f - i / j;//求分数值与黄金分割点的差值绝对值
                    if (value < min) {//找出最小差值下的分子分母值
                        min = value;
                        m = i;
                        n = j;
                    }
                }
            }
        }

        System.out.println("离黄金分割点（0.618）最近的两个数相除是：" + (int) m + "/" + (int) n + "=" + (m / n));

    }

    public void sum() {
        int x = 0, y = 0, a = 0, b = 0;
        for (x = 0; x < 100; x++) {
            for (y = 0; y < 100; y++) {
                for (a = 0; a < 100; a++) {
                    for (b = 0; b < 100; b++)
                        if ((x + y == 8) && (x + a == 14) && (a - b == 6) && (b + y) == 10)
                            System.out.println(x + "," + y + "," + a + "," + b);

                }
            }

        }
    }

    public void minium() {
        int[] a = new int[5];
        a[0] = (int) (Math.random() * 100);
        a[1] = (int) (Math.random() * 100);
        a[2] = (int) (Math.random() * 100);
        a[3] = (int) (Math.random() * 100);
        a[4] = (int) (Math.random() * 100);
        System.out.println("数组中的各个随机数是:");
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
        System.out.println("本练习的目的是，找出最小的一个值: ");
        int m = a[1];
        for (int i = 1; i < 5; i++) {
            if (a[i] < m) {
                m = a[i];
            }

        }
        System.out.println(m);
    }

    public void reverse() {
        int[] arra = new int[5];
        for (int i = 0; i < arra.length; i++) {
            arra[i] = (int) (Math.random() * 100);
            System.out.println(arra[i]);
        }
        for (int j = arra.length - 1; j >= 0; --j) {
            System.out.println(arra[j]);
        }
    }

    public void sort() {
        int[] one = new int[5];
        for (int i = 0; i < one.length; i++) {
            one[i] = (int) (Math.random() * 100);
        }
        int min = 0;
        for (int j = 0; j < one.length; j++) {
            for (int k = j; k < one.length; k++)
                if (one[j] > one[k]) {
                    min = one[k];
                    one[k] = one[j];
                    one[j] = min;
                }
        }
        for (int n = 0; n < one.length; n++) {
            System.out.println(one[n]);
        }
        System.out.println("---------------------------");

        for (int j = 0; j < one.length; j++) {
            for (int k = 0; k < one.length - j - 1; k++) {
                if (one[k] < one[k + 1]) {
                    int max = one[k + 1];
                    one[k + 1] = one[k];
                    one[k] = max;
                }
            }
        }
        for (int n = 0; n < one.length; n++) {
            System.out.println(one[n]);
        }
    }

    public void strengthA() {
        int[] sa = new int[5];
        for (int i = 0; i < sa.length; i++) {
            sa[i] = (int) (Math.random() * 100);
            System.out.println(sa[i]);
        }
        System.out.println("=======================");
        int max = 0;
        for (int value : sa) {
            if (max < value)
                max = value;
        }
        System.out.println(max);
    }

    public void copyArray() {
        int[] step1 = new int[5];
        int[] step2 = new int[5];
        int[] target = new int[step1.length + step2.length];
        for (int i = 0; i < step1.length; i++) {
            step1[i] = (int) (Math.random() * 100);
            step2[i] = (int) (Math.random() * 100);
        }
        for (int v : step1) {
            System.out.println(v);
        }
        System.out.println("------------------------");
        for (int v : step2) {
            System.out.println(v);
        }
        System.out.println("------------------------");
        System.arraycopy(step1, 0, target, 0, step1.length);
        System.arraycopy(step2, 0, target, step1.length, step2.length);
        for (int a : target) {
            System.out.println(a);
        }
    }

    public void doubleArray() {
        int[][] darray = new int[3][5];
        for (int i = 0; i < darray.length; i++) {
            for (int j = 0; j < 5; j++)
                darray[i][j] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++)
                System.out.print(darray[i][j] + " ");
        }
        System.out.println();
        System.out.println("------------------------------");
        int max = 0;
        int maxi = 0;
        int maxj = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (max < darray[i][j]) {
                    max = darray[i][j];
                    maxi = i;
                    maxj = j;
                }
            }
        }
        System.out.println(max + "    " + maxi + "  " + maxj);
    }

    private void lastArray() {
        int[][] a = new int[5][8];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("排序之前的数组");
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
        System.out.println("排序之后的数组");
        for (int i = 0; i < a.length; i++) {
            int[] b = new int[a[i].length];
            System.arraycopy(a[i], 0, b, 0, a[i].length);
            Arrays.sort(b);
            a[i] = b;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }
}




