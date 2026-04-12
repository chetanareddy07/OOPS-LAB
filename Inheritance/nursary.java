import java.util.Scanner;
class garden{
int id,
String name;
String type;
double price;
int stock;

garden( int id, String name, String type, double price, int stock){
this.id= id;
this.name= name;
this.type = type;
this.price =price;
this.stock = stock;
}
void display(){
System.out.println("----PLANT DETAILES ---");
System.out.println("Plant ID:"+ id);
System.out.println("Name :"+name);
System.out.println("Type:"+ type);
System.out.println("Price:"+price);
System.out.println("Stock:" +stock);
}
void purshace(int qty){
if (qty <= stock){
 stock = stock-qty;
System.out.println( "Sale successfully" + qty+" : plants are sale");
} else {
System.out.println("Sale cannot be processed");
}
}
void restock(int qty){
stock = stock+qty;
System.out.println(qty+" is added to the stock");
}
}
public class nursary{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
for (int i=1; i<=3; i++){
System.out.println("/n Enter details of plant "+ i);
System.out.print("Enter the id :");
int id = sc.nextInt();
sc.nextLine();
System.out.print("Enter the name:");
String name = sc.nextLine();
System.out.print("Enter the type:");
String type = sc.nextLine();
System.out.print("Enter the price:");
double price = sc.nextDouble();
System.out.print("Enter the total stock:");
int stock = sc.nextInt();
sc.nextLine();

garden grd = new garden(id,name,type,price,stock);
grd.display();

System.out.print("Enter the quantity of sale:");
int sal = sc.nextInt();
grd.purchase(sal);

System.out.print("Enter the quantity of restore:");
int res = sc.nextInt();
grd.restock(res);
}
sc.close();
}
}

