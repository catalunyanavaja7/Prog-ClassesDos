public class Cotxe {
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
    }

    public String getInformacio() {
        return "Especificaciones:\nMarca: " + marca + "\nModelo: " + model + "\nAño de fabricaion: " + anyFabricacio + "\nVelocidad actual: " + velocitatActual + "kmh";
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
        }else {
            System.out.println("Que quieres ir marcha atras o algo? ");
        }
    }

}
