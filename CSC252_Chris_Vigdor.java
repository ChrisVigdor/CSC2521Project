/**
Chris Vigdor
09/13/2022
Demo Program
This porgram uses the Policy class i created to make an object to determine the insurance policy cost for a customer
*/

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
      System.out.println("Provider Name: "+ obj.getProviderName());
      System.out.println("Policyholder's First Name: "+ obj.getPolicyFName());
      System.out.println("Policyholder's Last Name: "+ obj.getPolicyLName());
      System.out.println("Policyholder's Age: "+ obj.getPolicyAge());
      System.out.println("Policyholder's Smoking Status: " + obj.getSmokingStatus());
      System.out.println("Policyholder's Height: "+ obj.getPolicyHeight() + " inches");
      System.out.println("Policyholder's Weight: "+ obj.getPolicyWeight() + " ponds");
      System.out.printf("Policyholder's BMI: %.2f\n",  obj.policyBMI());
      System.out.printf("Policy Price: $%,.2f\n",  obj.calculateInsuranceCost());
   }
}