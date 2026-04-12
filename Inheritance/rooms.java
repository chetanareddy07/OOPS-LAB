import java.util.Scanner;
class room{
double getRate(){
return 0;
}
}
class deluxeRoom extends room{
double getRate(){
return 2000;
}
}
class standardroom extends room{
double getRate(){
return 1000;
}
}
public class rooms{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Number of rooms in deluxe:");
int d = sc.nextInt();
System.out.print("Number of rooms in standard:");
int s = sc.nextInt();

deluxeRoom deluxe = new deluxeRoom();
standardroom stand = new standardroom();

double total = (d*deluxe.getRate())+(s*stand.getRate());
System.out.println("Total cost: "+total);
sc.close();
}
}