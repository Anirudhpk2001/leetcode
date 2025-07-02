class Solution:
    def closeStrings(self, word1: str, word2: str) -> bool:
        if len(word1) > len(word2) or len(word1) < len(word2):
            return False
        
        word1_freq = {}
        word2_freq = {}

        for i in range(len(word1)):
            word1_freq[word1[i]] = word1_freq.get(word1[i],0)+1
            word2_freq[word2[i]] = word2_freq.get(word2[i],0)+1

        for key,value in word1_freq.items():
            if key not in word2_freq:
                return False


        word1_list = sorted(word1_freq.values())
        word2_list = sorted(word2_freq.values())

        return word1_list == word2_list




