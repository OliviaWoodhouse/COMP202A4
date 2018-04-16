import java.util.Scanner;
import java.util.Random;
public class WoolFactory {
  
  public static void main(String[] args){ 
    //Student Name: Olivia Woodhouse 
    //Student Number: 260734701
 
    Scanner input = new Scanner(System.in);
    System.out.println("What is the name of your farm?");
    String n = input.nextLine();
    System.out.println("What is the name of you dog?");
    String dName = input.nextLine();
    System.out.println("What kind of dog is "+dName+"?");
    String dBreed = input.nextLine();
    System.out.println("And how many sheep do you have?");
    int sLength = input.nextInt();
    System.out.println("The farm has "+sLength+" sheep.");
    Dog d = new Dog(dName,dBreed);
    Sheep[] sheepArray = new Sheep[sLength];
    for (int i=0;i<sLength;i++) {
      sheepArray[i] =new Sheep(getRandomName(),getRandomAge());
    }
    Farm inputFarm = new Farm(n,d,sheepArray);
    System.out.print("Farm: "+inputFarm.getName());
    System.out.println(" Dog: "+dName);
    for (int j=0;j<sLength;j++) {
      System.out.print(sheepArray[j].getName());
      System.out.print(" ");
      System.out.println(sheepArray[j].getAge());
    }
    
    double woolAmount = inputFarm.getWool();
    double amountMade = woolAmount*1.45;
    System.out.println("We just sheared "+woolAmount+"lbs of wool for a value of $"+amountMade+"!");
  }
  
  private static String[] namesForSheep = {"Cerdic","Cynric","Ceawlin","Ceol","Ceolwulf","Cynegils", 
    "Cenwalh","Seaxburh","Aescwine","Centwine","Ceadwalla","Ine","Aethelheard","Cuthred","Cynewulf", 
    "Berhtric","Egbert","Aethelwulf","Aethelbald","Aethelberht","Aethelred","Hengest","Aesc","Octa", 
    "Eormenric","Aethelbert I","Eadbald","Earconbert","Egbert I","Hlothere","Oswine","Wihtred", 
    "Aethelbert II","Sigered","Egbert II","Eadberht II","Cuthred","Baldred","Aethelfrith","Edwin","St. Oswald", 
    "Oswiu","Ecgfrith","Aldfrith","Osred I","Cenred","Osric","Ceolwulf","Eadberht", 
    "Aethelwald","Alhred","Aethelred I","Aelfwald I","Eardwulf","Eanred","George V","Edward VIII", 
    "George VI","Elizabeth II"}; 
  private static Random r = new Random(123); 
   
  //returns a random String from the above array.  
  private static String getRandomName(){ 
    int index = r.nextInt(namesForSheep.length); 
    return namesForSheep[index]; 
  } 
  //returns a random age for a sheep from 1 to 10 
  private static int getRandomAge(){ 
    return r.nextInt(10)+1; 
  }
                         
}