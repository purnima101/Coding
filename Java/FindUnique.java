import java.util.*;

import java.util.*;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 3, 4, 1, 3,4,7 };
        int i, a=arr[0];
        for(i = 1; i < arr.length; i++){
            a=a^arr[i];
        }
        System.out.println(a);
    }
}
