public class MinJump
{
	public static void main(String[] args) {
		
        //int[] intArray = new int[]{ 2,3,1,1,4};
        int[] intArray = new int[]{ 2,3,0,1,4};
		int results = jump(intArray);
		System.out.println(results);
		return;
	}
    public static int jump(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int currentLevel = 0;
        int maxOnThisLevel = 0;
        int minJumps = 0;
        
        for(int i = 0; i < nums.length; i++){
            maxOnThisLevel = Math.max(maxOnThisLevel, nums[i]+i);
            if(maxOnThisLevel >= nums.length-1){
                return minJumps+1;
            }
            if(i == currentLevel){
                currentLevel = maxOnThisLevel;
                minJumps++;
            }
            
        }
        return minJumps;
    }
    
}