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
public class RubberDuck extends Duck  {

    public RubberDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour=new MuteQuack();
    }

    public void display(){
        System.out.println("Hi my appearance is like a Rubber Duck");
    }



}