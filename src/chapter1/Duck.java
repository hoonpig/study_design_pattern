package chapter1;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBeHavior quackBeHavior;

    public Duck(){
    }

    public abstract void display();

    public void performfly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBeHavior.quack();
    }

    public void swim(){
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠");
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBeHavior(QuackBeHavior qb){
        quackBeHavior = qb;
    }

}
