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
public class RedHeadDuck extends Duck  {

    public  RedHeadDuck(){
        quackBehaviour = new Squeak();
        flyBehaviour= new FlyWithWings();
    }

    public void display(){
        System.out.println("Hi my appearance is like a RedHead Duck");
    }


}