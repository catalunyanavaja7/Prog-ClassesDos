public class CompteBancari {
    private String titular;
    private double saldo;
    private static double interesActual = 1.5;

    public CompteBancari(String titular) {
        this.titular = titular;
        saldo = 0;
    }

    public static void setInteresActual(double nouInteres) {
        interesActual = nouInteres;
    }

    public static double getInteresActual() {
        return interesActual;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean retirar(double quantitat) {
        if (saldo >= quantitat) {
            saldo -= quantitat;
            return true;
        }else {
            System.out.println("No puedes retirar tanto");
            return false;
        }

    }

    public void ingressar(double quantitat) {
        saldo += quantitat;
    }


}
