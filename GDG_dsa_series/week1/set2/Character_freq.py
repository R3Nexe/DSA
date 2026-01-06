class Solution(object):
    def frequencySort(self, s):
                freq={}

                for i in s:
                                freq[i]=freq.get(i,0)+1
                res=""
                for chr,cnt in freq.items():

