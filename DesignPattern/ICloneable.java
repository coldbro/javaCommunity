package DesignPattern;

import java.io.*;

//简历实体
public class ICloneable implements Cloneable ,Serializable{
    private static final long serialVersionUID = -5512875482803779976L;
    private String name;
    private int age;
    private String last;
    private String address;
    private Number number;

    /*
     * 浅复制，将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型指向的还是原来对象指向的
     * */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setInfo(String name, int age, Number number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }
//深克隆 将对象重写组装，组成新的对象，利用序列化，将一个对象复制后，基本数据类型和引用类型都应重新创建
    public Object deepClone() throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);//将当前对象序列化
        byte[] bs = bos.toByteArray();
        ByteArrayInputStream bis = new ByteArrayInputStream(bs);
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public void setWeek(String last, String address) {
        this.last = last;
        this.address = address;
    }

    public void show() {
        System.out.println("姓名" + name + "年龄" + getAge() + "联系电话" + number.getPhone() + " ");
        System.out.println("公司名称" + last + "工作地址" + address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "ICloneable{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", last='" + last + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                '}';
    }
}
