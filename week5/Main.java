package week5;

public class Main {

      public static String reverse(String s) {
        String result = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            result = result + s.charAt(i); // c) charAt
        }

        return result;
    }
    public static void main(String[] args) {
        
        String s = "Hello";
        System.out.println(reverse(s));

        
       
         

        
    }
}