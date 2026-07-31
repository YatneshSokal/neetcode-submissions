public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int num=numbers[i];
            int diff = target - num;
            if (mp.containsKey(diff)) {
                return new int[] { mp.get(diff), i+1 };
            }
            mp.put(num, i+1);
        }
        return new int[0];
    }
}