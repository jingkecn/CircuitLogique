package simulateurs;

import circuits.Circuit;
import circuits.ET;
import circuits.OU;
import circuits.Porte;
import signaux.Event;
import signaux.Signal;

/**
 * Created by King on 2014-12-15.
 */
public class TestCircuit {

    public static void main(String[] args) {
        Circuit c = new Circuit();
        Signal s1 = new Signal(false),
                s2 = new Signal(false),
                s3 = new Signal(false),
                s4 = new Signal(false),
                s5 = new Signal(false);

        s1.addEvent(new Event(true, 3));
        s2.addEvent(new Event(true, 7));
        s4.addEvent(new Event(true, 4));

        c.addSignal(s1);
        c.addSignal(s2);
        c.addSignal(s3);
        c.addSignal(s4);
        c.addSignal(s5);

        Porte p1 = new ET(s1, s2, s3, 1);
        Porte p2 = new OU(s3, s4, s5, 2);

        c.addPortes(p1);
        c.addPortes(p2);

        int tMax = 100;
        c.simule(tMax);
    }

}
