class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> Map=new HashMap<>();
        Set<Integer> out=new HashSet<>();
    
        for(int i=0;i<arr.length;i++)
        {
           Map.put(arr[i],Map.getOrDefault(arr[i],0)+1);
        }
        for(int num:Map.values())
        {
            out.add(num);
        }
        
        return Map.size()!=out.size() ? false :true;

    }
}