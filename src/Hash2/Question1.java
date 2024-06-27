package Hash2;

import java.util.HashMap;
import java.util.Map;

public class Question1 {



    public static boolean findIntersection(int[] arr1, int[] arr2){
//        for(int i : arr1){
//            for(int j : arr2){
//                if(i == j){
//                    return true;
//                }
//            }
//        }
//        return false;

        Map<Integer, Boolean> map = new HashMap<>();
        for (int i : arr1){
            map.put(i, true);
        }

        for(int j : arr2){
            if(map.get(j) != null) return true;
        }

        return false;


    }


    public static void main(String[] args) {

        int[] arra1 = {1,3,5};
        int[] arra2 = {2,4,5};

        System.out.println(findIntersection(arra1, arra2));

    }
}
