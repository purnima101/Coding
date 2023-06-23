package JavaDSA;
import java.util.*;
class Plusone66{
    public static int[] plusOne(int[] digits) {
        int i,n=digits.length;

        for(i=n-1;i>=0;i--)
        {
            if(digits[i]!=9)
            {
                digits[i]=digits[i]+1;
                return digits;
            }

            else{
                digits[i]=0;
            }
        }

        int arr[]=new int[n+1];

        arr[0]=1;
        return arr;
    }

    public static void main(String[] args){
        int n[]={9,9,9};
        System.out.println(Arrays.toString(plusOne(n)));
    }
}