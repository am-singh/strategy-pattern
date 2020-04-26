package ducks;

import behavior.impl.FlyWithWings;
import behavior.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("Display " + this.getClass().getSimpleName());
    }
}
