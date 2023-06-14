import java.util.*;
public class Alternate {
    public static void main(String[] args)
    {
        int[] array = new int[]{1,2,3,4,5};
        int temp=0,i;

        for(i = 0; i < array.length-1; i=i+2)
        {
            temp=array[i];
            array[i]=array[i+1];
            array[i+1]=temp;

        }
        for(i = 0; i < array.length; i++){
        System.out.println(array[i]);
        }
    }
}