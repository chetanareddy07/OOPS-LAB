interface payment{
void pay(double amount);
}
class credit implements payment{
public void pay(double amount){
System.out.println("The amount:"+ amount + " is pay by credit card");
}
}
class debit implements payment{
public void pay(double amount){
System.out.println("The amount:" + amount + " is pay by debit card");
}
}
class UPI implements payment{
public void pay(double amount){
System.out.println("The amount:" +amount + " is pay by UPI");
}
}
public class way{
public static void main(String[] args){
credit c = new credit();
debit d = new debit();
UPI u = new UPI();

c.pay(1000);
d.pay(500);
u.pay(200);
}
}