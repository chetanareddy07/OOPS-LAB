import java.util.Scanner;
class movie{
String name;
int time;
int screenno;
int avaseats;

movie (String name, int time, int screenno, int avaseats){
this.name = name;
this.time = time;
this.screenno= screenno;
this.avaseats = avaseats;
}
void booktickets(int seats){
if(seats <= avaseats){
avaseats -= seats;
System.out.println(seats +" is successfully booked for the "+screenno);
}else{
System.out.println("no seats are available");
}
}
void canceltickets(int seats){
avaseats +=seats;
System.out.println(seats +"tickets is cancelled for the "+screenno);
}
void display(){
System.out.println("----Screen details---");
System.out.println("movie name:"+name);
System.out.println("showtime:"+time);
System.out.println("screen time:"+screenno);
System.out.println("available seats:"+avaseats);
}
}
public class showtime{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Tickect management system");
System.out.println("/n Enter the details of the screen 1");
System.out.print("Enter the movie name:");
String name1 = sc.nextLine();
System.out.print("Enter the show time:");
int time1 = sc.nextInt();
System.out.print("Enter the available seats:");
int ava1 = sc.nextInt();
sc.nextLine();

movie scr1 = new movie(name1, time1,1, ava1);

System.out.println("Enter the details of the screen 2");
System.out.print("Enter the movie name:");
String name2 = sc.nextLine();
System.out.print("Enter the show time:");
int show2 = sc.nextInt();
System.out.print("Enter the available seats:");
int ava2 = sc.nextInt();
sc.nextLine();

movie scr2 = new movie (name2,show2,2,ava2);

System.out.print("Enter the number of seats to books in screen 1:");
int book1 = sc.nextInt();
scr1.booktickets(book1);
sc.nextLine();

System.out.print("Enter the number of seats to book in screen 2:");
int book2 = sc.nextInt();
scr2.booktickets(book2);
sc.nextLine();

System.out.println("Enter the number of tickets cancelled in screen 1:");
int cancel = sc.nextInt();
scr1.canceltickets(cancel);

System.out.println("---Ticket booking---");
scr1.display();
scr2.display();
}
}



