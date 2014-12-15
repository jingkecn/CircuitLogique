package simulateurs;

import signaux.Event;
import signaux.Horloge;
import signaux.Signal;

/**
 * Created by King on 2014-12-15.
 */
public class TestSignal {

    public static void main(String[] args) {
        Signal s = new Signal(false);
        s.addEvent(new Event(true, 3));
        s.addEvent(new Event(false, 5));
        s.addEvent(new Event(true, 9));

        Horloge.reset();
        int n = 100;
        for (int i = 0; i < n; i++) {
            s.actualise();
            System.out.println(
                    "au temps " + Horloge.top()
                            + ", la valeur du signal est " + s.getValeur()
            );
            Horloge.increment();
        }
    }

}
