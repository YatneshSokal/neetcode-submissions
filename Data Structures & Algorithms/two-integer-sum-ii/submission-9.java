class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> prevmap=new HashMap<>();
        
        for(int i=0;i<numbers.length;i++){
            int num=numbers[i];
            int diff=target-num;

            if(prevmap.containsKey(diff)){
                return new int[]{prevmap.get(diff),i+1};
            }
            prevmap.put(num,i+1);
        }
        return new int[0];
    }
}
