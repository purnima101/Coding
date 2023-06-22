package JavaDSA;
import java.util.*;
public class SearchInsertPosition35 {
    public static void main(String args[]) {
        int nums[]={1,3,5,6}, target=7;
        int l=0,m=nums.length-1;
        int a=-1, p;
        while(l<m)
        {
            a=(l+m)/2;
            if(nums[a]==target)
            {
                System.out.println (a);
            }
            else if(target<nums[a])

            {
                    m=a-1;
            }

            else
            {
                l=a+1;
            }
        }

        if(l==m)
        {
            if(target<=nums[l])
            System.out.println(m);
            else{
                System.out.println(m+1);
            }
            
        }

        // System.out.println(a);
    }
}
