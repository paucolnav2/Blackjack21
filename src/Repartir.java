public class Repartir {
    boolean[][] cartasRepartidas = new boolean[4][13];

    public void reiniciarCartasRepartidas(boolean[][] cartasRepartidas) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 12; j++) {
                cartasRepartidas[i][j] = true;
            }
        }
    }
}