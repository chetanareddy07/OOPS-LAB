import java.util.Scanner;
class gadgets{
String name;
String status;
String version;

gadgets(){
this.name = "SG-Device";
this.status="Inactive";
this.version="v1.0";
}
//testing//
gadgets(String name, String version){
this.name=name;
this.status ="inactive";
this.version = version;
}
//purchasing//
gadgets(gadgets copy){
this.name= copy.name;
this.status="Active";
this.version = copy.version;
}
void display(){
System.out.println("Name of device:"+ name);
System.out.println("Status of device:"+status);
System.out.println("version of device:"+version);
}
}
public class smart{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Choose the tyep");
System.out.println("1.default");
System.out.println("2.purchase");

System.out.print("choose:");
int choose = sc.nextInt();
sc.nextLine();

gadgets gad = null;
switch(choose){
case 1:
System.out.println("Default details");
gad = new gadgets();
break;

case 2:
System.out.println("Gadget details");
System.out.print("Enter the name:");
String name = sc.nextLine();
System.out.print("Enter the version");
String version = sc.nextLine();

gadgets copy = new gadgets(name,version);

gad = new gadgets(copy);
break;
default:
System.out.println("invalid choice");
}
System.out.println("---puschase details---");
gad.display();
sc.close();
}
}

