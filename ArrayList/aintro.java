
import java.util.*;
public class aintro {

    public static void swap(ArrayList<Integer> List,int i,int j){
        int temp=List.get(i);
        List.set(i,List.get(j));
        List.set(j,temp);
    }
    public static void main(String args[]){
        ArrayList<Integer>List=new ArrayList<>();
        //add operation in ArrayList is o(1)
        List.add(10);//add 10 to the list
        System.out.println(List);//[10]
        List.add(20);//add 20 to the list
        System.out.println(List);//[10, 20]
        List.add(30);//add 30 to the list
        System.out.println(List);//[10, 20, 30]

        //get operation in ArrayList is o(n)
        List.remove(1);//remove 20 from the list
        System.out.println(List);//[10, 30]
        //this add operation is o(n)
        List.add(1,20);//add 20 to the list at index 1
        System.out.println(List);//[10, 20, 30]

        //get operation in ArrayList is o(1)
        int element=List.get(1);//get the element at index 1
        System.out.println(element);//20

        //set operation in ArrayList is o(n)
        List.set(1,40);//set 40 at index 1

        //contains
        System.out.println(List.contains(30));//true

        //size
        System.out.println(List.size());//3


        //reverse arayslist-O(n)
        for(int i=List.size()-1;i>=0;i--){
            System.out.print(List.get(i)+" ");
        }

        //Maximum element in the list
        int max=Integer.MIN_VALUE;
        for(int i=0;i<List.size();i++){
            if(List.get(i)>max){
                max=List.get(i);
            }
            // max=Math.max(max,List.get(i));
        }
        System.out.println("The maximum value of List is: "+max);


        //sort in ascending order
        Collections.sort(List);
        System.out.println(List);

        //sort in descending order
        Collections.sort(List,Collections.reverseOrder());
        System.out.println(List);

    }
}
