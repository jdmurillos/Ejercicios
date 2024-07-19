/*Programa que convierte galones a litros */

class GalToLit {
    public static void main(String[] args) {
        double gallons; //Contiene el número de galones
        double liters; // Contiene el número de litros
        int counter; //contador para hacer salto de línea cada 10 iteraciones

        counter = 0;
       
        for(gallons= 1; gallons <=100; gallons++){
            liters = gallons * 3.7854; // Convertir a litros
            System.out.println(gallons + " gallons is " + liters + " liters");

            counter ++; //Se incrementa 1 al counter

            if (counter ==10);{
                System.out.println();
                counter = 0; //Reestablecer el contador de líneas
            }
        }

      

        
    }
}
