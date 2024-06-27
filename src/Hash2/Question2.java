package Hash2;

import java.util.HashSet;
import java.util.Set;

public class Question2 {

    public static int firstRecurring(int[] arr){
        Set<Integer> set = new HashSet<>();


        for(int i : arr){
            if(set.contains(i)){
                return i;
            }

            set.add(i);
        }

        return -1;

    }


    public static void main(String[] args) {
        int[] arr = {1,5,1,2,3,5,1,2,4};

        System.out.println(firstRecurring(arr));


    }
}
