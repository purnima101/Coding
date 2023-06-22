package JavaDSA;
import java.util.*;
public class HighestSecondHigh {
    public static int[] findTopTwoScores(int[] array){
        int arr[]=new int[2];
        int maxNum=Integer.MIN_VALUE;
        int maxNum2=Integer.MIN_VALUE;
        int i;
        for(i=0;i<array.length;i++)
        {
            if(array[i]>maxNum)
            {
                 maxNum2=maxNum;
                maxNum=array[i];
               
            }
            if(array[i]<maxNum && array[i]>maxNum2){
                maxNum2=array[i];
            }
        }
        
        arr[0]=maxNum;
        arr[1]=maxNum2;
        return arr;
      }

      
    
}
