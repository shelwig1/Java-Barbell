
public class Operator extends Plan {

	private Exercise[] cluster;
	private String[] headers;
	private double[] mults;


	public Operator() {
		this.cluster = new Exercise[3];
		headers = new String[] {"3-5x5 - 70%", "3-5x5 - 80%", "3-4x3 - 90%","3-5x5 - 75%",
		"3-5x3 - 85%","3-4x1-2 - 95%"};
		mults = new double[] {.7,.8,.9,.75,.85,.95};
	}

	//Populates cluster with Exercise objects
	public void create() {
		for (int i = 0; i < cluster.length; ++i) {
			cluster[i] = super.addExercise();
		}
	}

	//Prints a complete list of the exercises, repititions, and work weights
	public void printPlan() {
		for (int i = 0; i < headers.length; ++i) {
			System.out.println("\n" + headers[i]);
			for (int j = 0; j < cluster.length; ++j) {
				System.out.println(cluster[j].getName() + " - "
					+ cluster[j].getRoundedNum(mults[i]));
			}
		}

	}

	//Prints the name and one-rep max for every Exercise object in this cluster
	public void printExercises() {
		super.printExercises(cluster);
	}
	
	//Sets this.cluster. Used for loading existing plans
	public void setCluster(Exercise[] cluster) {
		this.cluster = cluster;
	}

	

	//FIXME - implement
	public void save() {

		}
	}
