package _18_Interface;

//extends 대신 implements
//다중이식 가능
public class Dog implements Animal,Swimmable {

    @Override
    public void sound() {
        System.out.println("짖는다");
    }

    @Override
    public void move() {
        System.out.println("움직인다");
    }

    @Override
    public void swim() {
        System.out.println("수영한다");
    }
}
