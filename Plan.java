import java.util.Scanner;

public abstract class Plan {

	private Scanner sc = new Scanner(System.in);

	public abstract void save();

	public abstract void create();

	public abstract void printPlan();

	public Exercise addExercise() {
		String name;
		double max;

		System.out.println("What is the name of exercise?");
		name = sc.next();
		System.out.println("What is your one-rep max for exercise?");
		//FIXME - Handle invalid input
		max = sc.nextInt();

		return new Exercise(name, max);
	}

	public void printExercises(Exercise[] cluster){
		System.out.println("Your exercises for this plan are:");
		for (Exercise exc: cluster){
			System.out.println(exc.getName() + " - Max: " + exc.getMax());
		}
	}


}
