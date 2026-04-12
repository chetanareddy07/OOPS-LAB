import java.util.Scanner;
class member{
int id;
String name;
int age;
String type;
double amount;

member(int id, String name , int age, String type, double amount){
this.id =id;
this.name= name;
this.age=age;
this.type=type;
this.amount=amount;
}
void display(){
System.out.println("---Member's profile ----");
System.out.println("ID of the member:"+ id);
System.out.println("Name of the member:"+ name);
System.out.println("Age of the member:"+ age);
System.out.println("Membership type:"+ type);
System.out.println("Amount paid:"+ amount);

if (age<25){
System.out.println("Eligible for youth discount");
}else{
System.out.println("Not Eligible for the Youth Discount");
}
}}
public class gym{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);

for(int i=1; i<=4; i++){
System.out.println("\n Enter the details of the member "+ i);
System.out.print("Enter the id :");
int id = sc.nextInt();
sc.nextLine();
System.out.print("Enter the name :");
String name = sc.nextLine();
System.out.print("Enter the age:");
int age = sc.nextInt();
sc.nextLine();
System.out.print("Enter the type:");
String type = sc.nextLine();
System.out.print("Enter the amount:");
double amount = sc.nextDouble();
sc.nextLine();

member pro = new member(id,name,age,type,amount);
pro.display();
}
sc.close();
}
}

