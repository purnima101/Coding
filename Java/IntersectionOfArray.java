import java.util.*;
public class IntersectionOfArray {
    public static void main(String[] args){
        int[] arr1=new int[]{1,4,5};
        int[] arr2=new int[]{2,4,5 };
        ArrayList<Integer> arr=new  ArrayList<Integer>();
        int i=0,j=0;
         while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j])
            {
            arr.add(arr1[i]);
            i++;
            j++;
            }
            else if(arr1[i]<arr2[j])
            {
                i++;
            }
            else{
                j++;
            }
        }
            // for(int x=0; x<arr.length; x++)
            System.out.println(arr);

    }
    
}
