/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

/**
 *
 * @author randikawann
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehaviour= new Quack();
        flyBehaviour= new FlyWithWings();
    }

    public void display(){
        System.out.println("Hi my appearance is like a MallardDuck");
    }

    @Override
    public void quack() {
        System.out.println("i can quack");
        System.out.println("Hi my appearance is like a Mallard Duck");
        
    }
}