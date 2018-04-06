package jeu;

import actions.Action;
import actions.Go;
import actions.Hack;
import actions.Help;
import actions.Inventory;
import actions.Look;
import actions.Quit;
import actions.Take;
import actions.Use;

/**
 * @author mcousteau & sgerbaud
 */
public enum Command {

    go(new Go()),
    hack(new Hack()),
    help(new Help()),
    inventory(new Inventory()),
    look(new Look()),
    quit(new Quit()),
    take(new Take()),
    use(new Use());

    /**
     * . Action
     */
    private Action action;

    /**
     * . Constructeur commande
     * @param a
     *            Action
     */
    Command(final Action a) {
        this.action = a;
    }

    /**
     * . Rècupère l'action
     * @return Action
     */
    public Action renvoiInstru() {
        return this.action;
    }
}
