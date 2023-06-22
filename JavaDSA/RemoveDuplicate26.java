package JavaDSA;
import java.util.*;
public class RemoveDuplicate26 {
    public static void main(String args[]) {
    int nums[]={-3,-1,0,0,0,3,3};
    HashMap<Integer,Integer> h1= new HashMap<Integer,Integer>();
      int i;
      for(i=0;i<nums.length;i++)
      {
          if(h1.containsKey(nums[i]))
          {
              int t=h1.get(nums[i]);
              h1.put(nums[i],t+1);
          }
          else
          {
                h1.put(nums[i],1);
          }
      }
        int x=0;
       for(Integer key: h1.keySet()){
            nums[x]=key;
            x++;
        }

      System.out.println(h1);
      System.out.println(Arrays.toString(nums));
    }
}
