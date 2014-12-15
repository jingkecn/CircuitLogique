package signaux;

/**
 * Created by King on 2014-12-15.
 */
public class Horloge {

    private static int temps;

    /**
     * Reset l'horloge
     */
    public static void reset() {
        temps = 0;
    }

    /**
     * Consulter le moment courant de la simulation
     *
     * @return le moment courant
     */
    public static int top() {
        return temps;
    }

    /**
     * Decalage du temps
     */
    public static void increment() {
        temps++;
    }

}
