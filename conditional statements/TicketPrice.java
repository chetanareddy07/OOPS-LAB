import java.util.Scanner;
class TicketPrice{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
int age;
Boolean member;
System.out.print("Enter the age:");
age = input.nextInt();
System.out.print("Are you a member?(true/false)");
member = input.nextBoolean();
if (age < 18){
  if (member == true){
     System.out.println("You need to pay Rs.300");}
  else{
     System.out.println("You need to pay Rs.500");}}
else if (age >= 18 && age<58){
  if (member==true){
     System.out.println("You need to pay Rs.800");}
  else{
     System.out.println("You need to pay Rs.1000");}}
else{
  if (member==true){
     System.out.println("You need to pay Rs.900");}
  else{
     System.out.println("You need to pay Rs.1100");}}

}}