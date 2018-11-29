/**
 * 
 * @author Akul Patel
 * Test
 *
 */
public class Test 
{

	public static void main(String[] args) 
	{
		int iDNum = 12345, iDNum2= 26810;
		String name = "Mr. Ellis", name2 = "Mrs. Ellis";
		
		System.out.printf("Name: %-20s ID: %,12d", name2, iDNum2);
		System.out.printf("\nName: %-20s ID: %012d", name, iDNum);
		int x = 10;
		System.out.println("\n" + x++);
		System.out.print(x);
	}

}
