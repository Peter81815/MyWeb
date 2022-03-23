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

public class tryyy
{

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


