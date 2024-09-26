import java.util.Hashtable;

public class q1 {

    public static int[] twoSum(int[] nums, int target) {

        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (ht.containsKey(target - nums[i])) {
                return new int[] {ht.get(target - nums[i]), i};
            }
            ht.put(nums[i], i);
        }
        return null;
    }
    public static void main(String[] args) {
        int [] nums = {2, 7, 11, 15};
        int target = 9;
        int [] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}