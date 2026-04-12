import java.io.*;
import java.util.*;
public class program{
public static void main(String[] args){

try{
File file = new File("output.text");
file.createNewFile();
Scanner input = new Scanner(System.in);
FileWriter fw= new FileWriter(file);
System.out.println("Enter data to store in file:");
String data = input.nextLine();
fw.write(data);
fw.close();
System.out.println("Data written to file successfully");
 } catch (Exception e) {
 System.out.println("Error writing to file");
}
 }
}
