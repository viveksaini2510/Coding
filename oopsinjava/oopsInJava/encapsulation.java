abstract class Animal{
    abstract void walk();
    public void eat(){
        System.out.println("Animals eat");
    }
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs ");
    }
}

class Chicken extends Animal{
    public void Walk(){
        System.out.println("Walks on 2 legs ");
    }

    @Override
    void walk() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'walk'");
    }
}


public class encapsulation {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();
        // Amimal animal = new Animal();
        // animal.walk;
    }
    
}
