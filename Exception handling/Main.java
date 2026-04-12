class ArithmeticDivisionException extends Exception{
public ArithmeticDivisionException(String message){
super(message);
}
}

class Division{

public void div(int n, int m) throws ArithmeticDivisionException{
if (m==0){
throw new ArithmeticDivisionException("Denominator can't be zero");
}
else{
int result = n/m;
}
}
}

public class Main{
public static void main(String args[]){
Division d  = new Division();
try{
d.div(10,5);
d.div(5,0);
}
catch (ArithmeticDivisionException e){
System.out.println("Error: "+e.getMessage());
}
}}	
