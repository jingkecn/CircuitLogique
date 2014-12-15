package signaux;

/**
 * Created by King on 2014-12-15.
 */
public class Driver {

    private Event[] events;
    private int nbEvents;

    /**
     * Initialiser les attributs
     */
    public Driver() {
        events = new Event[100];
        nbEvents = 0;
    }

    /**
     * Mettre les événements en ordre du temps pour éviter la déraison
     */
    private void organise() {
        Event eventTemp;
        for (int i = 0; i < nbEvents; i++) {
            for (int j = i + 1; j < nbEvents; j++) {
                if (events[j].getTemps() < events[i].getTemps()) {
                    // events[j] <-> events[i]
                    eventTemp = events[i];
                    events[i] = events[j];
                    events[j] = eventTemp;
                }
            }
        }
    }

    /**
     * Ajouter un événement dans le driver
     *
     * @param event l'événement à ajouter
     */
    public void addEvent(Event event) {
        events[nbEvents++] = event;
        organise();
    }

    /**
     * Consultation de le temps du prochain événement
     *
     * @return le temps du prochain événement
     * ou -1 si le prochain événement est null
     */
    public int consulteTemps() {
        return (events[0] != null) ? events[0].getTemps() : -1;
    }

    /**
     * Récupérer et effacer le prochain événement (FIFO)
     *
     * @return le prochain événement
     */
    public Event retraitEvenement() {
        Event event = events[0];
        for (int i = 0; i < nbEvents; i++) {
            events[i] = events[i + 1];
        }
        nbEvents--;
        return event;
    }

}
