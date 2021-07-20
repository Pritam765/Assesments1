package assessment;
import java.util.Scanner;
public class Egg 
{
	public void display() 
	{
		Scanner sc = new Scanner(System.in);
		int dozen = 0;
		int gross = 0;
		int remaining = 0;
		System.out.println("Enter the number of eggs:-");
		int egg = sc.nextInt();
		gross = (int) egg/144;
		dozen = (int) (egg%144)/12;
		remaining = (int) (egg%144)%12;
System.out.println("How many number of eggs you have "+ gross+" gross, "+ dozen+"  dozen, and "+remaining);
		}
	public static void main(String[] args) 
	{
		Egg nonveg = new Egg();
		nonveg.display();
		}
}
