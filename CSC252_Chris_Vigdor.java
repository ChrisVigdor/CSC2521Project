/**
Chris Vigdor
10/09/2022
Demo Program
This porgram uses the Policy class i created to make an object to determine the insurance policy cost for a customer
Expanded from part 1, now the program gets input from a text file
*/

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class CSC252_Chris_Vigdor{

   public static void main(String[] args) throws IOException{
   
      int  policyHolderAge;
      String providerName, policyFirstName, policyLastName, policyNumber, policySmokingStatus;
      double policyHeightIn, policyWeightLbs;
      
      Policy obj = new Policy();
      ArrayList<Policy> policyList = new ArrayList<>();
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      while(inputFile.hasNext()) 
      {
         /**
            Keeps thwrowing mismatch exception, not sure why when ive checked the inputs from the file and they are correct
            if all vars are String it can read all data from file perfectly
         */
        policyNumber = inputFile.nextLine();
        providerName = inputFile.nextLine();
        policyFirstName = inputFile.nextLine();
        policyLastName = inputFile.nextLine();
        policyHolderAge = inputFile.nextInt();
        policySmokingStatus = inputFile.nextLine();
        policyHeightIn = inputFile.nextDouble();
        policyWeightLbs = inputFile.nextDouble();
        inputFile.nextLine();
        
                
        
         
         
        //policyList.add(new Policy (policyNumber, providerName, policyFirstName, policyLastName, policyHolderAge, policySmokingStatus, policyHeightIn, policyWeightLbs));
      }
      
      
      
      
      for(int i = 0; i < policyList.size(); i++)
         {  
            Policy list = policyList.get(i);
            System.out.println("1Policy number: "+ obj.getPolicyNum());
            System.out.println("1Provider Name: "+ obj.getProviderName());
            System.out.println("1Policyholder's First Name: "+ obj.getPolicyFName());
            System.out.println("1Policyholder's Last Name: "+ obj.getPolicyLName());
            System.out.println("1Policyholder's Age: "+ obj.getPolicyAge());
            System.out.println("1Policyholder's Smoking Status: " + obj.getSmokingStatus());
            System.out.println("1Policyholder's Height: "+ obj.getPolicyHeight() + " inches");
            System.out.println("1Policyholder's Weight: "+ obj.getPolicyWeight() + " ponds");
            System.out.printf("1Policyholder's BMI: %.2f\n",  obj.policyBMI());
            System.out.printf("1Policy Price: $%,.2f\n",  obj.calculateInsuranceCost());
         }
   }
}