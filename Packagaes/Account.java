// File: Account.java
package banking;

public class Account {

    private void privateMethod() {
        System.out.println("This is a Private Method");
    }

    protected void protectedMethod() {
        System.out.println("This is a Protected Method");
    }

    public void publicMethod() {
        System.out.println("This is a Public Method");
    }

    // Public method to access private method
    public void accessPrivate() {
        privateMethod();
    }
}