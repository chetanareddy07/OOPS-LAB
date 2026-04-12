import java.util.Scanner;
class shapes{
void area(){
System.out.println("Area of the shapes");
}
}
class circle extends shapes{
double r;

circle(double r){
this.r=r;
}
void area(){
double result = 3.14*r*r;
System.out.println("Area of the Circle:"+result);
}
}
class rectangle extends shapes{
int len;
int b;
rectangle(int len, int b){
this.len=len;
this.b=b;
}
void area(){
int result = len*b;
System.out.println("Area of the rectangle:"+result);
}
}
class triangle extends shapes{
double bas;
double h;
triangle(double bas, double h){
this.bas=bas;
this.h=h;
}
void area(){
double result = 0.5*bas*h;
System.out.println("Area of the Triangle:"+result);
}
}
public class shape{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Area of the Shapes");
System.out.print("Enter the radis:");
double r = sc.nextDouble();
System.out.print("Enter the length:");
int len = sc.nextInt();
System.out.print("Enter the breadth:");
int b = sc.nextInt();
System.out.print("Entr the base value:");
double bas= sc.nextDouble();
System.out.print("Enter the height:");
double h = sc.nextDouble();
sc.nextLine();

circle c = new circle(r);
rectangle rec = new rectangle(len,b);
triangle t = new triangle(bas,h);

System.out.println("----Area of the Shapes----");
c.area();
rec.area();
t.area();

sc.close();
}
}

