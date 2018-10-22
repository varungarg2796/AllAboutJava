import java.util.*;
import java.util.ArrayList;
public class ArrayListGuide{

    public static void main(String[] args){
        ArrayList<String> alist = new ArrayList<String>();
        //To add
        alist.add("Varun");
        alist.add("Ronaldo");
        alist.add("Rooney");

        //To add at a specific position
        alist.add(1,"Martial");

        //To get to know the size
        System.out.println(alist.size());
        //To print
        for(String str:alist){
            System.out.println(str);
        }

        //Removes from specific position(index) and by value
        alist.remove("Martial");
        alist.remove(1);

        //To update an element
        alist.set(1, "Varun");

        //To get the index
        System.out.println(alist.indexOf("Varun"));

        //Getting value by index
        System.out.println(alist.get(2));

        //Returns true or false
        alist.contains("Varun");

        //Removes everything
        alist.clear();

        //Get the size
        System.out.println(alist.size());
        
        //Print it
        for(String str:alist){
            System.out.println(str);
        }
        for(int i = 0 ; i< alist.size(); i++){
           System.out.println(alist.get(i));
        }
    }

}