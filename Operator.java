import java.util.Scanner;

public class Operator extends Plan {
	//fields
	private Exercise[] cluster;
	private String[] headers;
	private double[] mults;
	private Scanner sc;

	//Constructor
	public Operator() {
		this.cluster = new Exercise[3];
		headers = new String[] {"3-5x5 - 70%", "3-5x5 - 80%", "3-4x3 - 90%","3-5x5
		 - 75%", "3-5x3 - 85%","3-4x1-2 - 95%"};
		mults = new double[] {.7,.8,.9,.75,.85,.95};
		sc  = new Scanner(System.in);
	}

	//Populates cluster of exercises with new exercise objects
	public void create() {
		for (int i = 0; i < cluster.length; ++i) {
			cluster[i] = super.addExercise();
		}


	}

	//This can go in the superclass as well - may need to pass them an argument or
	//two
	//Prints all
	public void printPlan() {
		//for (int i = 0; i < headers.length; ++i) {
	//		System.out.println("\n" + headers[i]);
	//		for (int j = 0; j < cluster.length; ++j) {
	//			System.out.println(cluster[j].getName() + " - " + cluster[j].getMax() * mults[i]);
	//		}
//		}
    super.printPlan(headers, mults, cluster);
	}

	public void setCluster(Exercise[] cluster) {
		this.cluster = cluster;
	}


	public void printExercises() {
		//System.out.println("Your exercises for this plan are:");
	//	for (Exercise exc : cluster) {
		//	System.out.println(exc.getName() + " - " + exc.getMax());
	//	}
		super.printExercises(cluster);
	}

	public void save() {
		//go until we get to something useful


		//we need plan type
		//unique name

		//go through each exercise, toString
		//add that exercise to the file

		for (Exercise exc : cluster) {
			// add exc.toString() to file
			//go down a line
		}
	}
}
