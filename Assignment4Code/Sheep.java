import java.util.Random;
public class Sheep {
  //Student Name: Olivia Woodhouse
  //Student ID: 260734701
  
  private String name;
  private int age;
  private boolean hasWool;
  private Random numberGenerator=new Random (123);
  
  public Sheep(String n, int a) {
    this.name = n;
    this.age = a;
    this.hasWool = true;
  }
  
  public String getName() {
    return name;
  }
  
  public int getAge() {
    return age;
  }
  
  public double shear() {    
    double amountWool = (numberGenerator.nextDouble()*4+6);
    if (hasWool) {
      hasWool = false;
      return amountWool;
    }
    else {
      return 0.0;
    }
  }
  
  public static void main(String[] args) {
    //Sheep s1 = new Sheep("Cloudy",5);
    //Sheep s2 = new Sheep("Flash",1);
    //Sheep s3 = new Sheep("Lily",8);
    //System.out.println(s3.getName());
    //System.out.println(s3.getAge());
    //System.out.println(s3.shear());
    //System.out.println(s3.hasWool);
  }
  
}


