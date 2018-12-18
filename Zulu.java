
public class Zulu extends Plan{


  private Exercise[] clusterA, clusterB;
  private String[] headers;
  private double[] mults;
  private Scanner sc;

  public Zulu(){
    this.clusterA = new Exercise[2];
    this.clusterB = new Exercise[2];
    headers = new String[] {"3-5x5 - 75%" + "3-5x5 - 80%" + "3-5x3 - 90%"
    + "3-5x5 - 75%" + "3-5x5 - 80%" + "3-5x3 - 90%"};
    mults = new double[] {.75,.8,.9,.75,.8,.9};
    sc Scanner = new Scanner(System.in);
  }

  //FIXME - implement unique A/B structure for all relevant functions
  public void create(){
    for (int i = 0; i < cluster.length; ++i){
      cluster[i] = super.addExercise()
    }
  }

  public void printPlan(){
    super.printPlan(headers, mults, cluster);
  }

  public void printExercises(){
    super.printExercises(cluster);
  }

  public void save(){

  }

  public void setCluster(Exercise[] cluster){
    this.cluster = cluster;
  }
}
