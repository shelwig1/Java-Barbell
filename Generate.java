import java.util.Scanner;

public class Generate{

	//FIXME - REMOVE WHEN MENU IS FIXED - USED TO END PROGRAM AFTER DISPLAYING PLAN
	private Scanner sc = new Scanner(System.in);

	Operator opPlan;
	Fighter fighterPlan;
	Zulu zuluPlan;

	/*Creates a new plan object based on user input
	 *@param plan an int to decide the type of plan used
	 */
	public Generate (int plan) {
		switch(plan) {
		case 1: opPlan = new Operator();
				make(opPlan);
				break;
		case 2: fighterPlan = new Fighter();
				make(fighterPlan);
				break;
		case 3: zuluPlan = new Zulu();
				make(zuluPlan);
				break;
		}
	}

	/*Populates a new plan object with Exercise objects and displays the plan
	 *@param plan a new plan object to populate and display
	 */
	public void make(Plan plan) {
		plan.create();
		plan.printPlan();

		//FIXME - terminates program after it displays the plan - REMOVE WHEN
		//MENU IS FIXED
		String i;
		while (sc.next() != null){
			i = sc.next();
		}
		System.exit(0);
	}


}
