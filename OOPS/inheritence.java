//inheritance is when properties & methods of base class are passed on to a derived class.
//from parent/base to child/derived class.
//In java their are types of inheritance:

//Single level inheritance: When a class inherits properties & methods of only one class.

//Multi level inheritance : When a class inherits properties & methods of more than one class.One class derived by another derived class and so on.

//Hierarchial Inheritance : When more than one class inherits properties & methods of one class. single base class with multiple derived classes.

//Hybrid Inheritance : Combination of two or more types of inheritance in a single program.

//mutliple inheritance : When a class inherits properties & methods of more than one class. Java does not support multiple inheritance. It is supported by C++ but not by Java. 

public class inheritence{
    public static void main(String[] args) {
        Fish f1=new Fish();
        System.out.println(f1.color);
        f1.breathe();
        f1.eat();
        System.out.println(f1.fins);
        f1.swim();
    }
}


//Base class
class Animal{
    String color="grey";

    void eat(){
        System.out.println("Eating");
    }

    void breathe(){
        System.out.println("Breathing");
    }
}

//Derived class
class Fish extends Animal{
    //Inheritance is used to inherit properties and methods from base class to derived class.
    int fins=2;
    void swim(){
        System.out.println("Swimming");
    }
}