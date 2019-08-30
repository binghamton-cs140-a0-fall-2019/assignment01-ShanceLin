package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth ppdob_one = new DateAndPlaceOfBirth(2000, 1, 1, "Spencer", "NY");
		StreetUSAddress psua_one = new StreetUSAddress("2 Main St.", "Apt #-1", "Spencer", "NY", "14883");
        Person person_one = new Person("Telly", "Heidl", "90702019", ppdob_one, psua_one);
		System.out.println(person_one);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		DateAndPlaceOfBirth ppdob_one2 = new DateAndPlaceOfBirth(2000, 1, 1, "Spencer", "NY");
		StreetUSAddress psua_one2 = new StreetUSAddress("2 Main St.", "Apt #-1", "Spencer", "NY", "14883");
		Person person_one2 = new Person("Telly", "Heidl", "90702019", ppdob_one2, psua_one2);
		output.println(person_one2);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
