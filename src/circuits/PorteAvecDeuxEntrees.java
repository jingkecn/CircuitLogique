package circuits;

import signaux.Signal;

/**
 * Created by King on 2014-12-15.
 */
public abstract class PorteAvecDeuxEntrees extends Porte {

    protected Signal entree1;
    protected Signal entree2;

    /**
     * Initialiser les attributs
     * @param entree1   la 1ère entrée
     * @param entree2   la 2ème entrée
     * @param sortie    la sortie
     * @param retard    le retard
     */
    public PorteAvecDeuxEntrees(Signal entree1, Signal entree2, Signal sortie, int retard) {
        super(sortie, retard);
        this.entree1 = entree1;
        this.entree2 = entree2;
    }

}
