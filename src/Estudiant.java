public class Estudiant {
    private String nom;
    private int edat;
    private double[] qualificacions;
    private static final int MAX_NOTES = 10;

    public Estudiant(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
        qualificacions = new double[MAX_NOTES];
    }

}
