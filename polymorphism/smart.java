interface device{
void on();
void off();
}
class light implements device{
public void on(){
System.out.println("The lights are turn on");
}
public void off(){
System.out.println("The lights turned off");
}
}
class fan implements device{
public void on(){
System.out.println("The fan is turn on");
}
public void off(){
System.out.println("The fan is turn off");
}
}
public class smart{
public static void main(String[] args){

light l = new light();
fan f = new fan();
l.on();
l.off();

f.on();
f.off();
}
}