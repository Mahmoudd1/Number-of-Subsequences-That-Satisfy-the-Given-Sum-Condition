import java.util.Arrays;

public class Solution {
    final int mod=(int)Math.pow(10,9) + 7;
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int result =0;
        int start=0;
        int end=nums.length-1;
        int []powof2=new int [nums.length];
        powof2[0]=1;
        for (int i=1;i<nums.length;i++)
        {
            powof2[i]=2*powof2[i-1]%mod;
        }
        while (end>=0)
        {
            if (nums[end]+nums[start]>target)
                end--;
            else
                break;
        }
        result=powof2[end-start];
        start++;
        while (start<=end)
        {

            if (nums[end]+nums[start]>target)
            {
                end--;
            }
            else
            {
                result+=powof2[end-start];
                result%=mod;
                start++;
            }
        }
        return (int)result;
    }
}
