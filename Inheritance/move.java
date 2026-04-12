class Vehicle {
void move(){
System.out.println("vehicle is movin");
}
}
class car extends Vehicle{
void move(){
System.out.println("Car is moving");
}
}
public class move{
public static void main(String[] args){
Vehicle v = new Vehicle();
v.move();
v = new car();
v.move();
}
}