import java.util.*;
import java.util.ArrayList;
public class ArrayListGuide{

    public static void main(String[] args){
        ArrayList<String> alist = new ArrayList<String>();


        //To add
        alist.add("Varun");
        alist.add("Ronaldo");
        alist.add("Rooney");


        //To print
        for(String str:alist){
            System.out.println(str);
        }
        System.out.println(alist.size());
        for(int i = 0 ; i< alist.size(); i++){
            System.out.println(alist.get(i));
        }
    }

}