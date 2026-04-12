package atm;
import banking.Account;

class bank extends Account {
    public static void main(String[] args) {

        bank obj = new bank();

        
        obj.publicMethod();       // Accessible
        obj.protectedMethod();    // Accessible (same package or subclass)
        obj.accessPrivate();          
}
}