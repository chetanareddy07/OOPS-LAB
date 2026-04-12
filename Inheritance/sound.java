import java.util.Scanner;
class animal{
void makesound(){
System.out.println("Animal make a sound");
}
}
class dog extends animal{
void makesound(){
System.out.println("Dog braks");
}
}
class cat extends animal{
void makesound(){
System.out.println("Cat meow");
}
}
public class sound{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
animal a =new animal();

System.out.println("Choose the animal");
System.out.println("1. Dog");
System.out.println("2. cat");

System.out.print("Choose:");
int choose = sc.nextInt();
System.out.println("Anmial sound");
switch (choose){
case 1:
 a = new dog();
 a.makesound();
break;

case 2:
a = new cat();
a.makesound();
break;

default:
System.out.println("invalid choose");
}

sc.close();
}
}