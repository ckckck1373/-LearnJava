1.Introduction to Java
(a.) "write once, run every where."
    Ex:
    public class HelloYou {
        public static void main(String[] args) {
          System.out.println("Hello Tony!");
          
        }
      }
    //=> Hello Tony!

    (b.)// /* */ */for comment

    (c.)Java is a compiled programming language, meaning the code we write in a .java file is transformed into byte code by a compiler
        before it is executed nt the Fava Virtual Machine on your computer.
        //To compile .java file => javac NameFile.java
        //To run the compiled file => java NameFile
2.What Is an IDE?
(a.)Integrated Development Environment, enables programmers to consolidate the different aspects of writing a computer program.
  //整合式開發環境
  
(b.)IntelliJ IDEA

3.VARIABLES
Ex:
public class Creator {
	public static void main(String[] args) {
    String name = "James Gosling";
    int yearCreated = 1995;
    System.out.println(name);
    System.out.println(yearCreated);
	}
}
//=> James Gosling
//   1995

(a.)int 、 double 、 booleans 、 char 、
//char must be surrounded by single quotes ''.

(b.)String is obfect, insteand of pribitives. 
    Objects have built-in befavior.
    Ex:
        String greeting = "Hello World";
    //所以才大寫(?

(c.)cases-sensitive
    第一個一定要是英文字小寫。
    幾個單字的字首是大寫的取變數方式是camelCase
    不要有底線連接

4.MANIPULATING　VARIABLES
(a.)+ - * / % > < ==  != >= <=
    跟以前的用法一樣

(b.)Strings
    //.equals()
    Ex: 
    String person1 = "Paul";
    String person2 = "John";
    String person3 = "Paul";
    
    System.out.println(person1.equals(person2));
    //prints false, since "Paul" is not "John"
    
    System.out.println(person1.equals(person3));
    //prints true, since "Paul" is "Paul"

    //+
    Ex:
    String username = "PrinceNelson";
    System.out.println("Your username is: " + username);
    //=>Your username is: PrinceNelson
    甚至可以用premitive datatype as the second variable to concatenate.//make it a String first!
    Ex:
    int balance = 10000;
    String message = "Your balance is: " + balance;
    System.out.println(message);
    //=> Your balance is: 10000

5.Introdiction to Classes
//Constructor 建構子 => 就是用class模子弄出來的東西，通常會有幾個parameter
(a.)Classes are a blueprint for objects.
    Blueprints detail the geveral structure. 
    Ex:all students have an ID. 
       all courses can enroll a student. etc.
    Ex:
    public class Store {
        // instance fields
        String productType;
        int inventoryCount;
        double inventoryPrice;
        
        // constructor method
        public Store(String product, int count, double price) {
          productType = product;
          inventoryCount = count;
          inventoryPrice = price;
        }
        
        // main method
        public static void main(String[] args) {
          Store lemonadeStand = new Store("lemonade", 42, .99);
          Store cookieShop = new Store("cookies", 12, 3.75);
          
          System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");
          
          System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
        }
      }
      //=>Our first shop sells lemonade at 0.99 per unit.
      //  Our second shop has 12 units remaining.
(b.)Java has pre-defined classes such as System, whick we have used in logging text to our screen.
    public is am access level modifier that allows other classes to interact with this class.

(c.)// Car ferrari = new Car();  
Ex:
public class Store {

  // new method: constructor!
  public Store() {
		System.out.println("I am inside the constructor method.");
  }
  
  // main method is where we create instances!
  public static void main(String[] args) {
    System.out.println("Start of the main method.");
    
    // create the instance below
    Store lemonadeStand = new Store();
    // print the instance below
    System.out.println(lemonadeStand);
  }
//=>
// Start of the main method.
// I am inside the constructor method.
// Store@2aae9190 //pointer

(d.)using the parameter value within a method body.
Ex:
public class Car {
  String color;
  // constructor method with a parameter
  public Car(String carColor) {
    // parameter value assigned to the field
    color = carColor;
  }
  public static void main(String[] args) {
    // program tasks
  }
}
//The parameter carColor references the value passed in during a method call:
new Car("blue");
// carColor references "blue" inside constructor
new Car("yellow");
// carColor references "yellow" inside constructor

(e.)We access the value of this field with the dot operator (.):
Ex:
/*
accessing a field:
objectName.fieldName
*/

ferrari.color;
// "red"

(f.)another example
Ex:
public class Store {
  // instance fields
  String productType;
  int inventoryCount;
  double inventoryPrice;
  
