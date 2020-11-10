package studyjava;

import javax.crypto.spec.OAEPParameterSpec;

public class Option {
    public String name ;//声明时初始化
    public Option() {//构造器初始化
        name = "one hero";
    }
    {
        name = "the hero";//块初始化

    }




//
//    public Option() {//构造器初始化
//         name = "one hero";
//    }


    public static void main(String[] args) {
        Option o = new Option();
        System.out.println(o.name);
    }
}
