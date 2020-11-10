package chapter1;

public class MuteQuack implements QuackBeHavior {

    @Override
    public void quack() {
        System.out.println("<<<<조용>>>>>>");
    }
}
