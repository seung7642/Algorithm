enum Index {
    GOOD, BAD, UNKNOWN
}

class Solution {
    
    private Index[] memo;
    
    public boolean canJump(int[] nums) {
        memo = new Index[nums.length];
        for (int i = 0; i < memo.length; i++) {
            memo[i] = Index.UNKNOWN;
        }
        memo[memo.length - 1] = Index.GOOD;
        return canJumpFromPosition(0, nums);
    }
    
    private boolean canJumpFromPosition(int position, int[] nums) {
        if (memo[position] != Index.UNKNOWN) {
            return memo[position] == Index.GOOD;
        }
        
        int furthestJump = Math.min(position + nums[position], nums.length - 1);
        for (int nextPosition = position + 1; nextPosition <= furthestJump; nextPosition++) {
            if (canJumpFromPosition(nextPosition, nums)) {
                memo[position] = Index.GOOD;
                return true;
            }
        }
        
        memo[position] = Index.BAD;
        return false;
    }
}