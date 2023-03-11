package safaricom;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MPESA {

public static void main(String[] args) {

static void let(){
Scanner obj=new Scanner(System.in);
Mshwari one=new Mshwari();
int balance=154;
System.out.println("");
System.out.println("***Welcome to Safaricom MPESA***");
System.out.println("-----------------------------------------");
System.out.print("Enter your MPESA PIN: ");
int pin=obj.nextInt();
if(pin!=2000&&pin!=2015){
System.out.println("Wrong pin!!"); 
System.exit(0);
}
System.out.println("-----------------------------------------");
System.out.println(" "+"1.Send Money");
System.out.println(" "+"2.Deposit Funds");
System.out.println(" "+"3.Withdraw money"); 
System.out.println(" "+"4.Savings");
System.out.println(" "+"5.Check Balance");
System.out.println(" "+"0.Exit");
for(int i=1;i<=6;i++){
System.out.print("Select an input: ");
int s=obj.nextInt();
switch(s){
case 1:
System.out.print("Enter the number you want to send to: "+"+254 7");
long no=obj.nextInt();
System.out.print("Enter the amount: "+"$");
int na=obj.nextInt();
if(balance>na){
 balance=balance-na;   
}
else{
System.out.println("Insufficient Money in your account to send "+"$"+na+""+" to "+"+254 7"+no);    
}
break;
case 2:
System.out.print("Enter the deposit amount: "+"$"); 
int deposit=obj.nextInt();
balance=balance+deposit;
break;

case 3:
System.out.print("Enter amount to withdraw: "+"$"); 
int withdraw=obj.nextInt();
if(balance>withdraw){
balance=balance-withdraw;
}
else{
System.out.println("Insufficcient Funds");   
}
break;

case 4:
one.hel();
break;

case 5:
System.out.println("Your MPESA balance is: "+balance);
break;

case 0:
JOptionPane.showMessageDialog(null,"Thank you for using MPESA!!","Confirm Dialogue",JOptionPane.ERROR_MESSAGE );
 System.exit(0);
break;

default:
System.out.println("Invalid Choice");
break;
}
}      
}
}
