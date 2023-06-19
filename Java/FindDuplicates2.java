import java.util.*;

public class FindDuplicates2 {
    public static void main(String[] args) {
        int[] nums = new int[] { 4,3,2,7,8,2,3,1 };
        int ans=0;
        int i;
        for(i=0;i<nums.length;i++)
        {
            ans=ans^nums[i];
        }

System.out.println(ans);
    }
}