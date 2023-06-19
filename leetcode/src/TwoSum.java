
public class TwoSum {
    public static void firstSolution(int[] nums, int target) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (count<2){
                if (target - nums[i]==nums[j]){

                        System.out.print(i +",");
                        count++;
                    }
                }
                }
            }
        }
        //System.out.println("["+sb.deleteCharAt(3)+"]");

  //  }


    public static void main(String[] args) {
        int array[]= new int[]{6,0,3,4,5,6,7};//
        firstSolution(array,7);

    }
}

//Input: nums = [2,7,11,15], target = 9  9-i = 7; if (target>i){if(target-nums[i])}
//Output: [0,1] // output i1,i2
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].