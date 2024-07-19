public class square {
    public static void main(String[] args) {
        
        double num, sroot, rerr;
        

        for (num=1.0 ; num<100 ; num++){
            sroot = Math.sqrt(num);
            System.out.println("Square root of " + num + "is " + sroot);

            //Calcular el redondeo
            rerr = num - (sroot*sroot);
            System.out.println("Rounding error is " + rerr);
            System.err.println();
        }

    }
    
}
