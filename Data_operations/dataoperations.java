public class dataoperations {
    public static void main(String args []) {

        int a = 10;
        int b = 5;

        int sum = a + b;
        int diff = a - b;
        int pro = a * b;
        int divi = a / b;
        int modu = a % b;

        if (a > b) {
            a++;   
            System.out.println("The increament of a is :" + a);
        }

        else if (a > b) {
            a--;   
            System.out.println("The decrement of b is:" + a);
        }

        else if (a >= b && sum > 10) {
            System.out.println("AND condition true");
        }

        else if (a < b || sum > 10) {   
            System.out.println("OR condition true");
        }

        else if (!(b > a)) {
            System.out.println("NOT condition true");
        }
        System.out.println("sum of two numbers is:" + sum);
        System.out.println("difference of two numbers is :" + diff);
        System.out.println("product of two numbers is :" + pro);
        System.out.println("division of two numbers is :" + divi);
        System.out.println("modulus of two numbers is :" + modu);
    }
}
