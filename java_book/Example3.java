/* Ejemplo para mostrar las diferencias entre tipo de dato int y double */

public class Example3 {
    public static void main(String[] args) {
        int var; //Declaro una variable de tipo int
        double x; //Decalor una variable de tipo coma flotante

        var = 10; // Asigna el valor 10 a var
        x = 10.0; // Asigna el valor 10.0 a x

        System.out.println("Valor original de var: " + var);
        System.out.println("Valor original de x: " + x);
        System.out.println(); //Imprimir una línea en blanco

        //Dividir ambas variables entre 4
         var = var/4;
         x = x/4;

         System.out.println("var luego de ser dividida entre 4: " + var);
         System.out.println("Variable x luego de ser dividida entre 4: " + x);
         

    }
    
}
