import java.util.Scanner;
class calculator {

int add(int a, int b){
return a+b ;
}
int add (int a, int b, int c){
return a+b+c;
}
int add(int a, int b, int c, int d){
return a+b+c+d;
}
}
public class addition{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
calculator c = new calculator();

System.out.println("--Addition  of integers--");
System.out.println("Enter the two numbers:");
int a = sc.nextInt();
int b = sc.nextInt();

System.out.println("Enter the three numbers:");
int x = sc.nextInt();
int y = sc.nextInt();
int z = sc.nextInt();

System.out.println("Enter the four numbers:");
int p = sc.nextInt();
int q = sc.nextInt();
int r = sc.nextInt();
int s = sc.nextInt();

System.out.println("Sum of two numbers:" + c.add(a,b));
System.out.println("Sum of three numbers:" + c.add(x,y,z));
System.out.println("Sum of four numbers:" + c.add(p,q,r,s));

sc.close();
}
}