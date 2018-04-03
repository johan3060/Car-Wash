import java.util.Scanner;

public class CarWash{

   Customer customer = new Customer("customer1");
   Washcard washcard = new Washcard(001, 0);
   

   public static void main (String[] args){
   CarWash carwash = new CarWash();
   System.out.println("Welcome to SuperShine!");
   carwash.userGreeting();
   }


   //Startside
   public void userGreeting(){
      Scanner scan1 = new Scanner (System.in);
      System.out.println("What do you want to do?\n1: Buy washcard\n2: Recharge washcard\n3: Check the balance of washcard");
      int option;
      option = scan1.nextInt();
      if (option == 1){
         buyWashcardGreeting();
      }
      
      if (option == 2 && washcard.getCredit() != 0){
         enterRechargeAmount();
      }
            
      if (option == 3){
         checkCredit();
      }
      else {
      System.out.println("Please choose a valid option");
      userGreeting();
      
      }
   }
   //Velkomst til køb af kort
   public void buyWashcardGreeting(){
      Scanner scan = new Scanner (System.in);
      String name;
      System.out.print("Please enter your name: ");
      name = scan.nextLine(); 
      customer.setName(name);
      System.out.println("Please enter the value of the card that you are about to buy.");
      System.out.println("*Note that the value of the card must be between 200 to 1000 kr.*");
      System.out.print("Value: ");
      buyWashcardValue();
   }
   //indtasting af penge til kort
   public void buyWashcardValue(){
      Scanner scan = new Scanner (System.in);     
      int value = scan.nextInt();
      if (value < 200 || value > 1000){
         System.out.print("Please enter a valid value.\nValue: ");
         buyWashcardValue();
      }
      else{
         System.out.println("Congratulations " + customer.getName() +". You've just bought your very own SuperShine Washcard!");
         washcard.setCredit(value);
         System.out.println("The value of your Washcard is currently: " + washcard.getCredit() + " kr.");
         System.out.println("You will now be directed to the startscreen");
         userGreeting();
      }
   }
   // Recharge del 1
   public void rechargeWashcard(){
      if (washcard.getCredit() == 0){
         System.out.println("You need to buy a washcard before being able to recharge it");
         userGreeting();
      }
   }
   
   // Recharge del 2
   public void enterRechargeAmount(){
      Scanner scan = new Scanner (System.in);
      System.out.println("Please enter the amount of money that you want to insert into your card");
      int value;
      value = scan.nextInt();
      washcard.setCredit(washcard.getCredit() + value);
      System.out.println("You will now be redirected to the start screen");
      userGreeting();
   }
   
   public void checkCredit(){
      System.out.println("You have " + washcard.getCredit() + " kr. on your washcard.");
      System.out.println("You will now be redirected to the start screen");
      userGreeting();
   }
   
}