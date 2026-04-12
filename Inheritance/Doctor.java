import java.util.Scanner;
class person{
String name;
int age;

person(String name, int age){
this.name= name;
this.age=age;
}
void display(){
System.out.println("Name:"+name);
System.out.println("Age:"+age);
}
}
class doctor extends person{
String special;

doctor(String name, int age, String special){
super(name,age);
this.special= special;
}
void display(){
super.display();
System.out.println("Specilization:"+special);
}
}
public class Doctor{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the name:");
String name = sc.nextLine();
System.out.print("Enter the age:");
int age = sc.nextInt();
sc.nextLine();
System.out.print("Enter the specialization:");
String special = sc.nextLine();

doctor doc = new doctor(name,age,special);
doc.display();
sc.close();
}
}