  // constructor method
  public Store(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }
  
  // main method
  public static void main(String[] args) {
    Store cookieShop = new Store("cookies", 12, 3.75);
  }
}

6.Method Introduction
(a.)change print out Object(原本會是儲存的位置，利用method改成其他的功能)
Ex:
class Car {

  String color;

  public Car(String carColor) {
      color = carColor;
  }

  public static void main(String[] args){
      Car myCar = new Car("red");
      System.out.println(myCar);
  }

 public String toString(){ //This one!!
     return "This is a " + color + " car!";
 }
}

/*
  額外補充: static
  被宣告為static的成員，不會讓個別物件擁有，而是屬於類別，如下定義後，如果建立多個BALL物件，每個物件只會各自擁有radius.
  class Ball {
    double radius;
    static final double PI = 3.141596;
    ...
}*/ 

(b.)Review
Ex: Saving Account
public class SavingsAccount {
  
  int balance;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }
  
  public void checkBalance(){
    System.out.println("Hello!");
    System.out.println("Your balance is " + balance);
  }
  
  public void deposit(int amountToDeposit){
    balance = amountToDeposit + balance;
    System.out.println("You just deposited "+ amountToDeposit);
  }
  
  public int withdraw(int amountToWithdraw){
    System.out.println("You just withdraw " + amountToWithdraw);
    balance = balance - amountToWithdraw;
    return amountToWithdraw;
  }
  
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    
    //Check balance:
    savings.checkBalance();
    
    //Withdrawing:
    savings.withdraw(300);
    
    //Check balance:
    savings.checkBalance();
    
    //Deposit:
    savings.deposit(600);
    
    //Check balance:
    savings.checkBalance();
    
    //Deposit:
    savings.deposit(600);
    
    //Check balance:
    savings.checkBalance();
    
  }       
}

7.Conditionals and Control Flow 
(a.)if、else if、else
Ex:
if (true) {

  System.out.println("Hello World!");

}

(b.)switch
Ex:
String course = "History";

switch (course) {
  case "Algebra": 
    // Enroll in Algebra
    break; 
  case "Biology": 
    // Enroll in Biology
    break;
  case "History": 
    // Enroll in History
    break;
  case "Theatre":
    // Enroll in Theatre
    break;
  default:
    System.out.println("Course not found");
}


8.Conditional Operators
(a.)&&、 ||、 !
Ex:
public class Reservation {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;
  
  public Reservation(int count, int capacity, boolean open) {
    if (count < 1 || count > 8) {
      System.out.println("Invalid reservation!");
    }
    guestCount = count;
		restaurantCapacity = capacity;
   	isRestaurantOpen = open;
  }  
  
  public void confirmReservation() {
    if (restaurantCapacity >= guestCount && isRestaurantOpen) {
      System.out.println("Reservation confirmed");
      isConfirmed = true;
    } else {
      System.out.println("Reservation denied");
			isConfirmed = false;
    }
  }
  
  public void informUser() {
    if (!isConfirmed) {
      System.out.println("Unable to confirm reservation, please contact restaurant.");
    } else {
      System.out.println("Please enjoy your meal!");
    }
  }
  
  public static void main(String[] args) {
    Reservation partyOfThree = new Reservation(3, 12, true);
    Reservation partyOfFour = new Reservation(4, 3, true);
    partyOfThree.confirmReservation();
    partyOfThree.informUser();
    partyOfFour.confirmReservation();
    partyOfFour.informUser();
  }
}
// Reservation confirmed
// Please enjoy your meal!
// Reservation denied
// Unable to confirm reservation, please contact restaurant.

9.Array
(a.)Introduction
Ex:
public class Newsfeed {
  
  String[] trendingArticles;
  int[] views;
  double[] ratings;
  
  public Newsfeed(String[] initialArticles, int[] initialViews, double[] initialRatings){
    trendingArticles = initialArticles;
    views = initialViews;
    ratings = initialRatings;
  }
  
  public String getTopArticle(){
    return trendingArticles[0];
  }
  
