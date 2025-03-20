
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

    public Stack<Prenda> ingresarRepuesto(){
        Stack<Prenda> prendaPila = new Stack<Prenda>();
        Prenda prenda = new Prenda();
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la marca: ");
        prenda.setMarca(sc.nextLine().toLowerCase());

        System.out.print("Ingrese la referencia: ");
        prenda.setReferencia(sc.nextLine().toLowerCase());

        System.out.print("Ingrese el precio: ");
        prenda.setPrecio(sc.nextDouble());
        sc.nextLine();

        System.out.print("Ingrese la cantidad: ");
        prenda.setCantidad(sc.nextInt());

        prendaPila.push(prenda);

        System.out.println("Prenda guardada con exito.");

        sc.close();

        return prendaPila;

        
    }

    public void consultarPrenda(Stack<Prenda> prendas) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la opcion que desea realizar: 1. Buscar por marca 2. Buscar por referencia");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese la marca que desea consultar: ");
                String marca = sc.nextLine();
                Prenda prendaSeleccionada = prendas.peek();
                for(Prenda prenda : prendas){
                    if(prenda.getMarca().equalsIgnoreCase(marca)){
                        prendaSeleccionada = prenda;
                    }
                }
                System.out.println("La prenda que selecciono es: " );
                System.out.println("Marca: " + prendaSeleccionada.getMarca() + " Referencia: " + prendaSeleccionada.getReferencia() + " Precio: " + prendaSeleccionada.getPrecio() + " Cantidad: " + prendaSeleccionada.getCantidad());
                break;
            case 2:
                System.out.println("Ingrese la referencia que desea consultar: ");
                String refencia = sc.nextLine();
                Prenda prendaSeleccionadaRef = prendas.peek();

                for(Prenda prenda : prendas){
                    if(prenda.getReferencia().equalsIgnoreCase(refencia));
                    prendaSeleccionada = prenda;
                }

                System.out.println("La prenda que selecciono es: " );
                System.out.println("Marca: " + prendaSeleccionadaRef.getMarca() + " Referencia: " + prendaSeleccionadaRef.getReferencia() + " Precio: " + prendaSeleccionadaRef.getPrecio() + " Cantidad: " + prendaSeleccionadaRef.getCantidad());
                break;
            default:
                System.out.println("Respuesta incorrecta ingresa una de las dos opciones");
                break;
        }

        

    }

    

}