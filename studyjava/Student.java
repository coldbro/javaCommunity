package studyjava;

public class Student {
    public static void main(String[] args) {
        Structure student = new Structure();
        student.age=18;
        student.name="xiaolan";
        student.sex="girl";
        student.eat();
        System.out.println(student.age+student.name);//

    }
}
