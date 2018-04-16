public class Dog {
  //Student Name: Olivia Woodhouse
  //Student ID: 260734701
  
  private String name;
  private String breed;
  
  public Dog(String n, String b) {
    this.name = n;
    this.breed = b;
  }
  
  public String getName() {
    return name;
  }
  
  public int herd() {
    breed = breed.toLowerCase();
    if (breed.contains("collie")) {
      return 20;
    }
    else if (breed.contains("shepherd")) {
      return 25;
    }
    else if (breed.contains("kelpie")||breed.contains("teruven")) {
      return 30;
    }
    else {
      return 10;
    }
  }
  
  public static void main(String[] args) {
    //Dog d1 = new Dog();
    //d1.name = "Fluffy";
    //d1.breed = "Cute Collie";
    //Dog d2 =  new Dog();
    //d2.name = "Geoffrey";
    //d2.breed = "Golden Lab";
    //System.out.println(d1.getName());
    //System.out.println(d1.breed);
    //System.out.println(d1.herd());
  }
  
}




