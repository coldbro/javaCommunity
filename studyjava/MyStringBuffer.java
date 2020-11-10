package studyjava;

public class MyStringBuffer implements IStringBuffer{
    String s;
    @Override
    public void append(String str) {
        System.out.println("此方法可在末尾追加字符串");
        s += str;//s可根据需要提前声明。或利用Scanner输入。
        System.out.println(s);
    }

    @Override
    public void append(char c) {
        System.out.println("此方法可在末尾追加字符");
        s += c;//s可根据需要提前声明。或利用Scanner输入。
        System.out.println(s);
    }

    @Override
    public void insert(int pos, char b) {
        //虽然StringBuffer的总空间大于内容长度，但最多可以在位置是“原数据的长度（这里为12）”插入新元素，即紧接着原数据。
        //经测试，上述规则和StringBuffer的插入规则一样
        String s = "I can do it!";//测试用。假设它为原字符串。
        String s2 = "";
        String s3= "";

        char[] C = s.toCharArray();

        for (int i = 0; i < pos; i++) {
            s2 += C[i];
        }


        for (int j = pos ; j < C.length; j++) {
            s3 += C[j];
        }

        System.out.println("在指定位置插入字符串后的新字符为:  " + s2 + b + s3);

    }

    @Override
    public void insert(int pos, String b) {
        String s2 = "abcde";//测试用。假设它为原字符串
        String s3 = "";
        String s4 = "";


        String[] S = s2.split("");

        for (int i = 0; i < pos; i++) {
            s3 += S[i];
        }


        for (int j = pos ; j < S.length ; j++) {
            s4 += S[j];

        }

        System.out.println("在指定位置插入字符串后的新字符为:  " + s3 + b + s4);

    }



    @Override
    public void delete(int start) {
        String s = "DAnte";//测试用。假设它为原字符串
        String s2 = "";

        String[] S = s.split("");

        for (int i = 0; i < start; i++) {
            s2 += S[i];
        }


        System.out.println(s2);

    }

    @Override
    public void delete(int start, int end) {
        String s = "Let us go!";//测试用。假设它为原字符串
        String s2 = "";

        String[] S = s.split("");

        for (int i = start; i < end; i++) {
            S[i] = null;
        }

        for (int i = 0; i < S.length; i++) {
            if(S[i] != null) {
                s2 += S[i];
            }
        }
        System.out.println(s2);

    }

    @Override
    public void reverse() {
        String s = "Devil";//测试用。假设它为原字符串
        String s2 = "";

        String[] S = s.split("");
        String[] S2 = s.split("");

        int b = S.length - 1;

        for (int i = 0; i < S.length / 2; i++) {

            S[i] = S[b];
            s2 += S[i];
            b--;

        }


        for (int i = S2.length / 2 ; i < S2.length; i++) {
            S[i] = S2[b];
            s2 += S[i];
            b--;
        }
        System.out.println(s2);


    }

    @Override
    public int length() {
        String s = "Rainbow";//测试用。假设它为原字符串
        int Chang = 0;

        for (int i = 0; i < s.length(); i++) {
            Chang++;
        }
        return Chang;
    }
}
