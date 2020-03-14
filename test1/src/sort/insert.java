package sort;

import java.util.Arrays;

/**
 * @Auther: hsx
 * @Date: 2020/3/11
 * @Description: sort
 * @version: 1.0
 */
public class insert {
    public static void main(String[] args) {
        int[] nums={1,5,8,6,4,2,10,3};

        insert q =new insert();
        q.insertSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void insertSort(int[] nums){
        int len=nums.length;
        for(int i=1;i<len;i++){
            for(int j=i+1;j>=1;j--){
                int k=nums[j];
                if(nums[j]<=nums[j-1]){

                }else{

                }
            }
        }
    }
}
