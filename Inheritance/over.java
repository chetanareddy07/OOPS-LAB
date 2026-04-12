import java.util.Scanner;
class system{
void salary(){
System.out.println("Salary calculations");
}
}
class fulltime extends system{
double sal;
fulltime(double sal){
this.sal = sal;
}
void salary(){
System.out.println("Full time employee salary:"+ sal);
}
}
class parttime extends system{
int time;
int amount;
parttime(int time, int amount){
this.time = time;
this.amount= amount;
}
void salary(){
int result = time*amount;
System.out.println("Part time employee salary:"+result);
}
}
class contract extends system{
int money;
int bonus;
contract(int money, int bonus){
this.money=money;
this.bonus=bonus;
}
void salary(){
int result =money+bonus;
System.out.println("Contract Employee salary:"+result);
}
}
public class over{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Emplyoee salary");
System.out.print("Enter the salary of full time employee:");
double sal = sc.nextDouble();
System.out.print("Enter the no of hours worked:");
int time = sc.nextInt();
System.out.print("Enter the amount per hour:");
int amount = sc.nextInt();
System.out.print("Enter the total contract amount:");
int money = sc.nextInt();
System.out.print("Enter the bonus amount:");
int bonus  = sc.nextInt();
sc.nextLine();

fulltime full = new fulltime(sal);
parttime part = new parttime(time,amount);
contract c = new contract(money,bonus);
System.out.println("----Employee salary---");
full.salary();
part.salary();
c.salary();

sc.close();
}
}



