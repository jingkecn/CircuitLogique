package circuits;

import signaux.Signal;

/**
 * Created by King on 2014-12-15.
 */
public abstract class Porte {

    protected Signal sortie;
    protected int retard;

    /**
     * Initialiser les attributs
     *
     * @param sortie la sortie de cette porte
     * @param retard le retard de cette porte
     */
    public Porte(Signal sortie, int retard) {
        this.sortie = sortie;
        this.retard = retard;
    }

    /**
     * Calculer la sortie (implémentée selon les portes distincts)
     */
    public abstract void calculSortie();

}
