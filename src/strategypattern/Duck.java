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
public abstract class Duck {

    // The Quack Property of the Duck

    public void quack(){
        System.out.println("I can quack");
    }

    //The swimming Property of the Duck

    public void swim(){
        System.out.println("I can swim");
    }

    //An abstract Property of the Duck which should be implemented by each duck individually
    public abstract void display();
    
    public void fly(){
        System.out.println("I can Fly");
    }
}