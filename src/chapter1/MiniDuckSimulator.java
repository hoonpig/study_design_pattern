package chapter1;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performfly();

        System.out.println();

        Duck model  = new ModelDuck();
        model.performfly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performfly();
    }

}
