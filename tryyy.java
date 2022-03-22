import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.LinkedList;

//binary tree//


public class tryyy
{
    ////////////////////////自己寫 很爛 不需要考慮前後，只需要考慮大於後一個就好////////////////////////
    // public int findPeakElement(int[] nums) {
    //     int pre=Integer.MIN_VALUE;
    //     int bac=Integer.MIN_VALUE;
    //     for(int i=0;i<nums.length;i++){
  
    //         if(i+1>=nums.length)
    //             bac=Integer.MIN_VALUE;
    //         else
    //             bac=nums[i+1];
    //         if(i-1<0)
    //             pre=Integer.MIN_VALUE;
    //         else
    //             pre=nums[i-1];
    //         if(nums[i]>pre && nums[i]>bac)
    //             return i;
    //         int j=nums.length-i-1;
    //         if(j+1>=nums.length)
    //             bac=Integer.MIN_VALUE;
    //         else
    //             bac=nums[j+1];
    //         if(j-1<0)
    //             pre=Integer.MIN_VALUE;
    //         else
    //             pre=nums[j-1];
    //         if(nums[j]>pre && nums[j]>bac)
    //             return j;
    //     }
    //     return 0;
    // }

    

    ///////////////////別人較差的方法O(n)//////////////////// 
    ///////////////////Time complexity : O(n). We traverse the nums array of size  n once only.  
    ///////////////////Space complexity : O(1). Constant extra space is used. 

    // public int findPeakElement(int[] nums) {
    //     for (int i = 0; i < nums.length - 1; i++) {
    //         if (nums[i] > nums[i + 1])
    //             return i;
    //     }
    //     return nums.length - 1;
    // }

    ///////////////////別人較好的方法O(logn)////////////////////
    /////////Space complexity :  O (log2 ( n ))
    //We reduce the search space in half at every step. 
    //Thus, the total search space will be consumed in  l o g 2 ( n )steps. 
    //Thus, the depth of recursion tree will go upto  l o g 2 ( n )

    // public int findPeakElement(int[] nums) {
    //     return search(nums, 0, nums.length - 1);
    // }
    // public int search(int[] nums, int l, int r) {
    //     if (l == r)
    //         return l;
    //     int mid = (l + r) / 2;
    //     if (nums[mid] > nums[mid + 1])//把nums[mid + 1]當作-∞
    //         return search(nums, l, mid);
    //     return search(nums, mid + 1, r);
    // }

    ///////////////////別人較好的方法O(logn)////////////////////
    /////////Space complexity : O(1)
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }


    public static void main(String[] args) 
    {
       tryyy tr=new tryyy(); 
       int[] input={1,2,1,3,5,6,7};
       //int[] input={1,2,3,3,5,6,4};
       System.out.println(tr.findPeakElement(input));
       //System.out.println(Integer.MIN_VALUE);        
    }



}


