import java.util.Scanner;
class Fibonacci{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
int ft = -1;
int st = 1;
int tt, temp;
System.out.print("Enter the number of fibonacci terms:");
int n = input.nextInt();
System.out.println("First "+n+" Fibonacci Terms:");
do{
tt = ft+st;
System.out.println(tt);
ft = st;
st = tt;
n--;} while(n>0);
}}