package safaricom;

import java.util.Scanner;

public class Mshwari {
 Scanner scanner=new Scanner(System.in);
 int d;
  void hel(){
 MPESA t=new MPESA();
 int shwari=200;
System.out.println("");
System.out.println("***Welcome to Mshwari***");
System.out.println("1.Deposit Funds");  
System.out.println("2.Withdraw to MPESA");
System.out.println("3.Check Balance"); 
System.out.println("0.Back to main menu");
for(int i=0;i<=5;i++){
System.out.print("Input: "); 
int s=scanner.nextInt();
switch(s){
 case 1:
 System.out.print("Enter amount to deposit: "+"$");
 int d=scanner.nextInt();
 shwari=shwari+d;
 break;
 
 case 2:
 System.out.print("Enter amount to withdraw: "+"$"); 
 int wi=scanner.nextInt();
 
 case 3:
 System.out.println("Your Mshwari account balance is: "+"$"+shwari);
 break;
 
 case 0:
 t.let();
 break;
}
}
}
}
