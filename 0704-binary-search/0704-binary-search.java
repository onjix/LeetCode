class Solution {
    public int search(int[] nums, int target) {
        int j = 0;
        for (int i : nums) {
            if(target == i) {
                return j; 
            }
            j++;
        }
        return -1;
    }
}