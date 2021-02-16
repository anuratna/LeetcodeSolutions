//String to Integer
class GfG
{
    int atoi(String str)
    {
	 int result = 0;
	 int minus = 1;
	 int i=0;
	 if(str.charAt(0)=='-')
	     {
	          minus = -1;
	          i++;
	     }
	     
	 for(;i<str.length();i++)
	 {
	     char ch = str.charAt(i);
	     if(Character.isDigit(ch)){
	     result = result * 10 + Character.getNumericValue(ch);}
	     else{
	         return -1;
	     }
	     
	 }
	
	return minus * result;
    }
}
