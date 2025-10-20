/**Se quiere construir una aplicación para manejar un AppStore de juegos. Esta aplicación
 debe permitir manejar 4 juegos y contar con la posibilidad de compra y venta de
 licencias de los mismos.
 Cada juego se caracteriza por tener:
 • Nombre, que es único.
 • Categoría a la que pertenece. Puede ser: rompecabezas, acción o deporte.
 • Tamaño: memoria que ocupa en kilobytes (KB).
 • Precio de la unidad en pesos.
 • Cantidad de licencias disponibles.
 • Cantidad de licencias vendidas.
 Adicionalmente, el programa debe permitir calcular posibles descuentos para clientes
 que desean comprar licencias de juego en un volumen alto. En este caso, debido a las
 políticas de ventas y mercadeo, las promociones vigentes son las siguientes:
 1. Si el comprador solicita al menos 25 licencias de juegos de rompecabezas
 sin importar la cantidad de juegos que solicite de otras categorías, se dará el
 20% de descuento sobre el valor total del pedido.
 2. Si el comprador solicita al menos 20 licencias de juegos de deportes y 15
 licencias de juegos de acción, se dará el 15% de descuento sobre el valor
 total del pedido
 Si en una compra se cumplen ambas condiciones, sólo se aplica la primera promoción
 que aplique.
 El programa debe permitir:
 1. Visualizar la información detallada de cada juego.
 2. Comprar licencias de un juego.
 3. Vender licencias de un juego.
 4. Consultar el juego más vendido.
 5. Consultar los descuentos aplicados por un volumen de compra.
 6. Salir*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**Inicializacion de objetos*/
        Scanner sc = new Scanner(System.in);
        AppStore tienda = new AppStore();
        AppStore candy= new AppStore();
        AppStore soccer= new AppStore();
        AppStore conter= new AppStore();
        AppStore fifa= new AppStore();
        int opcion;

        do {
            System.out.println("------- MENU APP STORE -------");
            System.out.println("1. Ver informacion de los juegos");
            System.out.println("2. Comprar licencias de un juego");
            System.out.println("3. Vender licencias de un juego");
            System.out.println("4. Consultar el juego mas vendido");
            System.out.println("5. Consultar descuentos");
            System.out.println("6. Metodo 1");
            System.out.println("7. Metodo 2");
            System.out.println("8. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    tienda.mostrarJuegos();
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del juego a comprar: ");
                    String nombreCompra = sc.nextLine();
                    System.out.print("Ingrese la cantidad de licencias a comprar: ");
                    int cantidadCompra = sc.nextInt();
                    tienda.comprarLicencias(nombreCompra, cantidadCompra);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del juego a vender: ");
                    String nombreVenta = sc.nextLine();
                    System.out.print("Ingrese la cantidad de licencias a vender: ");
                    int cantidadVenta = sc.nextInt();
                    tienda.venderLicencias(nombreVenta, cantidadVenta);
                    break;
                case 4:
                    System.out.println("Juego más vendido: " + tienda.darJuegoMasVendido());
                    break;
                case 5:
                    tienda.calcularDescuentos();
                    break;
                case 6:
                    tienda.metodo1();
                    break;
                case 7:
                    tienda.metodo2();
                    break;
                case 8:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (opcion != 8);
    }
}