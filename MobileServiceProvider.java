 //Chase Moskowitz
package com.mycompany.modifylab4;


public class MobileServiceProvider 
{
    // Private data attributes
    private char customerPackage;
    private int numberOfMinutesUsed;
    
    /**
     * The constructor
     * @param newCustomerPackage the customer's package name
     * @param newNumberOfMinutesUsed the number of minutes used for the
     *                               month by the customer
    */
    MobileServiceProvider( char newCustomerPackage, int newNumberOfMinutesUsed)
    {
        customerPackage = newCustomerPackage;
        numberOfMinutesUsed = newNumberOfMinutesUsed;
    }
    
    /**
     * A getCustomerPackage method gets the package name the customer
     * is using.
     * @return the package name of the customer
    */
    public char getCustomerPackage()
    {
        return customerPackage;
    
    }
    
    /**
     * A getNumberOfMinutesUsed method returns the number of minutes used
     * by the customer for the month.
     * @return the number of minutes used
    */
    public int getNumberOfMinutesUsed()
    {
        return numberOfMinutesUsed;
    
    }
    
    /**
     * The setCustomerPackage method sets the package name.
     * @param newCustomerPackage the new package name
    */
    public void setCustomerPackage(char newCustomerPackage)
    {
        customerPackage = newCustomerPackage;
    }
    
    /**
     * The setNumberOfMinutesUsed method  sets the number of minutes used
     * by the customer for the month.
     * @param newNumberOfMinutes is the new number of minutes used
    */
    public void setNumberOfMinutesUsed(int newNumberOfMinutes)
    {
        numberOfMinutesUsed = newNumberOfMinutes;
    }
    
    /**
     * The totalCharges method calculates the total charges for the month for
     * each customer based on the package name and the number of minutes
     * being used.
     * @return the total charges for the customer for the month
    */
    public double totalCharges()
    {
        double monthlyCharge = 0;
        if(customerPackage == 'A' || customerPackage == 'a')
        {
            monthlyCharge = 39.99;
            if(numberOfMinutesUsed > 450)
            {
               monthlyCharge += 0.45*(numberOfMinutesUsed - 450);
                        
            }
        }
        
        else if(customerPackage == 'B' || customerPackage == 'b')
        {
            monthlyCharge = 59.99;
            if(numberOfMinutesUsed > 900)
            {
               monthlyCharge +=  0.40*(numberOfMinutesUsed - 900);
            }
        }
        
        else
        {
            monthlyCharge = 69.99;
        }
        return monthlyCharge;
         
    }
    /**
    * toString method
    */
     public String toString()
   {
       
       // Create a string describing the stock.
        String str = "MSP Plan:" + customerPackage +
                    " Min.:" + numberOfMinutesUsed +
                    " $" + totalCharges();
      
        // Return the string.
        return str;
   }
    
}
