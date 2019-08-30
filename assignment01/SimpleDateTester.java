package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDateTester {
	public static void main(String[] args) {
        SimpleDate sd_one = SimpleDate.of(2019, 8, 26);
        SimpleDate sd_two = SimpleDate.of(2008, 7, 13);
        SimpleDate sd_three = SimpleDate.of(2019, 5, 16);
        SimpleDate sd_four = SimpleDate.of(2019, 8, 13);
        System.out.println(sd_one.before(sd_two)); //should return false
        System.out.println(sd_two.before(sd_one)); //should return true
        System.out.println(sd_one.before(sd_three)); //should return false
        System.out.println(sd_three.before(sd_one)); //should return true
        System.out.println(sd_one.before(sd_four)); //should return false
        System.out.println(sd_four.before(sd_one)); //should return true

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDate.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
        SimpleDate sd_one2 = SimpleDate.of(2019, 8, 26);
        SimpleDate sd_two2 = SimpleDate.of(2008, 7, 13);
        SimpleDate sd_three2 = SimpleDate.of(2019, 5, 16);
        SimpleDate sd_four2 = SimpleDate.of(2019, 8, 13);
        output.println(sd_one2.before(sd_two2)); //should return false
        output.println(sd_two2.before(sd_one2)); //should return true
        output.println(sd_one2.before(sd_three2)); //should return false
        output.println(sd_three2.before(sd_one2)); //should return true
        output.println(sd_one2.before(sd_four2)); //should return false
        output.println(sd_four2.before(sd_one2)); //should return true

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
