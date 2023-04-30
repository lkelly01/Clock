import java.util.*;
public class Date {

	public static void main(String[] args) {
		
		java.util.Date date = new java.util.Date();
	
	
		for (long i = 1000000000; i <= 1e9; i *= 10) {

	      System.out.println("Time elapsed: " + i + " milliseconds");

	        }
	        System.out.println("Date and time: " + date.toString());

}
}
