package org.example.TaskB;

public class Dog extends Animal{
    public Dog(String name){
        this.name = name;
    }

    public void sound(){
        System.out.println("bow bow");
    }
    public void getName(){
        System.out.println(name);
    }
}
