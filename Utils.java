
import java.util.Scanner;
import java.util.Stack;

public class Utils {
    Scanner sc = new Scanner(System.in);
    Stack<Prenda> prendaPila = new Stack<Prenda>();
    public void menu(){

        boolean salir = false;

        while(!salir){
            System.out.println("1. Ingresar prenda");
            System.out.println("2. Buscar prenda");
            System.out.println("3. Modificar prenda");
            System.out.println("4. Eliminar prenda");
            System.out.println("5. Vender prenda");
            System.out.println("6. Salir");

            System.out.print("Ingresa una opcion: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion){
                case 1:
                    ingresarPrenda();

                    break;
                case 2:
                    consultarPrenda();
                    break;
                case 3:
                    modificarPrenda();
                    break;
                case 4:
                    eliminarPrenda();
                    break;
                case 5:
                    venderPrenda();
                    break;
                case 6:
                    System.out.println("Gracias por usar nuestro sistema");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }

    public void ingresarPrenda(){

        System.out.println("Ingresando prenda...");

        System.out.print("Ingresa la marca: ");
        String marca = sc.nextLine();
        System.out.print("Ingresa la referncia: ");
        String referencia = sc.nextLine();
        System.out.print("Ingresa el precio: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese la cantidad: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        // Verificar si ya existe la prenda en la pila

        for(Prenda prenda : prendaPila){
            if(prenda.getMarca().equalsIgnoreCase(marca) && prenda.getReferencia().equalsIgnoreCase(referencia)){
                prenda.setCantidad(prenda.getCantidad() + cantidad);
                System.out.println("Prenda existente cantidad actualizada.");
                return;
            }
        }

        prendaPila.push(new Prenda(marca, referencia, precio, cantidad));
        System.out.println("Prenda guardada con exito.");
    }

    public void consultarPrenda() {
        System.out.println("Ingresa la opcion que desea realizar: 1. Buscar por marca 2. Buscar por referencia");
        int opcion = sc.nextInt();
        sc.nextLine();

        Prenda prendaSeleccionada = null;
        switch (opcion) {
            case 1:
                System.out.print("Ingrese la marca que desea consultar: ");
                String marca = sc.nextLine().toLowerCase();

                for(Prenda prenda : prendaPila){
                    if(prenda.getMarca().equalsIgnoreCase(marca)){
                        prendaSeleccionada = prenda;
                        break;
                    }
                }
                System.out.println("La prenda que selecciono es: " );
                System.out.println("Marca: " + prendaSeleccionada.getMarca() + " Referencia: " + prendaSeleccionada.getReferencia() + " Precio: " + prendaSeleccionada.getPrecio() + " Cantidad: " + prendaSeleccionada.getCantidad());
                break;
            case 2:
                System.out.print("Ingrese la referencia que desea consultar: ");
                String refencia = sc.nextLine().toLowerCase();

                for(Prenda prenda : prendaPila){
                    if(prenda.getReferencia().equalsIgnoreCase(refencia)){
                        prendaSeleccionada = prenda;
                        break;
                    }
                }
                break;
            default:
                System.out.println("Respuesta incorrecta ingresa una de las dos opciones");
                return;
        }

        if(prendaSeleccionada != null){
            System.out.println("Prenda encontrada:");
            System.out.println("Marca: " + prendaSeleccionada.getMarca());
            System.out.println("Referencia: " + prendaSeleccionada.getReferencia());
            System.out.println("Precio: " + prendaSeleccionada.getPrecio());
            System.out.println("Cantidad: " + prendaSeleccionada.getCantidad());
        }else {
            System.out.println("Prenda no encontrada");
        }
    }

    public void modificarPrenda(){
        System.out.println("Ingresando a modificar prenda...");

        if(prendaPila.isEmpty()){
            System.out.println("No hay prendas registradas.");
            return;
        }


        System.out.println("1. Buscar por marca");
        System.out.println("2. Buscar por referencia");
        System.out.print("Ingrese una opción: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        Prenda prendaSeleccionada = null;

        switch (opcion){
            case 1:
                System.out.println("Ingrese la marca que desea modificar: ");
                String marca = sc.nextLine().toLowerCase();
                for(Prenda prenda : prendaPila){
                    if(prenda.getMarca().equalsIgnoreCase(marca)){
                        prendaSeleccionada = prenda;
                        break;
                    }
                }
                break;
            case 2:
                System.out.print("Ingrese la referencia que desea modificar: ");
                String referencia = sc.nextLine().toLowerCase();
                for(Prenda prenda : prendaPila){
                    if(prenda.getReferencia().equalsIgnoreCase(referencia)){
                        prendaSeleccionada = prenda;
                        break;
                    }
                }
               break;
            default:
                System.out.println("Respuesta incorrecta ingresa una de los opciones");
                return;
        }

        if(prendaSeleccionada == null){
            System.out.println("Prenda no encontrada");
            return;
        }

        System.out.println("Prenda encontrada");
        System.out.println("1. Marca: " + prendaSeleccionada.getMarca());
        System.out.println("2. Referencia: " + prendaSeleccionada.getReferencia());
        System.out.println("3. Precio: " + prendaSeleccionada.getPrecio());
        System.out.println("4. Cantidad: " + prendaSeleccionada.getCantidad());

        System.out.println("Ingrese el numero del campo que desea modificar: ");
        int campo = sc.nextInt();
        sc.nextLine();

        switch(campo){
            case 1:
                System.out.print("Ingrese la nueva marca: ");
                prendaSeleccionada.setMarca(sc.nextLine().toLowerCase());
                break;
            case 2:
                System.out.print("Ingrese la nueva referencia: ");
                prendaSeleccionada.setReferencia(sc.nextLine().toLowerCase());
                break;
            case 3:
                System.out.print("Ingrese el nuevo precio: ");
                prendaSeleccionada.setPrecio(sc.nextDouble());
                break;
            default:
                System.out.println("Opcion no valida");
                return;

        }
        System.out.println("El prenda se ha actualizado correctamente");
    }

    public void eliminarPrenda(){
        System.out.println("Ingresando a eliminar prenda...");
        if(prendaPila.isEmpty()){
            System.out.println("No hay prendas registradas.");
            return;
        }

        System.out.println("1. Buscar por marca");
        System.out.println("2. Buscar por referencia");
        System.out.println("Ingrese una opcion: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        Prenda prendaAEliminar = null;
        Stack<Prenda> pilaAux = new Stack<Prenda>();

        switch(opcion){
            case 1:
                System.out.println("Ingrese la marca de la prenda a eliminar: ");
                String marca = sc.nextLine().toLowerCase();
                while(!prendaPila.isEmpty()){
                    Prenda prenda = prendaPila.pop();
                    if(prenda.getMarca().equalsIgnoreCase(marca) && prendaAEliminar == null){
                        prendaAEliminar = prenda;
                    }else {
                        pilaAux.push(prenda);
                    }
                }
                break;
            case 2:
                System.out.print("Ingrese la referencia de la prenda a eliminar: ");
                String referencia = sc.nextLine().toLowerCase();
                while(!prendaPila.isEmpty()){
                    Prenda prenda = prendaPila.pop();
                    if(prenda.getReferencia().equalsIgnoreCase(referencia) && prendaAEliminar == null){
                        prendaAEliminar = prenda;
                    }else{
                        pilaAux.push(prenda);
                    }
                }
                break;
            default:
                System.out.println("Opcion no valida");
                return;
        }

        while(!pilaAux.isEmpty()){
            prendaPila.push(pilaAux.pop());
        }

        if(prendaAEliminar != null){
            System.out.println("El prenda se ha eliminado correctamente");
        }else {
            System.out.println("Prenda no encontrada");
        }
    }

    public void venderPrenda() {
        Stack<Prenda> aux = new Stack<>();
        boolean encontrada = false;

        System.out.print("Ingrese la referencia de la prenda a vender: ");
        String referencia = sc.nextLine().toLowerCase();

        System.out.print("Ingrese la cantidad a vender: ");
        int cantidadVender = sc.nextInt();

        while (!prendaPila.isEmpty()) {
            Prenda actual = prendaPila.pop();

            if (actual.getReferencia().equalsIgnoreCase(referencia)) {
                encontrada = true;

                if (actual.getCantidad() >= cantidadVender) {
                    actual.setCantidad(actual.getCantidad() - cantidadVender);
                    System.out.println("Venta realizada con éxito. Stock restante: " + actual.getCantidad());

                    // Solo agregar de vuelta si aún hay stock
                    if (actual.getCantidad() > 0) {
                        aux.push(actual);
                    } else {
                        System.out.println("La prenda se ha agotado y fue eliminada.");
                    }
                } else {
                    System.out.println("Stock insuficiente. Solo hay " + actual.getCantidad() + " unidades.");
                    aux.push(actual); // Devolver la prenda sin cambios
                }
            } else {
                aux.push(actual);
            }
        }

        // Restaurar la pila original
        while (!aux.isEmpty()) {
            prendaPila.push(aux.pop());
        }

        if (!encontrada) {
            System.out.println("La prenda no existe.");
        }
    }

}