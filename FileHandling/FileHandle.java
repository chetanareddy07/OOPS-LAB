import java.io.*;
import java.util.Scanner;
public class FileHandle{
public static void main(String args[]){
try{
File file = new File("Sample.txt");
file.createNewFile();

FileWriter fw = new FileWriter(file);
Scanner input = new Scanner(System.in);
String a = input.nextLine();
fw.write(a);
fw.close();
System.out.println("Successfully written");
}
catch (IOException e){
System.out.println("Error handling file");
}
}
}