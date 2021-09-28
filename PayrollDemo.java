import java.util.Scanner;

/**
 * This program demonstrates a solution to the Payroll Class programming
 * challenge.
 */

public class PayrollDemo 
{
   public static void main(String[] args) throws InvalidNameException, InvalidIDException, InvalidHourlyRateException, InvalidHoursException
   {
      // Variables for input
      String name;         // An employee's name
      int id;              // An employee's ID number
      double payRate;      // An employee's pay rate
      double hoursWorked;  // The number of hours worked
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the employee's name.
      System.out.print("Enter the employee's name: ");
     name = keyboard.nextLine();
      
      // Get the employee's ID number.
      System.out.print("Enter the employee's ID number: ");
      id = keyboard.nextInt();

      // Get the employee's pay rate.
      System.out.print("Enter the employee's hourly pay rate: ");
      payRate = keyboard.nextDouble();
      
      // Get the number of hours worked by the employee.
      System.out.print("Enter the number of hours worked " +
                       " by the employee: ");
      hoursWorked = keyboard.nextDouble();

      newEmployee(name, id, payRate, hoursWorked);
      
      keyboard.close();

   }

      // Create a Payroll object and store the data in it.
   public  static void newEmployee(String n, int iD, double payRate, double hrWorked) throws InvalidNameException, InvalidIDException, InvalidHourlyRateException, InvalidHoursException
   {
     
      try
      { Payroll worker= new Payroll(n, iD, payRate, hrWorked);
              
         // test if we make it to this point
         System.out.println("Payroll Object created. ");
            // Display the employee's payroll data.
         System.out.println("\nEmployee Payroll Data");
         System.out.println("Name: " + worker.getName());
         System.out.println("ID Number: " + worker.getIdNumber());
         System.out.println("Hourly pay rate: " + worker.getPayRate());
         System.out.println("Hours worked: " + worker.getHoursWorked());
         System.out.println("Gross pay: $" + worker.getGrossPay());
      }

        catch (InvalidNameException e) {
         e.printStackTrace();
      } catch (InvalidIDException e) {
         e.printStackTrace();

      } catch (InvalidHourlyRateException e) {
         e.printStackTrace();

      } catch (InvalidHoursException e) {
         e.printStackTrace();

      }
     
   
   }
}
