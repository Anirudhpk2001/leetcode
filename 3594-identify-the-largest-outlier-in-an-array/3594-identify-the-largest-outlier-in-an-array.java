class Solution {
    public int getLargestOutlier(int[] nums) {
        HashMap<Integer,Integer> countMap = new HashMap<>();
        int totalSum = 0;
        for(int num:nums)
        {
            totalSum+=num;
            countMap.put(num,countMap.getOrDefault(num,0)+1);
        }


        int maxOutlier = Integer.MIN_VALUE;
        for(int num:nums)
        {
            countMap.put(num,countMap.getOrDefault(num,0)-1);

            int remainingSum = totalSum - num;

            if (remainingSum % 2 == 0) {
                int target = remainingSum / 2;
                if (countMap.getOrDefault(target, 0) > 0) {
                    maxOutlier = Math.max(maxOutlier, num);
                }
            }

            countMap.put(num,countMap.getOrDefault(num,0)+1);
        }

        return maxOutlier;



    }
}