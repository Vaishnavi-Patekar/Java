import java.util.ArrayList;
import java.util.Collections;


public class arraylist {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        //add elements 

        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println(list);

        //get elememts
        int ele = list.get(0);
        System.out.println(ele);

        //add elements in between
        list.add(1,5);
        System.out.println(list);

        //set element
        list.set(0,5);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);


        //size
        int size = list.size();
        System.out.println(size);

        //loops
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println();


        //sorting
        Collections.sort(list);
        System.out.println(list);

    }
}
