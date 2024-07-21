import java.util.Scanner;
public class Main {
    @SuppressWarnings("unused")
    private static final String area = null;

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
    try (Scanner scanner = new Scanner(System.in)) {
        {
                System.out.print("Ingrese la longitud del rectangulo: ");
                double longitud= scanner.nextDouble();
                System.out.println ("Ingrese el ancho del rectangulo: ");
                double ancho=scanner.nextDouble();
                double area= longitud*ancho;
                System.out.print ("El area del rectangulo es: "+area);
        }
    }
}
}
    

        





