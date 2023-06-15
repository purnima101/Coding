import java.util.*;
public class FindDuplicates {
    public static void main(String[] args)
    {
    int[] nums=new int[]{1,2,4,4,1};
    HashMap<Integer, Integer> mp= new HashMap<Integer, Integer>();
        int i;
        ArrayList<Integer> arr=new  ArrayList<Integer>();
        for(i=0;i<nums.length;i++)
        {
            if(mp.containsKey(nums[i])){
                int t=mp.get(nums[i]);
                mp.put(nums[i],t+1);
            }
            else{
                mp.put(nums[i],1);
            }
        }

        for(Integer key: mp.keySet()){
            if(mp.get(key)==2){
                arr.add(key);
            }
        }

        System.out.println(arr);
}
}
