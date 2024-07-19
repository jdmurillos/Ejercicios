class GuessGame{
    public static void main(String[] args) 
        
        throws java.io.IOException{

            char ch, answer = 'k';

            System.err.println("I am thinking of a letter between A and Z: ");
            System.out.print("Can you Guess it: ");

            ch = (char) System.in.read(); //leer un char desde el teclado
            
            if (ch == answer){
                System.out.println("** Right **");
            }
            else {
                System.out.println ("** Wrong, you are... **");
                if (ch < answer){
                    System.out.println("Too low");
                }
                else
                {
                    System.out.println("Too high");
                }  

            }
        }

    }
