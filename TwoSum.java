import java.util.HashMap;

class TwoSum {

    public static int[] TS (int[] nums, int self){
        HashMap<Integer, Integer> hm = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int diff = self - nums[i];
            if (hm.containsKey(diff)) {
                return new int[]{i,hm.get(diff)};
            }
            hm.put(nums[i], i);
        }
        return new int[]{0,0};
    }
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8};
        int SelfNum = 3;
        TS(numbers, SelfNum);
    }
}