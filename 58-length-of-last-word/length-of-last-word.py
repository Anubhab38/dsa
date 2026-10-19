class Solution(object):
    def breakIntoList(self, s):
        wordList=s.split()
        return wordList

    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        x=self.breakIntoList(s)
        ap=len(x[-1])
        return ap