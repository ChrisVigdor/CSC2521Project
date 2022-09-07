/**TODO:: format output and make sure grammar is correct
          must pass args when creqting obj, nut sure why, got it working fine without passing args
*/
public class Policy{
      private int policyNumber, policyHolderAge;
      private String providerName, policyFirstName, policyLastName, policySmokingStatus;
      private double policyHeightIn, policyWeightLbs;
      
      /**
      Constructor
      @param policyNum, The policy number
      @param providerName, The provider name
      @param firstName, The policy holders first name
      @param lastName, The policy holders last name 
      @param age, The policy holders age
      @param smokingStatus, The policy holders smoking status(smoker or non-smoker)
      @param height, The policy holder height in inches
      @param weight, The policy holders weight in lbs
      */
      public Policy(int policyNum, String providerName, String firstName, String lastName, int age, String smokingStatus, double height, double weight){
         policyNumber = policyNum;
         providerName = providerName;
         policyFirstName = firstName;
         policyLastName = lastName;
         policyHolderAge = age;
         policySmokingStatus = smokingStatus;
         policyHeightIn = height;
         policyWeightLbs = weight;
      }
      
      /**
      No-arg constructor
      */
      public Policy(){
         policyNumber = 0;
         providerName = "";
         policyFirstName = "";
         policyLastName = "";
         policyHolderAge = 0;
         policySmokingStatus = "";
         policyHeightIn = 0;
         policyWeightLbs = 0;
      }
      /**
         This method calcualtes and returns the policy holders BMI
         @param weight, policy holders weight
         @param height, policy holders height
      */
      public double policyBMI(){
         return (policyWeightLbs *703)/(policyHeightIn*policyHeightIn);
      }
      
      /**
         This method calulates and returns the cost of the insurance policy
      */
     public double calculateInsuranceCost(){
         double baseFee = 600;
         if(policyHolderAge > 50){
            baseFee+=75;
         }
         if(policySmokingStatus.equalsIgnoreCase("smoker")){
            baseFee+=100;
         }
         if(policyBMI() > 35){
           baseFee+=(policyBMI() - 35) * 20;
         }
            return baseFee;
      }
      
      
      
      /**
         The setPolicyNum method stores the policy number in the 
         policyNumber field
         @param policyNum, The policy number
      */
      public void setPolicyNum(int policyNum){
         policyNumber = policyNum;
      }
      /**
         The getPolicyNum method returns the value stored in the policyNumber field
      */
      public int getPolicyNum(){
         return policyNumber;
      }
      /**
         The setProviderMethod
      */
      public void setProviderName(String provName){
         providerName = provName;
      }
      public String getProviderName(){
         return providerName;
      }
      /**
         The setPolicyName method store the policy holders name in the policyFirstName var
         @param name, The policy holders first name that needs to be stored
      */
      public void setPolicyFName(String name){
         policyFirstName = name;
      }
      /**
         This method reutnrs the policy holders first name
      */
      public String getPolicyFName(){
         return policyFirstName;
      }
      /**
         This method stores the policy holders last name
         @param name, The policy holders last name
      */
      public void setPolicyLName(String name){
         policyLastName = name;
      }
      
      /**
        This method returns the policy holders last name 
      */
      public String getPolicyLName(){
         return policyLastName;
      }
      /**
         This method stores the policy holders age
         @param age, The policy holders age
      */
      public void setPolicyAge(int age){
         policyHolderAge = age;
      }
      /**
         This method returns the policy holders age
      */
      public int getPolicyAge(){
         return policyHolderAge;
      }

      /**
         This method sets the policy holders smoking status(smoker or non-smoker)
         @param status, The policy holders smoking status
      */
      public void setSmokingStatus(String status){
         policySmokingStatus = status;
      }
      /**
         This method reutns the policy holders smoking status
      */
      public String getSmokingStatus(){
         return policySmokingStatus;
      }
      /**
         This method stores the policy holders height in inches
         @param h, the policy holders height in inches
      */
      public void setPolicyHeight(double h){
         policyHeightIn = h;
      }
      /**
         This method returns the policy holders height in inches
      */
      public double getPolicyHeight(){
         return policyHeightIn;   
      }
      /**
         This method sets the policy holders weight in pounds
         @param w, The policy holders weight 
      */
      public void setPolicyWeight(double w){
         policyWeightLbs = w;
      }
      /**
         This method returns the policy holder weight in pounds
      */
      public double getPolicyWeight(){
         return policyWeightLbs;
      }
}