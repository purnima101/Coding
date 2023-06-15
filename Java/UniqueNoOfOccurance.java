import java.util.*;
public class UniqueNoOfOccurance {
    public static void main(String[] args)  {
        int[] arr = new int[] {1,2,3,3,2,2,2};
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int i;
        for (i = 0; i < arr.length; i++) {
            if(mp.containsKey(arr[i]))
            {
                int t=mp.get(arr[i]);
                mp.put(arr[i],t+1);
            }
            else{
                mp.put(arr[i],1);
            }
        }
        System.out.println(mp);
        HashSet<Integer> h=new HashSet<Integer>();
        int x=0;
        for(Integer key: mp.keySet()) {
            if(!h.contains(mp.get(key))){
                    h.add(mp.get(key));
            }
            else{
                x++;
            }
        }
        if(x>0){
            System.out.println("false");
        }
        else
        System.out.println("true");

    }

}
