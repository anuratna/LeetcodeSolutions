class Solution(object):
    def isAlienSorted(self, words, order):
        order_index = {c: i for i, c in enumerate(order)}
        
        for i in range(0,(len(words)-1)):
            w1 = words[i]
            w2 = words[i+1]
        
            for j in range(0,min(len(w1),len(w2))):
                       if w1[j]!=w2[j]:
                        if order_index[w1[j]]>order_index[w2[j]]:
                            return False
                        break
                       
            else :
                if len(w1)>len(w2):
                       return False
                
        return True     
    
