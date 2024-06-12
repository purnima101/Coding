import java.util.*;
public class HashingAlphabets {
    public static void main(String[] args)
    {


        String s="hi my name is purnimaaaaa";
        int[] arr = new int[26];
        int a = 'a';
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) !=' '){
            int index = s.charAt(i);
            // System.out.println(index);
            arr[index-a] += 1;
            }
        }
        for(int i = 0; i < arr.length; i++){
        // System.out.println((char)(i+a));
        System.out.println(arr[i]);
        }
    }
}