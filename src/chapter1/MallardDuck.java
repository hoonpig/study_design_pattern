package chapter1;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBeHavior = new Quack();
        flyBehavior = new FlyWithWings();

    }

    public void display(){
        System.out.println("저는 물오리 입니다.");
    }
}
