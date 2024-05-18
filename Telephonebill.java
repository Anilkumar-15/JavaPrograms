import java.util.Scanner;
class TelephoneBill 
{
int num_of_calls;
double bill;
TelephoneBill()
{
this.num_of_calls = 0;
this.bill = 0.0;
}
void getCalls() {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of calls: ");
num_of_calls = scanner.nextInt();
}
double calc() {
if (num_of_calls <= 1000) 
{
bill = num_of_calls * 0.5;
} 
else if (num_of_calls <= 2000) 
{
bill = 1000 * 0.5 + (num_of_calls - 1000) * 1.0;
} 
else 
{
bill = 1000 * 0.5 + 1000 * 1.0 + (num_of_calls - 2000) * 1.5;
}
bill += 100;
return bill;
}
void showMembers() {
System.out.println("Number of Calls: " + num_of_calls);
System.out.println("Bill: Rs. " + bill);
}
public static void main(String[] args) 
{
TelephoneBill ob=new TelephoneBill();
ob.getCalls();
double finalBill = ob.calc();
System.out.println("Final Bill: Rs. " + finalBill);
ob.showMembers();
    }
}
