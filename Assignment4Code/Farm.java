public class Farm {
  //Student Name: Olivia Woodhouse
  //Student ID: 260734701
  
  private Sheep[] sheepArray;
  private Dog dogName;
  private String farmName;
  
  public Farm(String n, Dog d, Sheep[] s) {
    this.farmName = n;
    this.dogName = d;
    this.sheepArray = s;
    if (sheepArray.length>dogName.herd()) {
      throw new IllegalArgumentException("There are more sheep than the dog can herd!");
    }
  }
  
  public String getName() {
    return farmName;
  }
  
  public int getNumSheep() {
    return sheepArray.length;
  }
  
  public void printFarm() {
    System.out.println(farmName);
    System.out.println(dogName);
    for (int i=0;i<sheepArray.length;i++) {
      System.out.println(sheepArray[i].getName());
      System.out.println(sheepArray[i].getAge());
    }
  }
  
  public double getWool() {
    double x = 0.0;
    for (int i=0;i<sheepArray.length;i++) {
      x += sheepArray[i].shear();
    }
    return x;
  }
  
}

