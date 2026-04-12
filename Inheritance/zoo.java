import java.util.Scanner;
class Animal{
 String name;
 int age;
 String diet;
  Animal( String name, int age, String diet){
this.name =name;
this.age =age;
this.diet=diet;
}
void eat(){
System.out.println(name+ "is eating");
}
void sleep(){
System.out.println(name + "is sleeping");
}
void display(){
System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("Diet:"+diet);
}
}
class Mammals extends Animal{
 String furcolor;
 Mammals (String name, int age, String diet, String furcolor){
super(name,age,diet);
this.furcolor=furcolor;
}
void run(){
System.out.println(name+" is running");
}
void display(){
super.display();
System.out.println(furcolor+ " is furcolor");
}
}
class Bird extends Animal{
 double windspan;
 Bird(String name, int age, String diet, double windspan){
super(name,age,diet);
this.windspan=windspan;
}
void fly(){
System.out.println(name +" is flying"); 
}
void display(){
super.display();
System.out.println("Wingspan"+ windspan +"meters");
}
}
class Repetils extends Animal{
 boolean venomous;
Repetils(String name, int age, String diet, boolean venomous){
super(name,age,diet);
this.venomous= venomous;
}
void crawl(){
System.out.println(name +" is crawling");
}
void display(){
super.display();
System.out.println("venomous is " +venomous);
}
}
public class zoo{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.println("Choose the type");
System.out.println("1.Mammals");
System.out.println("2.Birds");
System.out.println("3.Repetils");
System.out.print("choose:");
int choose = sc.nextInt();
sc.nextLine();
System.out.print("Enter the name:");
String name = sc.nextLine();
System.out.print("Enter the age:");
int age = sc.nextInt();
sc.nextLine();
System.out.print("Enter the diet:");
String diet= sc.nextLine();

switch (choose) {

            case 1:
                System.out.print("Enter Fur Color: ");
                String fur = sc.nextLine();

                Mammals m = new Mammals(name, age, diet, fur);
                m.display();
                m.eat();
                m.sleep();
                m.run();
                break;

            case 2:
                System.out.print("Enter Wingspan (in meters): ");
                double wing = sc.nextDouble();

                Bird b = new Bird(name, age, diet, wing);
                b.display();
                b.eat();
                b.sleep();
                b.fly();
                break;

            case 3:
                System.out.print("Is it venomous? (true/false): ");
                boolean venomous = sc.nextBoolean();

                Repetils r = new Repetils(name, age, diet, venomous);
                r.display();
                r.eat();
                r.sleep();
                r.crawl();
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
