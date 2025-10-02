public class Cartas {
    public Palos palo;
    public boolean salido = false;
    public int numero;

    public Cartas(int numero, Palos palo, boolean salido) {
        this.salido = salido;
        this.numero = numero;
        this.palo = palo;
    }
}