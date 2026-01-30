package strings;

import java.util.Arrays;

public class StringDemo{
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s);
        System.out.println("Length of the string: " + s.length());
        System.out.println(s.isEmpty());
        System.out.println("Character at index 7: " + s.charAt(7));
        System.out.println("Substring from index 7 to 12: " + s.substring(7, 12));
        System.out.println(s.concat("!!!"));
        System.out.println(s.indexOf("World"));
        System.out.println(s.indexOf("l", 4 , 11));
        System.out.println(s.lastIndexOf('l'));
        System.out.println(s.equals("Hello, World!"));
        System.out.println(s.equalsIgnoreCase("hello, world!"));
        System.out.println(s.compareTo("Hello, Java!"));
        System.out.println(s.compareToIgnoreCase("hello, Java!"));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());
        System.out.println(s.replace('o', '0'));
        System.out.println(s.contains("World"));
        System.out.println(s.startsWith("Hello"));
        System.out.println(s.endsWith("World!"));
        String[] str = s.split(" ");
        System.out.println(Arrays.toString(str));
        String str1 = String.join(" ", str);
        System.out.println(str1);
        char arr[] = s.toCharArray();
        for(char c : arr){
            System.out.print(c + " ");
        }

        //String Builder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", World!");
        System.out.println("\n" + sb.toString());
        sb.insert(5, " Beautiful");
        System.out.println(sb.toString());
        sb.replace(0, 5, "Hi");
        System.out.println(sb.toString());
        sb.delete(2, 12);
        System.out.println(sb.toString());
        sb.setCharAt(2, '!');
        System.out.println(sb.toString());
        sb.deleteCharAt(2);
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());
        
    }
}