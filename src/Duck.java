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

    }
}
