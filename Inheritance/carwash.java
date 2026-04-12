import java.util.Scanner;
class wash{
String name;
int license;
String model;
String color;

wash(String name, int license, String model, String color){
this.name = name;
this.license = license;
this.model = model;
this.color= color;
}
 void exteriorwash(){
display("Service performed is: Basic Exterior wash");
}
void intcleaning(){
display("Service performed is: Interior cleaning");
}
void full(){
display("Service performed is: full detail services");
}
void display(String service){
System.out.println("----Details of the car----");
System.out.println("Owner name:"+ name);
System.out.println("License number:"+license);
System.out.println("Model name:"+model);
System.out.println("Car color:"+color);
System.out.println("Car service:"+ service);
}

}
public class carwash{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Sprankle car wash");
for ( int i=1 ; i <= 3; i++) {
System.out.println("\n Enter the details of the car "+i);
System.out.print("Enter the owner name:");
String name = sc.nextLine();
System.out.print("Enter the license number:");
int license = sc.nextInt();
sc.nextLine();
System.out.print("Enter the model:");
String model= sc.nextLine();
System.out.print("Enter the color:");
String color = sc.nextLine();

wash car = new wash(name,license,model,color);

System.out.println("Select the type of service");
System.out.println("1.basic wash");
System.out.println("2.interior wash");
System.out.println("3.full detail service");
System.out.print("Choose:");
int choose = sc.nextInt();
sc.nextLine();

switch(choose){
case 1:
car.exteriorwash();
break;

case 2:
car.intcleaning();
break;

case 3:
car.full();
break;
default:
System.out.println("invalid option");
}
}
sc.close();
}
}
