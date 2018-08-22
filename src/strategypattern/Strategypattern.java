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
public class Strategypattern {
  public static void main(String[] args) {
        // created the duck instances
        Duck [] ducks = new Duck[4];
        ducks[0]=new MallardDuck();
        ducks[1]= new RedHeadDuck();
        ducks[2]= new RubberDuck();
        ducks[3]= new DecoyDuck();


        play(ducks);

    }


    public static void play(Duck [] ducks){
        for (Duck duck: ducks) {

           

            duck.display();
            chooseDuckType(duck);
            duck.swim();
            duck.fly();
            System.out.println(" ");
            System.out.println(" ");
        }
    }

    public static void chooseDuckType(Duck duck){


        if(duck instanceof MallardDuck){
            MallardDuck ducky = (MallardDuck) duck;
            ducky.fly();
            ducky.quack();

        }
        if(duck instanceof RedHeadDuck){

            RedHeadDuck ducky = (RedHeadDuck) duck;
            ducky.fly();
            ducky.quack();
        }
    }
}
