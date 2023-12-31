import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Solution{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		// regression expression for Latitude
		String regexLatitude =  "[-|+]?(([1-8]?[0-9]([\\.][0-9]*)?)|([9][0]([\\.][0]*)?))";
		// regression expression for Longitude 
		String regexLongitude = "[-|+]?(([1](([0-7][\\d]([\\.][0-9]+)?)|([8][0]([\\.][0]+)?)))|([1-9]?[\\d]([\\.][0-9]+)?))";
		
		// Combined regression expression for Latitude and Longitude
		String regexLatLong = "[\\(]" + regexLatitude + ", " + regexLongitude + "[\\)]";
		
		Pattern pattern = Pattern.compile(regexLatLong);
		String string;
		for (int i = 0; i < n; i++) 
		{
			string = in.nextLine();
			Matcher matcher = pattern.matcher(string);
			if(matcher.find())
				System.out.println("Valid");
			else
				System.out.println("Invalid");
		}
	}
}
