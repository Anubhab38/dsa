class Solution:
    def missingNumber(self, nums: list[int]) -> int:
        n=len(nums)
        rsum=n*(n+1)//2
        nsum=0
        for i in range (n):
            nsum=nsum+nums[i]

        missing_num=rsum-nsum

        return missing_num