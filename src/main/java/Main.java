import ducks.Duck;
import ducks.MallardDuck;
import ducks.RubberDuck;

public class Main {

    public static void main(String[] args) {

        Duck mallord = new MallardDuck();
        mallord.display();
        mallord.performFly();
        mallord.performQuack();
        mallord.swim();

        System.out.println("----");

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performFly();
        rubber.performQuack();
        rubber.swim();

    }
}
