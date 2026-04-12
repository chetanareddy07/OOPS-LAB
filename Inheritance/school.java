import java.util.Scanner;
class person{
String name;
int id;
person(String name, int id){
this.name= name;
this.id = id;
}
void display(){
System.out.println("Name: " + name);
System.out.println("ID: " + id);
}
}
class student extends person{
String department;
double cgpa;
student(String name, int id, String department, double cgpa){
super(name,id);
this.department = department;
this.cgpa = cgpa;
}
void display(){
super.display();
System.out.println(department+"is department");
System.out.println(cgpa + "is cgpa");
}
}
class research extends student{
String guide;
String topic;
research (String name, int id,String department, double cgpa, String guide, String topic){
super(name,id,department,cgpa);
this.guide= guide;
this.topic= topic;
} 
void display(){
super.display();
System.out.println(guide +"is the guide");
System.out.println(topic +"is the topic");
}
}
public class school{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the name:");
String name = sc.nextLine();
System.out.print("Enter the id:");
int id = sc.nextInt();
sc.nextLine();
System.out.print("Enter he department:");
String department = sc.nextLine();
System.out.print("Enter the cgpa:");
double cgpa = sc.nextDouble();
sc.nextLine();
System.out.print("Enter the guide:");
String guide = sc.nextLine();
System.out.print("Enter the topic:");
String topic = sc.nextLine();
 research scholar = new research(name, id, department, cgpa, guide,topic);
 System.out.println("\n----- Research Scholar Profile -----");
 scholar.display();
sc.close();
}
}
