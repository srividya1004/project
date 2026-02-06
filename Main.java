import java.util.Scanner;
class Atm
{
    private double balance ;
    private int PIN;
    double amount;
    
    void setPIN(int enteredPIN)
    {
        PIN = enteredPIN;
    }
    void setbalance(int balance)
    {
        this.balance = balance;
    }

    boolean validatePIN(int enteredPIN)
    {
       return PIN == enteredPIN;
    }
     
    void deposit(double amount)
    {
        if(amount <=0)
            System.out.println("Invalid amount deposit");
        else
            balance += amount;
    }
    void withdraw(double amount)
    {
        if(amount <= balance )
        {
            balance-=amount;
            System.out.println("withdrawal successfull!.....");
        }
            
        else
            System.out.println("Invalid Withdrawal.. Enter the correct amount");

    }
    void checkBalance()
    {
        System.out.println("Balance amount :   "+balance);
    }
}
class Main
{
   public static void main (String[]args) 
{
    Scanner sc = new Scanner(System.in);

    Atm atm = new Atm();
    atm.setPIN(0410);
    atm.setbalance(5000);
    System.out.println("Enter PIN : \n");
    int enteredPIN = sc.nextInt();

if (!atm.validatePIN(enteredPIN)) {
    System.out.println("Invalid PIN. Please try again.");
    return;
}
     
System.out.println(" PIN verified. Welcome!");


 System.out.println("CHOOSE THE OPTION ");
     
      boolean looping = true;
      while(looping)
      {
      System.out.println("1.DEPOSITE \n 2. WITHDRAW \n 3. CHECKBALANCE \n 4.EXIT ");
     
      double amount;
      int choice = sc.nextInt();
   
      switch(choice)

       {    case 1: System.out.println("Enter the amount ");
                    amount = sc.nextDouble();
                    atm.deposit(amount);
                    System.out.println("deposit successfull!...");
                      break;
            case 2 :System.out.println("Enter the amount ");
                  amount = sc.nextDouble();
                   atm.withdraw(amount);
                  break;
            case 3 : atm.checkBalance();
                 break;
            case 4 : 
            looping = false;
            System.out.println("Thank you for your Transcations");
                     break;
             default:
                      System.out.println("Invalid choice ");       
      }

       }

    
    }
}
