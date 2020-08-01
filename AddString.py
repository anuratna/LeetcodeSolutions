class Solution:
    def addStrings(self, num1: str, num2: str) -> str:
        
        length = max(len(num1),len(num2))
        a = num1.zfill(length)
        b=num2.zfill(length)
        
        carry =0
        result=""
        
        for i in range(length-1,-1,-1):
            total=int(a[i])+int(b[i])+carry
            if(total>9):
                number = str(total) 
                num = number[len(number)-1]
                carry=int(number[0])
                result=num+result
            else:    
                result=str(total)+result
                carry=0
        if(carry>0):
            result=str(carry)+result
        return result
