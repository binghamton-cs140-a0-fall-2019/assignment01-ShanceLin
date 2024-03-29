package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester {
	public static void main(String[] args) {
			StreetUSAddress sua_one = new StreetUSAddress("513 Roosevelt Rd.", "", "New York", "NY", "10002");
			StreetUSAddress sua_two = new StreetUSAddress("768 Euclid St. ", "Apt #4", "New York", "NY", "10027");
			System.out.println(sua_one);
			System.out.println(sua_two);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		StreetUSAddress sua_one2 = new StreetUSAddress("513 Roosevelt Rd.", "", "New York", "NY", "10002");
		StreetUSAddress sua_two2 = new StreetUSAddress("768 Euclid St. ", "Apt #4", "New York", "NY", "10027");
		output.println(sua_one2);
		output.println(sua_two2);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
