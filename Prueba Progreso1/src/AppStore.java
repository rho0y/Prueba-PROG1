/**Inicializacion clase*/
public class AppStore {
/**Creacion de atributos de la clase*/
    private double porcentajeMi = 0.25; // 25% del menos vendido
    private int limiteDepo = 10;
    private int limiteAc = 15;
    private String nombre;
    private String catergoria;
    private String tamanoKB;


/**Inicializacion de clase juego*/
    public class Juego {
        private String nombre;
        private String categoria;
        private int tamanoKB;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getTamanoKB() {
        return tamanoKB;
    }

    public void setTamanoKB(int tamanoKB) {
        this.tamanoKB = tamanoKB;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getLicenciasDisponibles() {
        return licenciasDisponibles;
    }

    public void setLicenciasDisponibles(int licenciasDisponibles) {
        this.licenciasDisponibles = licenciasDisponibles;
    }

    public int getLicenciasVendidas() {
        return licenciasVendidas;
    }

    public void setLicenciasVendidas(int licenciasVendidas) {
        this.licenciasVendidas = licenciasVendidas;
    }public Juego() {
    }

    private double precio;
        private int licenciasDisponibles;
        private int licenciasVendidas;

        Juego(String nombre, String categoria, int tamanoKB, double precio, int licenciasDisponibles, int licenciasVendidas) {
            this.nombre = nombre;
            this.categoria = categoria;
            this.tamanoKB = tamanoKB;
            this.precio = precio;
            this.licenciasDisponibles = licenciasDisponibles;
            this.licenciasVendidas = licenciasVendidas;
        }

        void mostrar() {
            System.out.println("--------------------------------------");
            System.out.println("Nombre: " + nombre);
            System.out.println("Categoría: " + categoria);
            System.out.println("Tamaño" + tamanoKB + " KB");
            System.out.println("Precio: $" + precio);
            System.out.println("Licencias disponibles: " + licenciasDisponibles);
            System.out.println("Licencias vendidas: " + licenciasVendidas);
        }
    }
public Juego [] juegos;
    public AppStore() {
        juegos = new Juego[4];
        juegos[0] = new Juego("candy", "rompecabezas", 50, 25, 40, 10);
        juegos[1] = new Juego("fifa", "deporte", 80, 40, 15, 20);
        juegos[2] = new Juego("conter", "accion", 950, 50.50, 12, 25);
        juegos[3] = new Juego("soccer", "deporte", 6, 30.99, 8, 15);
    }

    public void mostrarJuegos() {
        System.out.println("\n===== LISTA DE JUEGOS =====");
        for (Juego j : juegos) {
            j.mostrar();
        }
    }

    public void comprarLicencias(String nombre, int cantidad) {
        for (Juego j : juegos) {
            if (j.nombre.isEmpty()) {
                j.licenciasDisponibles += cantidad;
                System.out.println("Se compraron " + cantidad + " licencias de " + j.nombre);
                return;
            }
        }
        System.out.println("No se encontro");
    }

    public void venderLicencias(String nombre, int cantidad) {
        for (Juego j : juegos) {
                if (j.licenciasDisponibles >= cantidad) {
                    j.licenciasDisponibles -= cantidad;
                    j.licenciasVendidas += cantidad;
                    System.out.println("Se vendieron " + cantidad + " licencias de " + j.nombre);
                } else {
                    System.out.println("No hay licencias");
                }
                return;
        }
        System.out.println(" No se encor el juego.");
    }

    public String darJuegoMasVendido() {
        Juego masVendido = juegos[0];
        for (int i = 1; i < juegos.length; i++) {
            if (juegos[i].licenciasVendidas > masVendido.licenciasVendidas) {
                masVendido = juegos[i];
            }
        }
        return masVendido.nombre;
    }
    public String darJuegoMenosVendido() {
        int menor = juegos[0].licenciasVendidas;
        String nombre = juegos[0].nombre;
        boolean iguales = true;

        for (int i = 1; i < juegos.length; i++) {
            if (juegos[i].licenciasVendidas < menor) {
                menor = juegos[i].licenciasVendidas;
                nombre = juegos[i].nombre;
            }
            if (juegos[i].licenciasVendidas != juegos[0].licenciasVendidas) {
                iguales = false;
            }
        }
        return nombre;
    }
    public void metodo1(){

    }
    public void metodo2() {
        String resultado = "";
        System.out.println("\nJuegos que deben comprarse");
        System.out.println(resultado);
    }
    public void calcularDescuentos() {
        int totalRompecabezas = 0, totalDeporte = 0, totalAccion = 0;
        double valorTotal = 0;
        double descuento = 0;
        if (totalRompecabezas >= 25) {
            descuento = 0.20;
        } else if (totalDeporte >= 20 && totalAccion >= 15) {
            descuento = 0.15;
        }
        if (descuento > 0) {
            double valorDescontado = valorTotal * (1 - descuento);
            System.out.println("Descuento aplicado: " + (descuento * 100));
            System.out.println("Total:" + valorDescontado);
        } else {
            System.out.println("No aplica.");
        }
    }
}