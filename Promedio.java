import java.util.Scanner;
public class main {
/**
 * @param args
 */
 public static void main(String[] args){

    @SuppressWarnings("resource")
    Scanner Scanner= new Scanner (System.in);
    System.out.print ("Ingrese la primer calificacion: ");
    double n1= Scanner.nextDouble();
    System.out.print ("Ingrese la segunda calificacion: ");
    double n2= Scanner.nextDouble();
    System.out.print ("Ingrese la tercera calificacion: ");
    double n3= Scanner.nextDouble();
    @SuppressWarnings("unused")
    double promedio= (n1+n2+n3)/3;
    System.out.println("El promedio obtenido es: "+promedio);
    }
}

