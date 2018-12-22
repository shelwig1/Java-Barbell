
public class Exercise {

	private String name;
	private double max;

	//Constructor
	public Exercise(String name, double max) {
		this.name = name;
		this.max = max;
	}

	//Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setMax(double max) {
		this.max = max;
	}

	//Getters
	public String getName() {
		return this.name;
	}

	public double getMax() {
		return this.max;
	}

	public String toString() {
		return name + " " + max;
	}

	/*Returns the value of the max weight of a lift by the current multiplier,
	* rounded to the nearest value of 2.5 (smallest increment of weight in
	* traditional weight plates)
	* @param mult the percentage of the max the user must lift
	*@return the weight to lift rounded to the nearest increment of 2.5
	*/
	public double getRoundedNum(double mult){
		double x = this.max * mult;
		return Math.round(x/2.5) * 2.5;
	}
}