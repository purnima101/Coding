package JavaDSA;

import java.util.*;
public class InsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 0;
        int size=nums.length;
        int l=0, r = size - 1;
        int ans = -1;
        while(l<=r)
        {
            int mid = (l+r)/2;

            if(nums[mid]==target)
            {
                ans= mid;
            }
            else if(nums[mid]>target)
            {
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }

        System.out.println(l);
        System.out.println(r);



    }
}
