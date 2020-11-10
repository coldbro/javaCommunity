package DesignPattern;

public class TestICloneable {
    /*
    * 传递i的地址，指向的是全部的地址，一个更改，全部更改，不是原型模式，只是简单的复制
    * 浅克隆，浅复制，只复制基本类型，不复制引用类型，引用数据类型还指向同一个对象。
    * */
    public static void main(String[] args) throws  CloneNotSupportedException{
        System.out.println("-----------原型简历模板----------");
        ICloneable i =new ICloneable();
        Number number =new Number();
        number.setPhone("154646461");
        i.setInfo("张三",17,number);
        i.setWeek("white house ","america");
        i.show();
        //复制简历
        System.out.println("----------克隆一号----------");
        ICloneable i2 = (ICloneable)i.clone();
        Number number1 = i2.getNumber() ;
        number1.setPhone("544455555");
        i2.setInfo("李四",20,number1);
        i2.show();
        System.out.println("---------克隆二号-----------");
        ICloneable i3 =(ICloneable)i.clone();
        i3.show();
        System.out.println("----------------------------");
        i.show();i2.show();i3.show();
    }
}
