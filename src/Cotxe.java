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

    public static int getComptadorCotxes() {
        return comptadorCotxes;
    }

    public String getInformacio() {
        return "************ ESPECIFICACIONES " + marca.toUpperCase() + " " + model.toUpperCase() + " ************" + "\nIdentificador: " + identificador + "\nMarca: " + marca + "\nModelo: " + model + "\nAño de fabricacion: " + anyFabricacio + "\nVelocidad actual: " + velocitatActual + "kmh\n";
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

}
