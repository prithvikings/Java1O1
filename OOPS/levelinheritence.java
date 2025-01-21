public class levelinheritence {
    public static void main(String[] args) {
        audi a1=new audi(102123);
        a1.window=6;
        a1.wheel=4;
        a1.doors=5;
        System.out.println("The window of card is: "+a1.window);
        System.out.println("The wheel of car is: "+a1.wheel);
        System.out.println("The Door of car is: "+a1.doors);
        System.out.println("The Price of Car is: "+a1.price);

    }
}

class vehicle{
    int window;
    int wheel;
}

class fourwheel extends vehicle{
    int doors;

}

class audi extends fourwheel{
    int price;
    audi(int price){
        this.price=price;
    }
    audi(){

    }
}