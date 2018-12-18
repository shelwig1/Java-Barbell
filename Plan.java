
public abstract class Plan {

	//public abstract void display();

	public abstract void save();

	//have this here
	public abstract void create();

	public void addExercise() {
		String name;
		double max;

		System.out.println("What is the name of exercise?");
		name = sc.next();
		System.out.println("What is your one-rep max for exercise?");
		//FIXME - Handle invalid input
		max = sc.nextInt();

		return new Exercise(name, max);
	}

	public void printPlan(String[] headers, double[] mults, Exercise[] cluster){
		for (int i = 0; i < headers.length; ++i) {
			System.out.println("\n" + headers[i]);
			for (int j = 0; j < cluster.length; ++j) {
				//double x = cluster[j].getRoundedNum(mults[i]);
				//System.out.println(cluster[j].getName() + " - " + cluster[j].getMax() * mults[i]);
				System.out.println(cluster[j].getName() + " - "
				+ cluster[j].getRoundedNum(mults[i]);)
			}
		}
	}

	public void printExercises(Exercise[] cluster){
		System.out.println("Your exercises for this plan are:");
		for (Exercise exc: cluster){
			System.out.println(exc.getName() + " - Max: " + exc.getMax());
		}
	}

}
