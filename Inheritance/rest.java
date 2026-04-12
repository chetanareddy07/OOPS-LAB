import java.util.Scanner;
class order{
String item;
int quantity;
String address;
String instruction;

order(){
item = "vegcombo";
quantity = 1;
address="to be updated";
instruction= "no specific conditions";
}
order(String item, int quantity){
this.item=item;
this.quantity = quantity;
this.address = "home address on file";
this.instruction =" no specila";
}
order(String item, int quantity, String address,String instruction){
this.item= item;
this.quantity = quantity;
this.address= address;
this.instruction = instruction;
}
void display(){
System.out.println("Item name:"+item);
System.out.println("Quantity of the food:"+quantity);
System.out.println("Address:"+address);
System.out.println("Instruction:"+ instruction);
}
}
public class rest{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("choose the meals");
System.out.println("1.vegcombo");
System.out.println("2.order with iteam and quantity");
System.out.println("3.Detailedd order");
System.out.print("choose:");
int choose = sc.nextInt();
sc.nextLine();

order Order = null;
switch(choose){
case 1:
Order = new order();
break;

case 2:
System.out.println("Details of the order of item an quantity");
System.out.print("Enter the item name:");
String name = sc.nextLine();
System.out.print("enter the quantity:");
int qty = sc.nextInt();
sc.nextLine();

Order= new order(name,qty);
break;

case 3:
System.out.println("detailed order");
System.out.print("Enter the item name:");
String item = sc.nextLine();
System.out.print("Enter the quantity:");
int qunatity = sc.nextInt();
sc.nextLine();
System.out.print("Enter the address:");
String address = sc.nextLine();
System.out.print("Enter the instruction:");
String instruction = sc.nextLine();

Order = new order(item,qunatity,address,instruction);
break;

default:
System.out.println("invalid choice");
}
sc.close();
Order.display();
}
}