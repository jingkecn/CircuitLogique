package circuits;

import signaux.Horloge;
import signaux.Signal;

/**
 * Created by King on 2014-12-15.
 */
public class Circuit {

    private Signal[] signaux;
    private Porte[] portes;
    private int nbSignaux;
    private int nbPortes;

    /**
     * Initialiser les attributs
     */
    public Circuit() {
        signaux = new Signal[100];
        portes = new Porte[100];
        nbSignaux = 0;
        nbPortes = 0;
    }

    /**
     * Ajouter un signal au circuit
     *
     * @param signal le signal à ajouter
     */
    public void addSignal(Signal signal) {
        signaux[nbSignaux++] = signal;
    }

    /**
     * Ajouter une porte au circuit
     *
     * @param porte la porte à ajouter
     */
    public void addPortes(Porte porte) {
        portes[nbPortes++] = porte;
    }

    /**
     * Actualiser tout les signaux
     */
    public void actualiseSignaux() {
        for (int i = 0; i < nbSignaux; i++) {
            signaux[i].actualise();
        }
    }

    /**
     * Activer tout les portes
     */
    public void activation() {
        for (int i = 0; i < nbPortes; i++) {
            portes[i].calculSortie();
        }
    }

    /**
     * Simulation du circuit
     *
     * @param tMax le maximum valeur du temps pur simulation
     */
    public void simule(int tMax) {
        Horloge.reset();
        for (int i = 0; i < tMax; i++) {
            actualiseSignaux();
            activation();
            System.out.print(Horloge.top());
            for (int j = 0; j < nbSignaux; j++) {
                System.out.print("\t" + signaux[j].getValeur());
            }
            System.out.println();
            Horloge.increment();
        }
    }

}
