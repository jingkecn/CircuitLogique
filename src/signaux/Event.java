package signaux;

/**
 * Created by King on 2014-12-15.
 */
public class Event {

    private boolean valeur;
    private int temps;

    /**
     * Initialiser les attributs
     *
     * @param valeur la valuer pour mettre à jour le signal
     * @param temps  le moment où le signal est mis à jour
     */
    public Event(boolean valeur, int temps) {
        this.valeur = valeur;
        this.temps = temps;
    }

    /**
     * Le getter de la valeur
     *
     * @return la valeur
     */
    public boolean getValeur() {
        return valeur;
    }

    /**
     * Le getter du temps
     *
     * @return le temps
     */
    public int getTemps() {
        return temps;
    }
}
