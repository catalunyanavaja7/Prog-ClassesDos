public class Cotxe {
    public int identificador = 0;
    private String marca;
    private String model;
    private int anyFabricacio;
    private double velocitatActual;
    private static int comptadorCotxes;

    public Cotxe(String marca, String model, int anyFabricacio, double velocitatActual) {

        this.marca = marca;
        this.model = model;
        this.anyFabricacio = anyFabricacio;
        this.velocitatActual = velocitatActual;
        ++comptadorCotxes;
        this.identificador = comptadorCotxes;
    }

    public void InfoCoches() {
        System.out.println(identificador + " " + marca + " " + model);
    }

    public static int getComptadorCotxes() {
        return comptadorCotxes;
    }

    public String getInformacio() {
        return "************ ESPECIFICACIONES " + marca.toUpperCase() + " " + model.toUpperCase() + " ************" + "\n" +
                "Identificador: " + identificador + "\n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + model + "\n" +
                "Año de fabricacion: " + anyFabricacio + "\n" +
                "Velocidad actual: " + velocitatActual + "kmh\n";
    }

    public void accelerar(double kmh) {
        velocitatActual += kmh;
        System.out.println("Acelerando a: " + velocitatActual + "kmh");
    }

    public void frenar(double kmh) {
        double velocidadRestada = velocitatActual - kmh;

        if (velocidadRestada > 0) {
            System.out.println("Frenando a: " + velocidadRestada + "kmh");
            velocitatActual = velocidadRestada;
        } else {
            System.out.println("Que quieres ir marcha atras o algo? ");
        }
    }

    public static void GetMenuCotxe() {
        System.out.println("""
                    \n1. Enseñar especificaciones de los coches.
                    2. Enseñar coche en especifico
                    3. Crear otro coche.
                    4. Acelerar coche
                    5. Frenar coche
                    6. Salir.
                    """);
    }

}