  public void viewArticle(int articleNumber){
    views[articleNumber] = views[articleNumber] + 1;
    System.out.println("The article '" + trendingArticles[articleNumber] + "' has now been viewed " + views[articleNumber] + " times!");
  }
  
  public void changeRating(int articleNumber, double newRating){
    if (newRating > 5 || newRating < 0) {
      System.out.println("The rating must be between 0 and 5 stars!");
    } else {
      ratings[articleNumber] = newRating;
      System.out.println("The article '" + trendingArticles[articleNumber] + "' is now rated " + ratings[articleNumber] + " stars!");
    }
  }
  
  public static void main(String[] args){
    String[] robotArticles = {"Oil News", "Innovative Motors", "Humans: Exterminate Or Not?", "Organic Eye Implants", "Path Finding in an Unknown World"};
    int[] robotViewers = {87, 32, 13, 11, 7};
    double[] robotRatings = {2.5, 3.2, 5.0, 1.7, 4.3};
    Newsfeed robotTimes = new Newsfeed(robotArticles, robotViewers, robotRatings);
    
    robotTimes.viewArticle(2);
    robotTimes.viewArticle(2);
    System.out.println("The top article is " + robotTimes.getTopArticle());
    robotTimes.changeRating(3, 5);
  }
}

(b.)宣告方法
  double[] prices;
  prices = {13.15, 15.87, 14.22, 16.66};
  //or  
  double[] prices = {13.15, 15.87, 14.22, 16.66};

(c.) Importing Arrays 
Ex:

import java.util.Arrays;//要加上這個lib.

public class Lottery(){

  public static void main(String[] args){
    int[] lotteryNumbers = {4, 8, 15, 16, 23, 42};
    String betterPrintout = Arrays.toString(lotteryNumbers);
    System.out.println(betterPrintout);
  }

}
// => [4, 8, 15, 16, 23, 42]

(d.)Get Element By Index
Ex:
  double[] prices = {13.1, 15.87, 14.22, 16.66};

  System.out.println(prices[1]);

// => 15.87

(e.)Creating an Empty Array
Ex:
  String[] menuItems = new String[5]; //Once you declare this size, it cannot be changed! This array will always be of size 5.

(f.)Length
Ex:
  String[] menuItems = new String[5];
  System.out.println(menuItems.length); //This command would print 5

(g.)String[] args
 // The array args contains the arguments that we pass in from the terminal when we run the class file.

