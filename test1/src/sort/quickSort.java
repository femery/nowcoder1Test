package sort;

import java.util.Arrays;

/**
 * @Auther: hsx
 * @Date: 2020/3/11
 * @Description: search
 * @version: 1.0
 */
public class quickSort {
    public static void main(String[] args) {
        int[] nums={1,5,8,6,4,2,10,3};

        quickSort q =new quickSort();
        q.quick(nums,0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public void quick(int[] nums,int start,int end){
        if(start>=end){
            return;
        }
        int k=nums[start];
        int j=end;
        int i=start;
        while(start<end){
            while(start<end &&nums[end]>=k){
                end--;
            }
            if(start<end){
                nums[start]=nums[end];
                start++;
            }
            while(start<end && nums[start]<=k){
                start++;
            }
            if(start<end){
                nums[end]=nums[start];
                end--;
            }
        }
        nums[start]=k;
        quick(nums,i,start-1);
        quick(nums,start+1,j);

    }

}
