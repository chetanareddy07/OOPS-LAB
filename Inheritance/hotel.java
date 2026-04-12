import java.util.Scanner;
class reservation{
String name;
String type;
int floorno;
double nightpay;

reservation(){
this.name="walk in guest";
this.type="standard";
this.floorno = 0;
this.nightpay = 2000;
}

reservation(String name, String type, int floorno, double nightpay){
this.name = name;
this.type =type;
this.floorno = floorno;
this.nightpay = nightpay;
}
reservation(reservation r , String newname){
this.name=newname;
this.type= r.type;
this.floorno = r.floorno;
this.nightpay = r.nightpay;
}
void display(){
System.out.println("Guest name:"+ name);
System.out.println("Room type:"+type);
System.out.println("Floor number:"+floorno);
System.out.println("Nightpay:"+nightpay);
}
}
public class hotel{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Choose the type:");
System.out.println("1.walh in quest");
System.out.println("2.direct reserve");
System.out.println("3.reffred guest");
System.out.print("choose:");
int choose = sc.nextInt();
sc.nextLine();

reservation Reservation = null;
switch(choose){

case 1:
Reservation = new reservation();
break;

case 2:
System.out.println("Enter the details of the guest");
System.out.print("ENter the name:");
String name = sc.nextLine();
System.out.print("Enter the type of room:");
String type = sc.nextLine();
System.out.print("Enter the floor number:");
int floorno = sc.nextInt();
sc.nextLine();
System.out.print("Enter the nightpay :");
double nightpay = sc.nextDouble();
sc.nextLine();

Reservation = new reservation(name,type,floorno,nightpay);
break;

case 3:
System.out.println("Details of reffered guest");
System.out.print("Enter the name:");
String newname = sc.nextLine();
System.out.print("Enter the type of room:");
String ntype = sc.nextLine();
System.out.print("Enter the floor number:");
int nfloorno = sc.nextInt();
sc.nextLine();
System.out.print("Enter the nightpay :");
double nnightpay = sc.nextDouble();
sc.nextLine();

reservation reserve = new reservation(newname,ntype,nfloorno,nnightpay);

System.out.print("Enter the new guest name:");
String guestname= sc.nextLine();
Reservation = new reservation(reserve,guestname);
break;

default:
System.out.println("Invaild choice");
}
System.out.println("----Booking details---");
Reservation.display();
sc.close();
}
}
