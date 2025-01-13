package org.example.TaskB;

public class Cat extends Animal{

    public Cat(String name){
        this.name = name;
    }

    public void sound(){
        System.out.println("meow meow");
    }
    public void getName(){
        System.out.println(name);
    }

}
