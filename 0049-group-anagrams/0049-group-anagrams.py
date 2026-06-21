class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = {}

        for str in strs:
            char_sorted = sorted(str)
            sorted_str = "".join(char_sorted)

            if sorted_str in map:
                map[sorted_str].append(str)
            
            else:
                map[sorted_str] = [str]
        

        result =  map.values()
        return list(result)