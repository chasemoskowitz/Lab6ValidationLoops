package com.mycompany.modifylab4;
import java.util.Scanner;

/**
 *
 * @author Chase Moskowitz
 */
public class Lab6ValidationLoop 
{

    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        String customersPackageInput;
        char customersPackage;
        int minutesUsed;

        MobileServiceProvider customersMobilePlan;

        System.out.print("Enter Customers Mobile package (A,B,C): ");
        customersPackageInput = input.nextLine();

        // for this lab we assume a letter entered
        customersPackage = customersPackageInput.charAt(0);
        
         while (!(customersPackage=='a'||customersPackage=='A'
                 ||customersPackage=='B'||customersPackage=='b'
                 ||customersPackage=='c'||customersPackage=='C'))
         {
             System.out.println("\nInvalid Package. Try again");
             
             System.out.print("\nEnter Customers Mobile package (A,B,C): ");
             customersPackageInput = input.nextLine();
             
             customersPackage = customersPackageInput.charAt(0);
         }

        System.out.print("Enter the number of minutes the customer used"
                + " their phone: ");
        minutesUsed = input.nextInt();
        
        while ( minutesUsed<0)
        {
            System.out.print("\nMinutes used must be a positive"
                    + "number \n\n");
            
            System.out.print("Enter the number of minutes the customer used"
                + " their phone: ");
            minutesUsed = input.nextInt();
        }

        // instantiate the object
        customersMobilePlan = new MobileServiceProvider(customersPackage,
                                                        minutesUsed);

        System.out.println("\n" + customersMobilePlan);
        
        
        
    }
    
}
