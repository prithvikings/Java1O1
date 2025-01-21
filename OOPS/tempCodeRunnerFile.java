// Purpose: To learn about interfaces in Java 
// ------------------------------------------------------------------------------------------------------------ 
// An interface is a reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Method bodies exist only for default methods and static methods. Interfaces cannot be instantiated—they can only be implemented by classes or extended by other interfaces.

//interface is a blueprint of a class. It has static constants and abstract methods only.

//The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.

//In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.
public class interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        King k = new King();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Queen can move in any direction");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("King can move in any direction but only one step");
    }
}

class Bishop implements ChessPlayer {
    public void moves() {
        System.out.println("Bishop can move diagonally");
    }
}
