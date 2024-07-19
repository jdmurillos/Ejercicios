class ScopeDemo {
    public static void main(String[] args) {
        
        int x; //Variable global para todo el ámbito main

        x=10;

        if (x == 10){ //Nuevo ámbito
            int y = 20; // Variable local solo para el nuevo ámbito

            // x e y se conocen aquí

            System.out.println("x and y: " + x + " " + y );
            x = y * 2;

        }

        //y = 100; // Error, y es desconocido globalmente

        // x sigue siendo conocido

        System.out.println("x is: "+ x);
    }
    
}
