package dsa450;

public class StringRotationMyMethod {
	public static void main(String args[])
	{
		String s1 = "String";
		String s2 = "tringS";
		System.out.print(isRotated(s1,s2));
	}
	static boolean isRotated(String s1,String s2)
	{
		s1.toUpperCase();
		s2.toUpperCase();
		String stringtoberotated;
		for(int i = 0; i < s1.length(); i++)
		{
			stringtoberotated = s2.substring(i);
			stringtoberotated = stringtoberotated + s2.substring(0,i);
			if(s1.equals(stringtoberotated))
				return true;
		}
		return false;
	}
}
