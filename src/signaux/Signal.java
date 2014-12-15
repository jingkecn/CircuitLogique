package signaux;

/**
 * Created by King on 2014-12-15.
 */
public class Signal {

    private boolean valeur;
    private Driver driver;

    /**
     * Initialiser les attributs
     *
     * @param valeur la valeur defaut du signal
     */
    public Signal(boolean valeur) {
        this.valeur = valeur;
        driver = new Driver();
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
     * Ajouter un événement à le driver
     *
     * @param event l'événement à ajouter
     */
    public void addEvent(Event event) {
        driver.addEvent(event);
    }

    /**
     * Mettre à jour la valeur du signal quand un événement arrive
     */
    public void actualise() {
        if (driver.consulteTemps() != -1 && driver.consulteTemps() == Horloge.top()) {
            valeur = driver.retraitEvenement().getValeur();
        }
    }

}
