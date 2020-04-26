package ducks;

import behavior.impl.FlyNoWay;
import behavior.impl.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehaviour = new FlyNoWay();
    }

    public void display() {
        System.out.println("Display " + this.getClass().getSimpleName());
    }
}
