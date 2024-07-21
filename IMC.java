import java.util.Scanner;
public class main {
    public static void main(String[] args) throws Exception {
    @SuppressWarnings("resource")
    Scanner scanner= new Scanner (System.in);
    System.out.print ("Ingrese su peso en Kg: ");
    double peso= scanner.nextDouble();
    System.out.print ("Ingrese su altura en metros: ");
    double altura= scanner.nextDouble();
    double imc= peso/ (altura*altura);
    System.out.println("Su indice de masa coorporal es: "+imc);
}
    }

