package H2J;

import java.util.LinkedList;

public class StackTest implements  Stack {
    LinkedList<LOL> stackdt =new LinkedList<>();

    public static void main(String[] args) {
            StackTest stackTest = new StackTest();
            for(int i=0 ; i <3 ;i++){
                stackTest.push(new LOL("hero"+1));
            }
//            for(int i =0; i<3 ;i++){
//               System.out.println( stackTest.pull());
//            }
            System.out.println("____________________");
            System.out.println(stackTest.peek());
    }
    public void push(LOL hero){
            stackdt.addLast(hero);;
    }
    public  LOL pull(){
        return stackdt.removeLast();
    }
    public LOL peek(){
        return stackdt.getLast();
    }
}
