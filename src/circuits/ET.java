package circuits;

import signaux.Event;
import signaux.Horloge;
import signaux.Signal;

/**
 * Created by King on 2014-12-15.
 */
public class ET extends PorteAvecDeuxEntrees {

    /**
     * Initialiser les attributs
     *
     * @param entree1 la 1ère entrée
     * @param entree2 la 2ème entrée
     * @param sortie  la sortie
     * @param retard  le retard
     */
    public ET(Signal entree1, Signal entree2, Signal sortie, int retard) {
        super(entree1, entree2, sortie, retard);
    }

    /**
     * Calculer la sortie de la porte ET
     */
    @Override
    public void calculSortie() {
        if (sortie.getValeur() != entree1.getValeur() && entree2.getValeur()) {
            sortie.addEvent(
                    new Event(
                            entree1.getValeur() && entree2.getValeur(),
                            Horloge.top() + retard
                    )
            );
        }
    }

}
