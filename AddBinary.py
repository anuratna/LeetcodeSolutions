def addBinary(self, a: str, b: str) -> str:
        lenA= len(a)
        lenB=len(b)
        length = max(lenA,lenB)
         
        a=a.zfill(length)
        b = b.zfill(length)
     
        carry = 0
        answer=""
        
        for i in range(length-1, -1,-1): 
            if(int(a[i])+int(b[i])+carry==2):
                answer=str(0) + answer
                carry = 1
                
            
            elif(int(a[i])+int(b[i])+carry==1): 
                answer=str(1)+answer  
                carry =0
               
                
            elif(int(a[i])+int(b[i])+carry==3): 
                answer= str(1)+answer
                carry=1
               
            elif(int(a[i])+int(b[i])+carry==0):
                answer=str(0)+answer
                carry=0
                
        if(carry!=0):
            answer=str(1)+answer 
            
        return answer