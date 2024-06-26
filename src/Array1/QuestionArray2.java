package Array1;

public class QuestionArray2 {

    public static int[] merge(int[] arr1, int[] arr2){

        int index1 = arr1.length;
        int index2 = arr2.length;

        int arra1Length = arr1.length - 1;
        int arra2Length = arr2.length - 1;

        int[] returnArray = new int[index1 + index2];
        int returnArrayLength = returnArray.length - 1;

        while(arra1Length >= 0 && arra2Length >= 0){
            if (arr1[arra1Length] > arr2[arra2Length]){
                returnArray[returnArrayLength] = arr1[arra1Length];
                returnArrayLength--;
                arra1Length--;
            }else{
                returnArray[returnArrayLength] = arr2[arra2Length];
                returnArrayLength--;
                arra2Length--;
            }
        }

        while(arra1Length >= 0){
            returnArray[returnArrayLength] = arr1[arra1Length];
            returnArrayLength--;
            arra1Length--;

        }

        while(arra2Length >= 0){
            returnArray[returnArrayLength] = arr2[arra2Length];
            returnArrayLength--;
            arra2Length--;
        }


        for (int i : returnArray){
            System.out.print(i + " ");
        }
        return returnArray;

    }

    public static void main(String[] args) {

        QuestionArray2 q = new QuestionArray2();

        int[] arra1 = {0,3,4,31};
        int[] arra2 = {4,6,30};

        q.merge(arra1, arra2);

    }
}