10.ARRAYLISTS
 (a.) import java.util.ArrayList; //多了額外補充array內容等功能，需要添加的lib.

 (b.)ArrayList<String> babyNames; //宣告的形式
   //<> 內要填入<Integer> | <Double> | <Char>
  Ex:
  // Declaring:
  ArrayList<Integer> ages;
  // Initializing:
  ages = new ArrayList<Integer>();
   
  // Declaring and initializing in one line:
  ArrayList<String> babyNames = new ArrayList<String>();

 (c.)Adding an Item
 Ex:
 ArrayList<Integer> sudokuRow1 = new ArrayList<Integer>();

  sudokuRow1.add(4);
  // sudokuRow1 now holds [4]
  sudokuRow1.add(8);
  // sudokuRow1 now holds [4, 8]
  sudokuRow1.add(3);
  // sudokuRow1 now holds [4, 8, 3]

 (d.)ArrayList Size
 Ex:
 ArrayList<String> shoppingCart = new ArrayList<String>();

  shoppingCart.add("Trench Coat");
  System.out.println(shoppingCart.size());
  // 1 is printed
  shoppingCart.add("Tweed Houndstooth Hat");
  System.out.println(shoppingCart.size());
  // 2 is printed
  shoppingCart.add("Magnifying Glass");
  System.out.println(shoppingCart.size());
  // 3 is printed

  (e.)Accessing an Index //we use the method get() to access an index
  Ex:
  ArrayList<String> shoppingCart = new ArrayList<shoppingCart>();

  shoppingCart.add("Trench Coat");
  shoppingCart.add("Tweed Houndstooth Hat");
  shoppingCart.add("Magnifying Glass");

  System.out.println(shoppingCart.get(2));

  // => "Magnifying Glass"

  (f.)Changing a Value //using the set() method
  Ex:
  ArrayList<String> shoppingCart = new ArrayList<shoppingCart>();

  shoppingCart.add("Trench Coat");
  shoppingCart.add("Tweed Houndstooth Hat");
  shoppingCart.add("Magnifying Glass");

  shoppingCart.set(0, "Tweed Cape");

  // shoppingCart now holds ["Tweed Cape", "Tweed Houndstooth Hat", "Magnifying Glass"]

  (g.)Removing an Item //using the .remove method
  Ex:
  ArrayList<String> shoppingCart = new ArrayList<String>();

  shoppingCart.add("Trench Coat");
  shoppingCart.add("Tweed Houndstooth Hat");
  shoppingCart.add("Magnifying Glass");

  shoppingCart.remove(1);
  // shoppingCart now holds ["Trench Coat", "Magnifying Glass"]

  (h.)Getting an Index of Item 
  Ex:
  // detectives holds ["Holmes", "Poirot", "Marple", "Spade", "Fletcher", "Conan", "Ramotswe"];
  System.out.println(detectives.indexOf("Fletcher"));
  // => 4

  11.Loop
  (a.)while 
  Ex:
  while (silliness > 10) {

    // code to run
  
  }
  Ex:
  class Coffee {
  
    public static void main(String[] args) {
      
      // initialize cupsOfCoffee
      int cupsOfCoffee = 1;
      // add while loop with counter
      while(cupsOfCoffee <= 100){
        cupsOfCoffee += 1; //iterator
        System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);
      }
      
    }
    
  }

  (b.)For loop 
  Ex:
  for (int i = 0; i < 5; i++) {

    // code that will run
  
  }

  (c.)Iterating Over Arrays and ArrayLists //例如:每個array裡面的元素都加一
  Ex:
  for (int i = 0; i < secretCode.length; i++) {

    secretCode[i] += 1;
  
  }

  Ex:(in ArrayList)
  for (int i = 0; i < secretCode.size(); i++) {

    int num = secretCode.get(i);
    secretCode.set(i, num + 1);
  
  }

  (d.)For-Each Loops
  Ex:
  for (String inventoryItem : inventoryItems) {

    System.out.println(inventoryItem);
  
  }
  //We can read the : as “in” like this: for each inventoryItem (which should be a String) in inventoryItems, print inventoryItem.  

  12.STRING METHODS
  (a.)Overview
  // length()
  // concat()
  // equals()
  // indexOf()
  // charAt()
  // substring()
  // toUpperCase() / toLowerCase()
  
  (b.)length
  Ex:
  public class TweetCounter {
  
    public static void main(String[] args) {
      
      String tweet = "Liz Lemon, ninjas are kind of cool... I just dont know any personally. Get on that.";  
  
      // What's the character count?
      System.out.println(tweet.length());
      
    }
    
  }
  //=> 83

  (c.)concat()
  Ex:
  String name = "Code";

  name = name.concat("cademy");

  System.out.println(name); 
  //=> Codecademy

  (d.)equals()
  Ex:
  String flavor1 = "Mango";
  String flavor2 = "Peach";
  
  System.out.println(flavor1.equals("Mango"));
  // prints true
  
  System.out.println(flavor2.equals("Mango"));
  // prints false
  // equalsIgnoreCase() can compare two String without considering upper/lower cases.

  (e.)indexOf()
  Ex:
  String letters = "ABCDEFGHIJKLMN";

  System.out.println(letters.indexOf("C"));
  // This would output 2.

  Ex:
  String letters = "ABCDEFGHIJKLMN";

  System.out.println(letters.indexOf("EFG"));
  //This would output 4.

  //If the indexOf() doesn’t find what it’s looking for, it’ll return a -1.

  (f.)charAt()
  Ex:
  String str = "qwer";

  System.out.println(str.charAt(2));
  //It would output e because that’s what’s at index 2. 

  (g.)substring()
  Ex:
  String line = "The Heav'ns and all the Constellations rung";

  System.out.println(line.substring(23));
  //It would output "Constellations rung"

  Ex:(Middle part)  
  String line = "The Heav'ns and all the Constellations rung";

  System.out.println(line.substring(23, 38));
  //It would output Constellations.

  (h.)toUpperCase() / toLowerCase()
  Ex:
  String input = "Cricket!";

  String upper = input.toUpperCase();
  // stores "CRICKET!"
  
  String lower = input.toLowerCase();
  // stores "cricket!"