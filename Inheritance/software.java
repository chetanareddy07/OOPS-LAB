import java.util.Scanner;
class Empy{
String name;
int id;
double salary;
Empy(String name, int id, double salary){
this.name=name;
this.id= id;
this.salary= salary;
}
void display(){
System.out.println(name +" is the employee");
System.out.println(id+ " is the id");
System.out.println(salary+ "is the salary");
}
}
class Tlead extends Empy{
int size;
double bonus;
Tlead(String name, int id, double salary, int size, double bonus){
super(name, id, salary);
this.size=size;
this.bonus= bonus;
}
void display(){
super.display();
System.out.println(size+" is the team size");
System.out.println(bonus+" is the bonus");
}
}
class manager extends Tlead{
String pname;
int bud;
manager(String name, int id, double salary, int size , double bonus , String pname, int bud){
super(name,id,salary,size,bonus);
this.pname=pname;
this.bud=bud;
}
void display(){
super.display();
System.out.println(pname +"is the project name");
System.out.println(bud+" is the budget of the project");
}
}
public class software{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
 System.out.print("Enter Employee Name: ");
 String name = sc.nextLine();
System.out.print("Enter Employee ID: ");
int id = sc.nextInt();
System.out.print("Enter Base Salary: ");
double salary = sc.nextDouble();
System.out.print("Enter Team Size: ");
 int size = sc.nextInt();
System.out.print("Enter Leadership Bonus: ");
double bonus = sc.nextDouble();
sc.nextLine(); 
System.out.print("Enter Project Name: ");
String pname = sc.nextLine();
System.out.print("Enter Project Budget: ");
int bud = sc.nextInt();
sc.nextLine();
manager pm = new manager(name, id, salary, size, bonus, pname, bud);
System.out.println("\n------ Project Manager Profile ------");
 pm.display();
sc.close();
    }
}
