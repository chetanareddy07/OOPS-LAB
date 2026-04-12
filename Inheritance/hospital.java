import java.util.Scanner;
class registration{
int count = 1001;

int id;
String name;
int age;
String ward;
String notes;

registration(){
this.id = count++;
this.name = "unknown";
this.age = 0;
this.ward = "emergency";
this.notes = "none";
}
registration (String name, int age, String ward){
this.id = count++;
this.name= name;
this.age = age;
this.ward = ward;
this.notes = "none";
}
registration (String name, int age, String ward, String notes){
this.id = count++;
this.name= name;
this.age = age;
this.ward = ward;
this.notes= notes;
}

registration (registration p){
this.id = count++;
this.name = p.name;
this.age= p.age;
this.ward = p.ward;
this.notes = p.notes;
}
void display(){
System.out.println("ID of patient:"+ id);
System.out.println("Name of the patient:" +name);
System.out.println("Age :"+ age);
System.out.println("Ward details:"+ward);
System.out.println("Patient OP: "+notes);
}
}
public class hospital{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
System.out.println("choose the registration type");
System.out.println("1.Emergency");
System.out.println("2.Appoitment");
System.out.println("3.heslth camps");
System.out.print("choose:");
int choose = sc.nextInt();
sc.nextLine();

registration reg = null;

switch(choose){
case 1:
System.out.println("Emergency details");
reg = new registration();
break;

case 2:
System.out.println("Appiontment details");
System.out.print("Enter the name :");
String name = sc.nextLine();
System.out.print("Enter the age:");
int age = sc.nextInt();
sc.nextLine();
System.out.print("Enter the ward:");
String ward = sc.nextLine();
System.out.print("Enter the notes:");
String notes = sc.nextLine();

reg = new registration(name,age,ward,notes);
break;

case 3: 
System.out.println("Camp details");
System.out.print("Enter the name :");
String name1 = sc.nextLine();
System.out.print("Enter the age:");
int age1 = sc.nextInt();
sc.nextLine();
System.out.print("Enter the ward:");
String ward1 = sc.nextLine();
System.out.print("Enter the notes:");
String notes1 = sc.nextLine();

registration p = new registration(name1,age1,ward1,notes1);

reg = new registration(p);
break;
default:
System.out.println("invalid choice");
}
System.out.println("----Patient details----");
reg.display();
sc.close();
}
}
