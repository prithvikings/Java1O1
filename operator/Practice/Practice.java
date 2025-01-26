
public class Practice {
    public static void qs1(int x, int y){
        int exp1=(x*y/x); //first x get multiple by y then it is divided by y
        int exp2=(x*(y/x)); //first y get divide by x and then multipyl by x
        System.out.println(exp1);
        System.out.println(exp2);
    }
    public static void qs2(int x, int y, int z){
        if(x>y && y>z){
            System.out.println("Hello");
        }

        if(z>y && z<x){
            System.out.println("Java");
        }
        if((y+200)<x && (y+150)<z){
            System.out.println("Hello Java");
        }
    }

    public static void qs3(int x){
        int y,z;
        x=y=z=2;
        x+=y;
        y-=z;
        z/=(x+y);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    public static void main(String[] args) {
        // qs1(2,5);
        // qs2(200,50,100);
        qs3(2);
    }
}
