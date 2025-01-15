public class incometax{
    public static void main(String[] args){
        int income=400000;
        int tax;
        if(income<500000){
            tax=0;
            System.out.println("No tax");
        }else if(income>=500000 && income<1000000){
            tax=(income*10)/100;
            System.out.println("Tax is: "+tax);
        }else if(income>=1000000 && income<1500000){
            tax=(income*20)/100;
            System.out.println("Tax is: "+tax);
        }else{
            tax=(income*30)/100;
            System.out.println("Tax is: "+tax);
        }
    }
}