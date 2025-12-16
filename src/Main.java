import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);










        // ******************* PARTE DE COCHE *********************************

        ArrayList<Cotxe> coches = new ArrayList<>();

        System.out.println("Quieres crear un coche?\nSI: 1\nNO: 2 ");
        int salir = sc.nextInt();
        sc.nextLine();

        if (salir == 2) {
            salir = 6;
        }

        while (salir != 6) {
            System.out.println("Dime la marca: ");
            String marcaCoche = sc.nextLine();

            System.out.println("Dime el modelo: ");
            String modeloCoche = sc.nextLine();

            System.out.println("Dime el año de fabricacion: ");
            int añoFabricacion = sc.nextInt();

            System.out.println("A que velocidad va actualmente? ");
            int velocidadActual = sc.nextInt();

            Cotxe coche = new Cotxe(marcaCoche, modeloCoche, añoFabricacion, velocidadActual);

            coches.add(coche);

            do {
                Cotxe.GetMenuCotxe();

                salir = sc.nextInt();
                sc.nextLine();

                switch (salir) {
                    case 1:
                        for (Cotxe c : coches) {
                            System.out.println(c.getInformacio());
                        }
                        break;
                    case 2:
                        System.out.println("Dime el identificador: ");
                        for (Cotxe c : coches) {
                            c.InfoCoches();
                        }

                        int indiceCoche = sc.nextInt();
                        sc.nextLine();

                        for (Cotxe c : coches) {
                            if (c.identificador == indiceCoche) {
                                System.out.println(c.getInformacio());
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Presiona enter...");
                        sc.nextLine();
                        break;

                    case 4:
                        System.out.println("Dime el identificador del coche?\n1-" + Cotxe.getComptadorCotxes());
                        int indiceAceleracion = sc.nextInt();

                        System.out.println("Cuanto quieres acelerar?\n→");
                        int aceleracion = sc.nextInt();

                        for (Cotxe c : coches) {
                            if (c.identificador == indiceAceleracion) {
                                c.accelerar(aceleracion);
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Dime el identificador del coche?\n1-" + Cotxe.getComptadorCotxes());
                        int indiceFrenado = sc.nextInt();

                        System.out.println("Cuanto quieres acelerar?\n→");
                        int freno = sc.nextInt();

                        for (Cotxe c : coches) {
                            if (c.identificador == indiceFrenado) {
                                c.frenar(freno);
                            }
                        }
                        break;
                }
            } while (salir != 3 && salir != 6);
        }
    }
}
