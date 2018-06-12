package basicjunittests;

public class JunitExample1 {
	public String TruncateInFirst2Positions(String str)
	{
		if(str.length()<=2)
			return str.replaceAll("A","");
		
		String first2Chars = str.substring(0, 2);
		String StringMinusfirst2Chars = str.substring(2);
		return first2Chars.replaceAll("A", "") + StringMinusfirst2Chars; 
	}
	
	public boolean areFirstAndLast2CharsTheSame(String str){
	        if(str.length()<=1)
	        	return false;
	        if(str.length()==2)
	        	return true;
			String first2Chars = str.substring(0, 2);
			String last2Chars = str.substring(str.length()-2);
			return first2Chars.equals(last2Chars);
			}
	}