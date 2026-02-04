package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		String str = "Satya Ranjan Samal";
		String check = "Ranjan";
		Pattern p = Pattern.compile(check);
		Matcher m = p.matcher(str);
		if(m.find()) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
	}

}
