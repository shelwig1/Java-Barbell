
public class New{

	Operator opPlan;
	Fighter fighterPlan;
	Zulu zuluPlan;

	public New (int plan) {
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

	public void make(Plan plan) {
		plan.create();
		plan.printPlan();
	}


}
