public class LogicalOpTable {
    public static void main(String[] args) {
        
        boolean p, q;
        System.out.println("-----");
        System.out.println("P \tQ \tAND \tOR \tXOR \tNOT ");

        p = true;
        q = true;

        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t"+ (p&q) + "\t" + (p^q) + "\t" + (!p) +"\n");

        p = true;
        q = false;

        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t"+ (p|q) + "\t" + (p^q) + "\t" + (!p) +"\n");

        p = false;
        q = true;

        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t"+ (p|q) + "\t" + (p^q) + "\t" + (!p) +"\n");

        p = false;
        q= false;

        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t"+ (p|q) + "\t" + (p^q) + "\t" + (!p) +"\n");



        






        




    }
    
}
