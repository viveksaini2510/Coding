interface Animal{
    public void walk();
    int eyes =2;
    public void eat();
}

interface Herbivore{
    
}

class Horse implements Animal , Herbivore{
    public void walk(){
        System.out.println("Horse walks on 4 legs.");
    }
    public void eat(){
        System.out.println("Horse eat grasses.");
    }
}

public class oopss{
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.eat();
        horse.walk();
    }
}