import java.util.Scanner;
class person{
String name;
int age;

person(String name, int age){
this.name = name;
this.age=age;
}
void display(){
System.out.println("----Student Details---");
System.out.println("Name:" +name);
System.out.println("Age:" + age);
}
}
class students extends person{
int id;
String course;
students(String name, int age, int id, String course){
super(name,age);
this.id=id;
this.course=course;
}
void display(){
super.display();
System.out.println("Student ID:"+id);
System.out.println("Course:"+course);
}
}
public class student{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Student details");
System.out.print("Name of the student:");
String name= sc.nextLine();
System.out.print("Age:");
int age = sc.nextInt();
System.out.print("Student id:");
int id= sc.nextInt();
sc.nextLine();
System.out.print("Course:");
String course = sc.nextLine();

students data = new students(name,age,id,course);
data.display();

sc.close();
}
}