package Inheritance;

// Single and Multilevel Inheritance
class Animal{
    void eat(){
        System.out.println("eating");
    }
}

class Dog extends Animal{
    void Bark(){
        System.out.println("Barking");
    }
}

class babyDog extends Dog{
    void Baby(){
        System.out.println("crying");
    }
}
public class Types {

    public static void main(String[] args) {
        babyDog obj = new babyDog();
        obj.eat();
        obj.Baby();
        obj.Bark();

       
    }
}

