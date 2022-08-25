class solution:
    def longestPalindrome(self, s: str) -> str:
        res=""
        resLen=0

        for i in range(len(s)):
            # odd length
            l,r = i,i
            while 1>=0 and r<len(s) and s[l] == s[r]:
                if(r-l+1)>resLen:
                    res=s[l:s+1]
                    resLen=r-1+1
                l-=1
                r+=1

            #even length
            l,r = i,i+1
            while 1>=0 and r<len(s) and s[l] == s[r]:
                if(r-l+1)>resLen:
                    res=s[l:s+1]
                    resLen=r-1+1
                l-=1
                r+=1

        return res