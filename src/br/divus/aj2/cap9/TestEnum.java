package br.divus.aj2.cap9;

enum Animal {
    DOG("walk"), BIRD("fly"), FISH("swim");

    String movement;

    Animal(String s) {
        movement = s;
    }
}

public class TestEnum {
    static Animal animal;
    
    public static void main(String[] args) {
        System.out.println(animal.DOG.movement + " " + animal.FISH.movement);
    }
}
