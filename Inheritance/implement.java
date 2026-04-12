import java.util.Scanner;
class Employee{
String name;
double salary;

Employee(String name, double salary){
this.name= name;
this.salary= salary;
}
void display(){
System.out.println("Name:"+ name);
System.out.println("salary:"+ salary);
}
}
class manager extends Employee{
int size;
manager(String name, double salary, int size){
super(name, salary);
this.size = size;
}
void display(){
super.display();
System.out.println("Team size:"+size);
}
}
class projectmanager extends manager{
String pname ;
projectmanager(String name, double salary, int size, String pname){
super(name,salary,size);
this.pname = pname;
}
void display(){
super.display();
System.out.println("Project name:"+pname);
}
}
public class implement{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the name:");
String name = sc.nextLine();
System.out.print("Enter the salary:");
double salary = sc.nextDouble();
System.out.print("Enter the team size:");
int size = sc.nextInt();
sc.nextLine();
System.out.print("Enter the project name");
String pname = sc.nextLine();

projectmanager pro = new projectmanager(name,salary,size,pname);
System.out.println("---Details--");
pro.display();
sc.close();
}
}



