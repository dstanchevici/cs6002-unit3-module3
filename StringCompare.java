// Unit 3, Module 3, Ex. 3.3

public class StringCompare {

    public static void main (String[] argv)
    {
	String s1 = "pen", s2 = "pin", s3 = "pan", s4 = "pen";

	int c = s1.compareTo (s2);
	System.out.println (c);

	int d = s1.compareTo (s3);
	System.out.println (d);

	int e = s1.compareTo (s4);
	System.out.println (e);

    }

}
