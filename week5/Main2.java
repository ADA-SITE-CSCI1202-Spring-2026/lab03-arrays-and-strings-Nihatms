package week5;
import java.util.Arrays;
public class Main2 {



public static String explode(String s) {
        StringBuilder result = new StringBuilder();


        for (int i = 1; i <= s.length(); i++) {
            result.append(s.substring(0, i));
        }
        return result.toString();
    }

public static String sortChars (String s) {
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    return new String(chars);

}

public static String areAnagrams (String s1, String s2) {
    char[] chars1 = s1.toCharArray();
    char[] chars2 = s2.toCharArray();
    Arrays.sort(chars1);
    Arrays.sort(chars2);
    return new String(chars1).equals(new String(chars2)) ? "are Anagrams" : "not Anagrams";

}

public static String swap(String s) {
   StringBuilder sb = new StringBuilder();
    String[] s_array = s.split(" ");
    for (int i =0; i < s_array.length; i++) {
        char[] c = s_array[i].toCharArray();
        char temp = c[0];
        c[0] = c[c.length - 1];
        c[c.length - 1] = temp;

        sb.append(c);
        sb.append(" ");
    }

    return sb.toString();

}


    public static void main(String[] args) {

        // System.out.println(sortChars("December"));

        // System.out.println(areAnagrams("listen", "silent"));
        
       



        
        // System.out.println(explode("Baku"));


        // StringBuilder result  = new StringBuilder();
        // String s2 = "Baku";
        // for (int i = 0;  i < s2.length(); i++) {
        //     for (int j = 0; j <= i; j++) {
        //         result.append(s2.charAt(i));
        //     }
        // }
        // System.out.println(result);



        


    }
}
