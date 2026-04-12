import java.util.Scanner;
class patient{
int id;
String name;
int contact;
String procedure;

patient(int id, String name, int contact, String procedure){
this.id =id;
this.name= name;
this.contact=contact;
this.procedure= procedure;
}
int calcost(){
if(procedure.equals("Cleaning")){
 return 500;
}else if(procedure.equals("Filling")){
return 1500;
} else if(procedure.equals("Extraction")){
return 2000;
} else if (procedure.equals("Rootcanel")){
return 8000;
} else {
return 0;
}
}
void display(){
System.out.println("----PATIENT DETAILS---");
System.out.println("Id of the patient:"+ id);
System.out.println("Name of the patient:"+ name);
System.out.println("Contact of patient:"+ contact);
System.out.println("Type of procedure:"+ procedure);
System.out.println("The total amount:"+ calcost());
}
}
public class tooth{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

for( int i=1; i<=5 ;i++){
System.out.println("Patient details");
System.out.print("Enter the id:");
int id = sc.nextInt();
sc.nextLine();
System.out.print("Enter the name:");
String name = sc.nextLine();
System.out.print("Enter the contact:");
int contact = sc.nextInt();
sc.nextLine();
System.out.print("ENter the procedure(Cleaning,Fillig, Extraction and Rootcanel):");
String procedure = sc.nextLine();

patient data = new patient(id,name,contact,procedure);
data.display();
}
sc.close();
}
}
