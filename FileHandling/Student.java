import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class Student{
public static void main(String args[]){
try{
File file = new File("Students.txt");
file.createNewFile();

FileWriter fw = new FileWriter(file);
fw.write("Nandini\n");
fw.write("Nigila\n");
fw.write("Hema\n");
fw.write("Nikshitha\n");
fw.write("Vinodha\n");
fw.write("Kavya\n");
fw.close();

Scanner sc = new Scanner(file);

String[] names = new String[6];
int i = 0;
while (sc.hasNextLine()){
names[i] = sc.nextLine();
i+=1;
}

Arrays.sort(names);
for( String s:names){
System.out.println(s);
}
}
catch(IOException e){
System.out.println("Unexpected Error!");
}
}}