import java.util.Scanner;

class shapes{
void area(){
System.out.println("Calculating the area");
}
}
class circle extends shapes{
double r;
circle(double r){
this.r =r;
}
void area(){
double result = 3.14*r*r;
System.out.println("Area of the circle is:" +result);
}
}

class rect extends shapes{
double l;
double b;
rect(double l , double b){
this.l = l;
this.b = b;
}
void area(){
double result = l*b;
System.out.println("Area of the rectangle:" + result);
}
}
class tri extends shapes{
double base;
double h;
tri(double base, double h){
this.base = base;
this.h = h;
}
void area(){
 double result = 0.5*base*h;
System.out.println("Area of the triangle:" +result);
}
}

public class Area{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.print("Enter the radius:");
double r = sc.nextDouble();
circle c = new circle(r);
c.area();

System.out.print("Enter the length:");
double l = sc.nextDouble();
System.out.print("Enter the breadth:");
double b =sc.nextDouble();
rect angle = new rect(l,b);
angle.area();

System.out.print("Enter the base:");
double base = sc.nextDouble();
System.out.print("Enter the height:");
double h = sc.nextDouble();
tri t = new tri(base, h );
t.area();

sc.close();
}
}


