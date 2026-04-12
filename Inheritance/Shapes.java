import java.util.Scanner;

abstract class Shape{
abstract void area();
}

class Circle extends Shape{
double r;

Circle(double r){
this.r = r;
}

void area(){
double result = 3.14*r*r;
System.out.println("The area of the circle:"+ result);
}
}

class Rectangle extends Shape{
int l;
int b;

Rectangle(int l, int b){
this.l = l;
this.b = b;
}

void area(){
int result = l*b;
System.out.println("The area of the rectangle:"+ result);
}
}

public class Shapes{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the radius:");
double r = sc.nextDouble();

System.out.print("Enter the length:");
int l = sc.nextInt();

System.out.print("Enter the breadth:");
int b = sc.nextInt();

Circle c = new Circle(r);
Rectangle rec = new Rectangle(l,b);

System.out.println("---Area of the shapes---");

c.area();
rec.area();

sc.close();
}
}