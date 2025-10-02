import java.util.ArrayList;

public class Metodos {
    public static void mostrar(Cartas carta) {

        switch (carta.numero) {
            case 1:
                System.out.print("A");
                break;
            case 11:
                System.out.print("J");
                break;
            case 12:
                System.out.print("Q");
                break;
            case 13:
                System.out.print("K");
                break;
            default:
                System.out.print(carta.numero);
                break;
        }

        switch (carta.palo) {
            case PICAS:
                System.out.print("\033[0;34m♠\033[0m");
                break;
            case CORAZONES:
                System.out.print("\033[0;31m♥\033[0m");
                break;
            case TREBOLES:
                System.out.print("\033[0;32m♣\033[0m");
                break;
            case DIAMANTES:
                System.out.print("\033[0;33m♦\033[0m");
                break;
        }
    }

    public static int sumarPuntos(ArrayList<Cartas> lista) {
        int suma = 0;
        int ases = 0;
        for (Cartas cartas : lista) {
            int temp = Math.min(cartas.numero, 10);
            if (temp == 1) {
                ases++;
            } else {
                suma += temp;
            }
        }
        while (ases >= 1) {
            if (suma >= 11) {
                suma++;
                ases--;
            } else {
                suma += 11;
                ases--;
            }
        }
        return suma;

    }

    public static void barajar(ArrayList<Cartas> lista) {
        for (Cartas carta: lista) {
            carta.salido = false;
        }
    }

    public static void sacarCarta(ArrayList<Cartas> baraja, ArrayList<Cartas> mesa) {
        boolean tempBoolean = true;
        do {
            int temp = Math.toIntExact(Math.round(51 * Math.random()));
            if (!baraja.get(temp).salido) {
                mesa.add(baraja.get(temp));
                baraja.get(temp).salido = true;
                Metodos.mostrar(baraja.get(temp));
                tempBoolean = false;
            }
        } while (tempBoolean);
    }

    public static void sacarCarta(ArrayList<Cartas> baraja, ArrayList<Cartas> mesa, boolean mostrar) {
        boolean tempBoolean = true;
        do {
            int temp = Math.toIntExact(Math.round(51 * Math.random()));
            if (!baraja.get(temp).salido) {
                mesa.add(baraja.get(temp));
                baraja.get(temp).salido = true;
                if (mostrar) {
                    Metodos.mostrar(baraja.get(temp));
                }
                tempBoolean = false;
            }
        } while (tempBoolean);
    }
}
