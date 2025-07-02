class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:

        frequency_map = {}

        for num in arr:
            frequency_map[num] = frequency_map.get(num,0)+1
        
        res_set = set()

        for key,value in frequency_map.items():
            if value in res_set:
                return False
            else :
                res_set.add(value)
        

        return True
        