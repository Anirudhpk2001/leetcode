class Solution(object):
    def reverseWords(self, s):
        word1=""
        for word in s.split():
            
            word1= word+" "+word1
        return word1.strip()
        """
        :type s: str
        :rtype: str
        """
        