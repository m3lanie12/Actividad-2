import java.util.Scanner;
public class main {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner (System.in);
        System.out.println("Ingrese el salario bruto mensual: ");
        double salarioBruto= scanner.nextDouble();
        System.out.println("Ingrese el porcentaje de impuestos: ");
        double porcentajeImpuestos= scanner.nextDouble();
        System.out.println("Ingrese las deducciones adicionales: ");
        double deduccionesAdicionales= scanner.nextDouble();
        double impuesto= salarioBruto*(porcentajeImpuestos/100);
        double salarioNeto= salarioBruto - impuesto - deduccionesAdicionales;
        System.out.println("El salario netos del empleado es: "+salarioNeto);
        
    }
}
