package org.example.TaskB;

public class Duck extends Animal{
    public Duck(String name){
        this.name = name;
    }

    public void sound(){
        System.out.println("quack quack");
    }
    public void getName(){
        System.out.println(name);
    }
}
