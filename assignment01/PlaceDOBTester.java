package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth dpb_one = new DateAndPlaceOfBirth(2000, 10, 26, "New York", "NY" );
		DateAndPlaceOfBirth dpb_two = new DateAndPlaceOfBirth(2000, 10, 26, "New York", "NY");
		DateAndPlaceOfBirth dpb_three = new DateAndPlaceOfBirth(1999, 10, 26, "New York", "NY");
		DateAndPlaceOfBirth dpb_four = new DateAndPlaceOfBirth(1998, 3, 31, "Istanbul", "Turkey");
		DateAndPlaceOfBirth dpb_five = new DateAndPlaceOfBirth(1997, 2, 28, "Tokyo", "Japan");
		System.out.println(dpb_one);
		System.out.println(dpb_two);
		System.out.println(dpb_three);
		System.out.println(dpb_four);
		System.out.println(dpb_five);
		System.out.println(dpb_one.hasSameBirthDayAs(dpb_two)); //Should return true
		System.out.println(dpb_two.hasSameBirthDayAs(dpb_four)); //Should return false
		System.out.println(dpb_one.hasSameBirthDayAs(dpb_three)); //Should return true
		System.out.println(dpb_three.olderThan(dpb_five)); //Should return false
		System.out.println(dpb_four.olderThan(dpb_two)); //Should return true
		System.out.println(dpb_three.youngerThan(dpb_five)); //Should return true
		System.out.println(dpb_four.youngerThan(dpb_two)); //Should return false
		System.out.println(dpb_one.hasSameBirthDateAs(dpb_two)); //Should return true
		System.out.println(dpb_four.hasSameBirthDateAs(dpb_five)); //Should return false

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		DateAndPlaceOfBirth dpb_one2 = new DateAndPlaceOfBirth(2000, 10, 26, "New York", "NY" );
		DateAndPlaceOfBirth dpb_two2 = new DateAndPlaceOfBirth(2000, 10, 26, "New York", "NY");
		DateAndPlaceOfBirth dpb_three2 = new DateAndPlaceOfBirth(1999, 10, 26, "New York", "NY");
		DateAndPlaceOfBirth dpb_four2 = new DateAndPlaceOfBirth(1998, 3, 31, "Istanbul", "Turkey");
		DateAndPlaceOfBirth dpb_five2 = new DateAndPlaceOfBirth(1997, 2, 28, "Tokyo", "Japan");
		output.println(dpb_one2);
		output.println(dpb_two2);
		output.println(dpb_three2);
		output.println(dpb_four2);
		output.println(dpb_five2);
		output.println(dpb_one2.hasSameBirthDayAs(dpb_two2)); //Should return true
		output.println(dpb_two2.hasSameBirthDayAs(dpb_four2)); //Should return false
		output.println(dpb_one2.hasSameBirthDayAs(dpb_three2)); //Should return true
		output.println(dpb_three2.olderThan(dpb_five2));//Should return false
		output.println(dpb_four2.olderThan(dpb_two2)); //Should return true
		output.println(dpb_three2.youngerThan(dpb_five2)); //Should return true
		output.println(dpb_four2.youngerThan(dpb_two2)); //Should return false
		output.println(dpb_one2.hasSameBirthDateAs(dpb_two2)); //Should return true
		output.println(dpb_four2.hasSameBirthDateAs(dpb_five2)); //Should return false

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
