package techproed2020.day22eachloop;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
public class ForEachLoop02 {
    private static String[] list1;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
double sum = 0;
        for(int w : list){
            sum +=w;

        }
        System.out.println(sum/list.size());
        
        ArrayList<String> List1 = new ArrayList<String>();
        List1.add("Ab");
        List1.add("cd");
        List1.add("Ef");
        List1.add("gh");
        List1.add("Ij");

/*
        for(String m : list1){
            if(m.charAt(0)>= 'a' && m.charAt(0)<'z'){
                list1. (m);
            }
            System.out.println(list1);
        }
  */
        
    }
}
