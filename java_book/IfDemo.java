/*Uso de if */

public class IfDemo {
    public static void main(String[] args) {
        int a, b, c;

        a=2;
        b=3;

        if(a < b) System.out.println("a is less than b");

        //No muestra nada

        if(a==b) System.out.println("You wont see this");
        System.out.println();

        c = a-b;

        System.out.println("c contains -1");

        if (c >=0) System.out.println("c is non-negative");
        if(c < 0) System.out.println("c is negative");
    }
    
}
