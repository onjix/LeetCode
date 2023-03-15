class Solution {
    public int pivotIndex(int[] nums) {
     int left_sum = 0;
     int right_sum = 0;
     int p=-1;
     for(int i=0;i<nums.length;i++) {
         for(int j=0;j<i;j++) {
             left_sum += nums[j];
             if(i==0) {
                 left_sum = 0;
             }
         }
         System.out.println(i+": "+left_sum + " ");
         for(int h=i+1;h<nums.length;h++) {
             right_sum += nums[h];
         }
         System.out.println(i+": "+right_sum + " ");
         if(left_sum == right_sum) {
             p = i;
             break;
         }
         left_sum = 0;
         right_sum = 0;
     }
     return p;   
    }
}