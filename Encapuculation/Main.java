class Student{
private int[] marks = new int[5];

void setmarks(int m, int i){
if (i>=0 && i<=4){
marks[i]=m;}
else{
System.out.println("Invalid index");
}
}
int tot=0;
void getmarks(){
for (int i:marks){
System.out.println(i);
tot+=i;
}
}

void average(){
int avg = tot/5;
System.out.println("Average: "+avg);
}
}

public class Main{
public static void main(String args[]){
Student s = new Student();
s.setmarks(98,0);
s.setmarks(86,1);
s.setmarks(79,2);
s.setmarks(83,3);
s.setmarks(64,4);

s.getmarks();
s.average();
}}
