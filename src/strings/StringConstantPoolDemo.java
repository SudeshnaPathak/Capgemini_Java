package strings;

public class StringConstantPoolDemo {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		String s3 = "abc";
		String s4 = "def";
		System.out.println(s1 == s3); //true: Points to same object in String constant pool inside heap
		System.out.println(s2 == s4);
		System.out.println(s1 == s4);
		
		s1 = s1 + "def";
		System.out.println(s1 == s3); //false: Strings are immutable in nature
		
		String s5 = new String("abcde");
		String s6 = new String("abcde");
		System.out.println(s5 == s6); //false: 2 diff objects will be created inside heap area although they will point to the same object inside SCP, bcoz SCP doesn't allow duplication
	}

}
