package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth cpdob_one = new DateAndPlaceOfBirth(2000, 1, 2, "Queens", "NY");
		StreetUSAddress csua_one = new StreetUSAddress("2321 Queens Ave.", "Apt #2", "Queens", "NY", "11373");
		Person cperson_one = new Person("Sean", "Park", "91252362", cpdob_one, csua_one);
		ComputerOwner owner_one = new ComputerOwner(cperson_one);
		Computer ccomp_one = new Computer("Balint", "first cpu", 16, 10, true, 50);
		Computer ccomp_two = new Computer("Mapoy", "second cpu", 8, 512, false, 600);
		Computer ccomp_three = new Computer("Garger", "third cpu", 32, 2000, true, 1200);
		Computer ccomp_four = new Computer("Polson", "fourth cpu", 64, 6000, false, 3500);
		owner_one.addComputer(ccomp_one);
		owner_one.addComputer(ccomp_two);
		owner_one.addComputer(ccomp_three);
		owner_one.addComputer(ccomp_four);
		System.out.println(owner_one);


		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		DateAndPlaceOfBirth cpdob_one2 = new DateAndPlaceOfBirth(2000, 1, 2, "Queens", "NY");
		StreetUSAddress csua_one2 = new StreetUSAddress("2321 Queens Ave.", "Apt #2", "Queens", "NY", "11373");
		Person cperson_one2 = new Person("Sean", "Park", "91252362", cpdob_one2, csua_one2);
		ComputerOwner owner_one2 = new ComputerOwner(cperson_one2);
		Computer ccomp_one2 = new Computer("Balint", "first cpu", 16, 10, true, 50);
		Computer ccomp_two2 = new Computer("Mapoy", "second cpu", 8, 512, false, 600);
		Computer ccomp_three2 = new Computer("Garger", "third cpu", 32, 2000, true, 1200);
		Computer ccomp_four2 = new Computer("Polson", "fourth cpu", 64, 6000, false, 3500);
		owner_one2.addComputer(ccomp_one2);
		owner_one2.addComputer(ccomp_two2);
		owner_one2.addComputer(ccomp_three2);
		owner_one2.addComputer(ccomp_four2);
		output.println(owner_one2);


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
