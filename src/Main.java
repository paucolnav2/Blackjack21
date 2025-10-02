import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cartas> lista = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("Dinero.txt"));
        String linea = br.readLine();
        br.close();

        if (!linea.matches("\\d*")) {
            System.out.println("Parece que el archivo de texto se encuentra corrupto debido a carácteres no numéricos. Edítelo introduciendo números o contacte con un administrador.");
            System.exit(1);
        }
        int dineroInicial = Integer.parseInt(linea);
        boolean repetir = true;

        lista.add(new Cartas(1, Palos.DIAMANTES, false));
        lista.add(new Cartas(2, Palos.DIAMANTES, false));
        lista.add(new Cartas(3, Palos.DIAMANTES, false));
        lista.add(new Cartas(4, Palos.DIAMANTES, false));
        lista.add(new Cartas(5, Palos.DIAMANTES, false));
        lista.add(new Cartas(6, Palos.DIAMANTES, false));
        lista.add(new Cartas(7, Palos.DIAMANTES, false));
        lista.add(new Cartas(8, Palos.DIAMANTES, false));
        lista.add(new Cartas(9, Palos.DIAMANTES, false));
        lista.add(new Cartas(10, Palos.DIAMANTES, false));
        lista.add(new Cartas(11, Palos.DIAMANTES, false));
        lista.add(new Cartas(12, Palos.DIAMANTES, false));
        lista.add(new Cartas(13, Palos.DIAMANTES, false));
        lista.add(new Cartas(1, Palos.CORAZONES, false));
        lista.add(new Cartas(2, Palos.CORAZONES, false));
        lista.add(new Cartas(3, Palos.CORAZONES, false));
        lista.add(new Cartas(4, Palos.CORAZONES, false));
        lista.add(new Cartas(5, Palos.CORAZONES, false));
        lista.add(new Cartas(6, Palos.CORAZONES, false));
        lista.add(new Cartas(7, Palos.CORAZONES, false));
        lista.add(new Cartas(8, Palos.CORAZONES, false));
        lista.add(new Cartas(9, Palos.CORAZONES, false));
        lista.add(new Cartas(10, Palos.CORAZONES, false));
        lista.add(new Cartas(11, Palos.CORAZONES, false));
        lista.add(new Cartas(12, Palos.CORAZONES, false));
        lista.add(new Cartas(13, Palos.CORAZONES, false));
        lista.add(new Cartas(1, Palos.PICAS, false));
        lista.add(new Cartas(2, Palos.PICAS, false));
        lista.add(new Cartas(3, Palos.PICAS, false));
        lista.add(new Cartas(4, Palos.PICAS, false));
        lista.add(new Cartas(5, Palos.PICAS, false));
        lista.add(new Cartas(6, Palos.PICAS, false));
        lista.add(new Cartas(7, Palos.PICAS, false));
        lista.add(new Cartas(8, Palos.PICAS, false));
        lista.add(new Cartas(9, Palos.PICAS, false));
        lista.add(new Cartas(10, Palos.PICAS, false));
        lista.add(new Cartas(11, Palos.PICAS, false));
        lista.add(new Cartas(12, Palos.PICAS, false));
        lista.add(new Cartas(13, Palos.PICAS, false));
        lista.add(new Cartas(1, Palos.TREBOLES, false));
        lista.add(new Cartas(2, Palos.TREBOLES, false));
        lista.add(new Cartas(3, Palos.TREBOLES, false));
        lista.add(new Cartas(4, Palos.TREBOLES, false));
        lista.add(new Cartas(5, Palos.TREBOLES, false));
        lista.add(new Cartas(6, Palos.TREBOLES, false));
        lista.add(new Cartas(7, Palos.TREBOLES, false));
        lista.add(new Cartas(8, Palos.TREBOLES, false));
        lista.add(new Cartas(9, Palos.TREBOLES, false));
        lista.add(new Cartas(10, Palos.TREBOLES, false));
        lista.add(new Cartas(11, Palos.TREBOLES, false));
        lista.add(new Cartas(12, Palos.TREBOLES, false));
        lista.add(new Cartas(13, Palos.TREBOLES, false));

        while (repetir) {
            ArrayList<Cartas> listaDealer = new ArrayList<>();
            ArrayList<Cartas> listaPlayer = new ArrayList<>();

            int puntosPlayer;
            Metodos.barajar(lista);

            if (dineroInicial == 0) {
                System.out.print("Puesto que su saldo es de \u001B[33m0 €\u001B[0m, se le han añadido \u001B[33m200 €\u001B[0m de consolación para que continúe. Pulse intro para continuar. ");
                sc.nextLine();
                dineroInicial = 200;
            }
            System.out.print("¿Cuál es la apuesta inicial? (Dispone de \u001B[33m" + dineroInicial + " €\u001B[0m) ");
            String respuesta = sc.nextLine();

            while (!respuesta.matches("\\d*") || Integer.parseInt(respuesta) > dineroInicial || Integer.parseInt(respuesta) < 5) {
                if (!respuesta.matches("\\d*")) {
                    System.out.print("Parece que ha introducido un carácter no numérico, vuelva a intentarlo: ");
                }
                else if (Integer.parseInt(respuesta) < 5) {
                    System.out.print("La apuesta mínima es 5 €. Introduzca una cantidad más grande: ");
                }
                else {
                    System.out.print("Ha introducido una cifra superior a su saldo (\u001B[33m" + dineroInicial + " €\u001B[0m). Vuelva a intentarlo: ");
                }
                respuesta = sc.nextLine();
            }
            int apuesta = Integer.parseInt(respuesta);
            dineroInicial = dineroInicial - apuesta;

            System.out.print("Mano dealer: ");
            Metodos.sacarCarta(lista, listaDealer);
            System.out.print("/?? (" + Metodos.sumarPuntos(listaDealer) + "+?)\n\nMano jugador: ");

            Metodos.sacarCarta(lista, listaPlayer);
            System.out.print("/");
            Metodos.sacarCarta(lista, listaPlayer);

            System.out.println(" (" + Metodos.sumarPuntos(listaPlayer) + ")\n");

            boolean hit = true;
            if (Metodos.sumarPuntos(listaPlayer) == 21) {
                hit = false;
                puntosPlayer = 21;
            }
            int contador = 0;
            while (hit) {
                String regex;
                System.out.print("Turno del jugador: 1-Hit  2-Stand");
                if (contador == 0) {
                    System.out.print("  3-Double");
                    regex = "[123]";
                } else {
                    regex = "[12]";
                }
                System.out.println("  (\u001B[33m" + dineroInicial + " €\u001B[0m)\n");
                respuesta = sc.nextLine();

                while (!respuesta.matches(regex)) {
                    System.out.print("Parece que ha introducido un valor incorrecto o erróneo, vuelva a intentarlo: ");
                    respuesta = sc.nextLine();
                }

                if (Integer.parseInt(respuesta) == 1) {
                    contador++;
                    System.out.print("Mano dealer: ");
                    Metodos.mostrar(listaDealer.get(0));
                    System.out.print("/?? (" + Metodos.sumarPuntos(listaDealer) + "+?)\n\nMano jugador: ");
                    for (Cartas carta : listaPlayer) {
                        Metodos.mostrar(carta);
                        System.out.print("/");
                    }
                    boolean tempBoolean = true;
                    Metodos.sacarCarta(lista, listaPlayer);
                    puntosPlayer = Metodos.sumarPuntos(listaPlayer);
                    System.out.println(" (" + puntosPlayer + ")\n");
                    if (puntosPlayer >= 21) {
                        hit = false;
                    }
                } else if (Integer.parseInt(respuesta) == 2) {
                    hit = false;
                } else if (dineroInicial >= apuesta) {
                    contador++;
                    hit = false;
                    dineroInicial = dineroInicial - apuesta;
                    apuesta = apuesta * 2;
                    Metodos.sacarCarta(lista, listaPlayer, false);
                } else {
                    System.out.print("No dispone de suficiente saldo para doblar. Pulse intro para continuar. ");
                    sc.nextLine();
                }
            }

            puntosPlayer = Metodos.sumarPuntos(listaPlayer);
            int puntosDealer = 0;
            Metodos.mostrar(listaDealer.get(0));
            System.out.print("/");
            while (puntosDealer < 17) {
                Metodos.sacarCarta(lista, listaDealer);
                puntosDealer = Metodos.sumarPuntos(listaDealer);
                if (puntosDealer < 17) {
                    System.out.print("/");
                }
            }
            System.out.println(" (" + Metodos.sumarPuntos(listaDealer) + ")\n");
            for (Cartas carta : listaPlayer) {
                Metodos.mostrar(carta);
                if (listaPlayer.indexOf(carta) != listaPlayer.size() - 1) {
                    System.out.print("/");
                }
            }
            System.out.println(" (" + Metodos.sumarPuntos(listaPlayer) + ")\n");
            if (puntosPlayer > 21) {
                System.out.print("El jugador pierde \u001B[33m" + apuesta + " €\u001B[0m. ¿Quiere jugar de nuevo?");
            } else if (puntosPlayer == 21 && listaPlayer.size() == 2) {
                dineroInicial = dineroInicial + (int) 2.5 * apuesta;
                System.out.print("¡BlackJack! El jugador gana \u001B[33m" + (int) (apuesta * 1.5) + " €\u001B[0m. ¿Quiere jugar de nuevo?");
            } else if (puntosDealer > 21) {
                dineroInicial = dineroInicial + 2 * apuesta;
                System.out.print("El jugador gana \u001B[33m" + apuesta + " €\u001B[0m. ¿Quiere jugar de nuevo?");
            } else if (puntosPlayer > puntosDealer) {
                dineroInicial = dineroInicial + 2 * apuesta;
                System.out.print("El jugador gana \u001B[33m" + apuesta + " €\u001B[0m. ¿Quiere jugar de nuevo?");
            } else if (puntosPlayer < puntosDealer) {
                System.out.print("El jugador pierde \u001B[33m" + apuesta + " €\u001B[0m. ¿Quiere jugar de nuevo?");
            } else {
                if (listaDealer.size() < listaPlayer.size()) {
                    System.out.print("Empate, pero el dealer tiene menos cartas que el jugador. El jugador pierde \u001B[33m" + apuesta + " €\u001B[0m. ¿Quiere jugar de nuevo?");
                } else if (listaDealer.size() > listaPlayer.size()) {
                    dineroInicial = dineroInicial + 2 * apuesta;
                    System.out.print("Empate, pero el jugador tiene menos cartas que el dealer. El jugador gana \u001B[33m" + apuesta + " €\u001B[0m. ¿Quiere jugar de nuevo?");
                } else {
                    dineroInicial = dineroInicial + apuesta;
                    System.out.print("Empate. ¿Quiere jugar de nuevo?");
                }
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter("Dinero.txt"));
            bw.write(dineroInicial + "");
            bw.flush();
            bw.close();
            System.out.print(" (1 -> Jugar de nuevo. 2 -> No jugar.) ");
            respuesta = sc.nextLine();

            while (!respuesta.matches("[12]")) {
                System.out.print("Parece que ha introducido un valor incorrecto, vuelva a intentarlo: ");
                respuesta = sc.nextLine();
            }

            if (respuesta.equals("2")) {
                repetir = false;
            }
        }
    }
}