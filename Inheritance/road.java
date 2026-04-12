import java.util.Scanner;
class vehicle{
String reg;
String fuel;
int speed;
vehicle(String reg, String fuel, int speed){
this.reg= reg;
this.fuel= fuel;
this.speed=speed;
}
void start(){
System.out.println(reg+"is started");
}
void stop(){
System.out.println(reg+"is stopped");
}
void display(){
System.out.println("Registration: " + reg);
System.out.println("Fuel: " + fuel);
System.out.println("Speed: " + speed);
}}
class Bus extends vehicle{
int cap;
Bus(String reg, String fuel, int speed, int cap){
super(reg,fuel,speed);
this.cap=cap;
}
void display(){
super.display();
System.out.println("Enter the capacity:");
}
}
class Truck extends vehicle{
double ton;
Truck(String reg, String fuel, int speed, double ton){
super(reg,fuel,speed);
this.ton= ton;
}
void display(){
super.display();
System.out.println("Enter the no of tons:");
}
}
class Vans extends vehicle{
Boolean ref;
Vans(String reg, String fuel, int speed, Boolean ref){
super(reg,fuel,speed);
this.ref=ref;
}
void display(){
super.display();
if(ref.equals("yes"){
System.out.println("The vans support refrigeration: yes");
}else{
System.out.println("The vans support refrigeration: No");
}
}
}
public class road{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Choose the vehicle");
System.out.println("1.Bus");
System.out.println("2.Trucks");
System.out.println("3.Vans");

System.out.print("Enter the registration number:");
String reg = sc.nextLine();
System.out.print("Enter the type of the fuel:");
String fuel = sc.nextLine();
System.out.print("Enter the speed :");
int speed = sc.nextInt();
sc.nextLine();
System.out.print("choose:");
int choose = sc.nextInt();

switch(choose){
case 1:
System.out.print("Enter the capacity of bus:");
int cap= sc.nextInt();
Bus bus = new Bus(reg, fuel, speed, cap);
bus.start();
bus.display();
bus.stop();
break;

case 2:
System.out.print("Enter the load of the truck:");
double load= sc.nextDouble();

Truck truck = new Truck(reg, fuel,speed, load);
truck.start();
truck.display();
truck.stop();
break;

case 3:
System.out.print("Enter the refrigeration:");
Boolean ref = sc.nextBoolean();

Vans vans = new Vans(reg,fuel,speed,ref);
vans.start();
vans.display();
vans.stop();
break;

default:
System.out.println("invalid choice");
}
sc.close();
}
}


