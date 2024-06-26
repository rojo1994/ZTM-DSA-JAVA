package Array1;

public class QuestionArray1 {

    public static String reversedString(String string){
        String newString = "";
        for(int i = string.length() -1 ; i >= 0 ; i--){
            newString = newString + string.charAt(i);
        }
        return newString;
    }


    public static void main(String[] args) {
        System.out.println(reversedString("rodrigo"));
    }
}
