package DesignPattern;

/*
 *深克隆，深复制
 * 深克隆就是复制了基本数据类型又复制了引用数据类型
 *
 * */
public class TestDeepClone {

    public static void main(String[] args) throws Exception {
        System.out.println("-----------原型简历模板----------");
        ICloneable i = new ICloneable();
        Number number = new Number();
        number.setPhone("154646461");
        i.setInfo("张三", 17, number);
        i.setWeek("white house ", "america");
        i.show();
        //复制简历
        System.out.println("----------克隆一号----------");
        ICloneable i2 = (ICloneable) i.deepClone();
        Number number1 = i2.getNumber();
        number1.setPhone("544455555");
        i2.setInfo("李四", 20, number1);
        i2.show();
        System.out.println("---------克隆二号-----------");
        ICloneable i3 = (ICloneable) i.deepClone();
        i3.show();
        System.out.println("----------------------------");
        i.show();
        i2.show();
        i3.show();
    }

}

