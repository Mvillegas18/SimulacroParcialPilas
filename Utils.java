
import java.util.Scanner;
import java.util.Stack;

public class Utils {
    
    public void menu(){
        Scanner sc = new Scanner(System.in);

        boolean salir = true;

        while(salir){
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion){
                case 1:
                    System.out.println("Sumar");
                    break;
                case 2:
                    System.out.println("Restar");
                    break;
                case 3:
                    System.out.println("Multiplicar");
                    break;
                case 4:
                    System.out.println("Dividir");
                    break;
                case 5:
                    System.out.println("Gracias por usar nuestro taller");
                    salir = false;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }

    public void ingresarRepuesto(){
        Stack<Repuestos> repuestos = new Stack<Repuestos>();
        Repuestos repuesto = new Repuestos();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la marca del repuesto: ");
        repuesto.setMarca(sc.nextLine());

        System.out.println("Ingrese el precio del repuesto: ");
        repuesto.setPrecio(sc.nextDouble());

        System.out.println("Ingrese la cantidad del repuesto: ");
        repuesto.setCantidad(sc.nextInt());
        sc.nextLine();

        System.out.println("Ingrese la referencia del repuesto: ");
        repuesto.setReferencia(sc.nextLine());

        repuestos.push(repuesto);
    }

}