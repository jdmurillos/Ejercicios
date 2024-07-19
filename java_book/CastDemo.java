public class CastDemo {
    public static void main(String[] args) {
        
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x/y); // Convertir la división en entero.

        System.out.println("Integer outcome of x/y: " + i );

        i = 100;
        b = (byte) i; //No se pierde información
        System.out.println("Value of b: " + b);

        i = 257;
        b = (byte) i; // Byte no puede almacenar
        System.out.println("Value of b: " + b);

        b = 88; // Código ASCII para X
        ch = (char) b; // Conversión entre tipos incompatibles
        System.out.println("ch: " + ch);

        


    }
    
}
