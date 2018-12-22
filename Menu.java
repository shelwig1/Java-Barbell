import java.util.Scanner;

public class Menu {

	private static Scanner sc;
	@SuppressWarnings("unused")
	private static Generate thing;
	private static int i;

	public static void main(String args[]) {

		sc = new Scanner(System.in);
		//FIXME - CHECK FOR INVALID INPUT
		System.out.println("Welcome to TB-Java\n\nWould you like to create a new" +
		 "plan or load an existing one?\n1 : New Plan\n2 : Load Plan\n");

		i = sc.nextInt();
		while (i != 1 && i != 2){
			System.out.println("Invalid input.\n 1 : New Plan\n2 : Load Plan\n");
		}

		if (i == 1){
			System.out.println("Please select a plan.\n1 : Operator\n2 : Fighter" +
			"\n3 : Zulu");
			i = sc.nextInt();
			while (i != 1 && i != 2 && i != 3){
				System.out.println("Invalid input.\n1 : Operator\n2 : Fighter" +
				"\n3 : Zulu");
			}
			thing = new Generate(i);
		}

		if (i == 2){
				//FIXME implement save/load
		}
	}
}
