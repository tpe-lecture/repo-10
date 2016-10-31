package tpe.oo.abstrakt;

/**
 * Flächenberechnung.
 */
public final class Geometer {

    /** Keine Instanzen. */
    private Geometer() {
        // keine Objekte
    }

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilenargumente
     */
    public static void main(String[] args) {

        Figur[] figure = new Figur[10];


        figure[0] = new Kreis(10.0);
        figure[1] = new Kreis(5.5);
        figure[2] = new Kreis(3.3);
        figure[3] = new Kreis(7.2);
        figure[4] = new Kreis(8.0);

        figure[5] = new Dreieck(4.0, 3.0);
        figure[6] = new Dreieck(2.0, 1.0);
        figure[7] = new Dreieck(5.0, 8.0);
        figure[8] = new Dreieck(2.0, 7.2);
        figure[9] = new Dreieck(14.0, 3.8);

        double gesamtflaeche = 0.0;

        for (Figur figur : figure) {
            gesamtflaeche += figur.flaeche();
        }

//        for (Dreieck dreieck : dreiecke) {
//            gesamtflaeche += dreieck.flaeche();
//        }

        System.out.printf("Die Fläche beträgt: %.2f", gesamtflaeche);
    }
}
