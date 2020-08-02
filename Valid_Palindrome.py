class Solution:
    def isPalindrome(self, s: str) -> bool:
        regex = re.compile('[^a-zA-Z0-9]')
        s=regex.sub('',s)
        s=s.lower()
        i=0
        j=len(s)-1
        
        if(len(s)==1):
            flag = True
            return flag
        
        if(s==""):
            flag=True
            return flag
        
        for i in range(len(s)-1):
                if(s[i]==s[j]):  
                    flag = True;
                    j=j-1  
                else:
                    flag = False
                    break;
        return flag    
