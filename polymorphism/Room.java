import java.util.Scanner;
class Rooms{
double getrate(){
return 0;
}
}
class Deluxe extends Rooms{
double getrate(){
return 3000;
}
}
class Standard extends Rooms{
double getrate(){
return 1500;
}
}
public class Room{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of rooms:");
int n = sc.nextInt();
sc.nextLine();
Rooms[] R = new Rooms[n];
for (int i =0; i<n; i++){
System.out.println("Enter the room type : 1.Deluxe 2.Standard");
int choice = sc.nextInt();

if (choice ==1){
R[i] = new Deluxe();
}
else {
R[i] = new Standard();
}
}
double total =0;
for(int i=0; i <n; i++){
total += R[i].getrate();
}
System.out.println("Total amount:" + total);
sc.close();
}
}

