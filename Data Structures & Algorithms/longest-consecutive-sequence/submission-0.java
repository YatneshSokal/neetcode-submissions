public class Solution {

    public int longestConsecutive(int[] nums) {

        // HashSet for O(1) lookup
        Set<Integer> numSet = new HashSet<>();

        // store all numbers in the set
        for (int num : nums) {
            numSet.add(num);
        }

        int longest = 0;

        // check each number
        for (int num : numSet) {

            // only start counting if it is the beginning of a sequence
            // (meaning num-1 does not exist)
            if (!numSet.contains(num - 1)) {

                int length = 1;

                // keep checking the next numbers in the sequence
                while (numSet.contains(num + length)) {
                    length++;
                }

                // update longest sequence length
                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}