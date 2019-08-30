package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
		Computer comp_one = new Computer("Bell", "first cpu", 8, 5, true, 5);
		Computer comp_two = new Computer("Pear", "second cpu", 4, 256, false, 300);
		Computer comp_three = new Computer("Lenuwu", "third cpu",16, 1000, true, 800);
		Computer comp_four = new Computer("Samson", "fourth cpu", 32, 3000, false, 1200);
		System.out.println(comp_one);
		System.out.println(comp_two);
		System.out.println(comp_three);
		System.out.println(comp_four);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		Computer comp_one2 = new Computer("Bell", "first cpu", 8, 5, true, 5);
		Computer comp_two2 = new Computer("Pear", "second cpu", 4, 256, false, 300);
		Computer comp_three2 = new Computer("Lenuwu", "third cpu",16, 1000, true, 800);
		Computer comp_four2 = new Computer("Samson", "fourth cpu", 32, 3000, false, 1200);
		output.println(comp_one2);
		output.println(comp_two2);
		output.println(comp_three2);
		output.println(comp_four2);

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
