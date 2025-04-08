class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        
        return new int[] {};
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);

        // Output the result
        if (result.length == 2) {
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No pair found.");
        }
    }
}
