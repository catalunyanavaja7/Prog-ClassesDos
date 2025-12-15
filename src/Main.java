import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Cotxe> coches = new ArrayList<>();



        System.out.println("Quieres crear un coche?\nSI: 1\nNO: 2 ");
        int salir = sc.nextInt();
        sc.nextLine();

        if (salir == 2) {
            salir = 5;
        }

        while (salir != 5) {
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

                GetMenuCotxe();

                salir = sc.nextInt();
                sc.nextLine();

                switch (salir) {
                    case 1:
                        for (Cotxe c : coches) {
                            System.out.println(Cotxe.getComptadorCotxes());
                            System.out.println(c.getInformacio());
                        }
                        break;
                    case 2:
                        System.out.println("Presiona enter...");
                        sc.nextLine();
                        break;

                    case 3:
                        System.out.println("Dime el identificador del coche?\n1-" + Cotxe.getComptadorCotxes());
                        int indice = sc.nextInt();

                        System.out.println("Cuanto quieres acelerar?\n→");
                        int aceleracion = sc.nextInt();

                        for (Cotxe c : coches) {
                            if (c.identificador == indice) {
                                c.accelerar(aceleracion);
                            }
                        }


                        break;
                }
            } while (salir != 2 && salir != 5);

        }
    }
    public static void GetMenuCotxe() {
        System.out.println("""
                    \n1. Enseñar especificaciones de los coches coche.
                    2. Crear otro coche.
                    3. Acelerar coche
                    4. Frenar coche
                    5. Salir.
                    """);
    }


}