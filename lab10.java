package oopj24csb66;
import java.util.*;
class MyCustomBank
{
Scanner sc=new Scanner(System.in);
String acc_no,acc_name,acc_type;
int balance;
void op_acc()
{
System.out.println("Enter account number");
acc_no=sc.nextLine();
System.out.println("Enter account type");
acc_type=sc.nextLine();
System.out.println("Enter name");
acc_name=sc.nextLine();
System.out.println("Enter initial balance");
balance=sc.nextInt();
}
void dis_acc()
{
System.out.println("Account number: "+acc_no);
System.out.println("Account type: "+acc_type);
System.out.println("Account holder name: "+acc_name);
System.out.println("Balance: "+balance);
}
void depo()
{
int depoamount;
System.out.println("Enter amount to deposit");
depoamount=sc.nextInt();
try
{
if((depoamount<=0))
{throw new InvalidAmountException("Deposit amount can't be zero");}
else
{balance=depoamount+balance;}
System.out.println("Your new balance is "+balance);
}catch(InvalidAmountException e)
{
System.out.println(e.getMessage());
}
}
void with()
{
System.out.println("Enter Withdrawal amount:");
int withamount=sc.nextInt();
try
{
if(withamount<=0)
{
throw new InvalidAmountException("Withdrawal amount can't be zero");
}
else if(withamount>balance)
{
throw new InsufficientFundsException("Insufficient balance");
}
balance=balance-withamount;
System.out.println("Your new balance is "+balance);
}catch(InvalidAmountException | InsufficientFundsException e)
{
System.out.println(e.getMessage());
}
}
}
public class lab10{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int ch;String op="y";
MyCustomBank ob=new MyCustomBank();
do {
System.out.println("*** Banking System Application ***\n"
+ "1. Open New Account\n"
+ "2. Display Account Details\n"
+ "3. Deposit Amount\n"
+ "4. Withdraw Amount\n"
+ "5. Exit");
System.out.println("Enter your Choice");
ch=sc.nextInt();
switch(ch) {
case 1 :
ob.op_acc();
break;
case 2 :
ob.dis_acc();
break;
case 3 :
ob.depo();
break;
case 4 :
ob.with();
break;
case 5 :
System.out.println("Exiting...");
break;
default:
System.out.println("Invalid option...");
break;
}sc.nextLine();
System.out.println("Do you want to continue(Y/N)");
op=sc.nextLine();
}while(op.equalsIgnoreCase("y"));
}}