package ducks;

import behavior.FlyBehaviour;
import behavior.QuackBehavior;

public abstract class Duck {

    protected FlyBehaviour flyBehaviour;
    protected QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public abstract void display();

    public void swim() {
        System.out.println("swimming...");
    }


}
