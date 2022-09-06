import java.util.Scanner;

public class CSC252_Chris_Vigdor{

   public static void main(String[] args){
      Policy obj = new Policy();
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Please enter the Policy Number: ");
      obj.setPolicyNum(keyboard.nextInt());
      keyboard.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      obj.setProviderName(keyboard.nextLine());
      
      System.out.print("Please enther the Policyholder's First Name: ");
      obj.setPolicyFName(keyboard.nextLine());
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      obj.setPolicyLName(keyboard.nextLine());
      
      System.out.print("Please enter the Policyholder's Age: ");
      obj.setPolicyAge(keyboard.nextInt());
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholer's Smokin Status(smoker/non-smoker): ");
      obj.setSmokingStatus(keyboard.nextLine());
      
      System.out.print("Please enter the Policyholder's Height(in inches): ");
      obj.setPolicyHeight(keyboard.nextDouble());
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Weight(in pounds): ");
      obj.setPolicyWeight(keyboard.nextDouble());
      
      System.out.println("Policy number: "+ obj.getPolicyNum());
   }
}