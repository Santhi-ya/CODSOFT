import java.util.Scanner;
public class ATM extends BankAccount implements Atm
{
    
    public static void main (String[] srgs)
    { BankAccount account = new BankAccount();
        Atm a = new ATM();
        Scanner s= new Scanner(System.in);
        System.out.println("Welcome to ATM Machine");
        System.out.println("1.checkbalance ");
        System.out.println("2.withdraw cash ");
        System.out.println("3.deposit cash ");
        System.out.println("4.Exit");
         int i=1;
        while( i<5)
        {
        System.out.println("Enter the choice :");
        int choice= s.nextInt();
          switch(choice)
          {
            case 1:
              account.checkbalance(account.balance);
              break;
            case 2:
              account.withdraw();
              break;
            case 3:
              account.deposit( );
              break;
            case 4:
              System.exit(0);
              break;
          }
        }
    }

}

class BankAccount 
{ 
 
    int balance=50000;
    public void checkbalance( int balance )
    {
     System.out.println("Balance:"+balance);
     
    }
    public int  withdraw()
     {      System.out.println("Enter the amount to withdraw");
             Scanner sc= new Scanner(System.in);
              int amount=sc.nextInt();
        if(amount<=balance)
        {
            balance =balance - amount;
          
          return balance;
        }
        else
        {
            System.out.println("Insufficient balance!");
        }
        return 0;
       
    }
    public int deposit()
    {
         System.out.println("Enter the amouht to deposit ");
              Scanner sca= new Scanner(System.in);
              int amount = sca.nextInt();
      if(amount>0)
      {
        balance+=amount;
        System.out.println("Deposited amount="+amount);
        return balance;
      }
      else
      {
        System.out.println("Invalid amount!");
      }
      return  balance;
    }
}



interface Atm
{
    public int withdraw();
   public int  deposit();
    public void checkbalance(int balance);

    
}