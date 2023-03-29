class Solution {
    public int search(int[] nums, int target) {
        int index = -1;
        int j = 0;
        for(int i : nums) {
            if(i == target) {
                return j;
            }
            j++;
        }
        return index;
    }
}