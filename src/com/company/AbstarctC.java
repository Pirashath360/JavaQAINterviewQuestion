package com.company;
// Abstract method and Abstract Class

public class AbstarctC {

    public static void main(String args[]){
        Mahesphone obj= new thevaphone();// cannot instaniate the abstract class
        obj.call();
        obj.cook();
        obj.cook();
        obj.move();
    }
}
    abstract class Mahesphone{
    public void call(){
        System.out.println("pirashath is moving");
    }

    public abstract void move();
    public abstract void dance();
    public  abstract void cook();
}
 abstract class pirashathphone extends Mahesphone{
    public void move(){
        System.out.println("pirshath is moving to canada");
    }

}
class thevaphone extends Mahesphone{
    public void move(){
        System.out.println("shath is Moving");
    }
  // public void Dance(){
      //  System.out.println("shath is Dancing");

        public void dance(){
            System.out.println("shath is Dancing");

    }
    public void cook(){
        System.out.println("Shath is singing");

    }
}



