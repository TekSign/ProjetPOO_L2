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

    /**
     * .
     * Commande GO
     */
    go(new Go()),
    /**
     * .
     * Commande HACK
     */
    hack(new Hack()),
    /**
     * .
     * Commande HELP
     */
    help(new Help()),
    /**
     * . Commande INVENTORY
     */
    inventory(new Inventory()),
    /**
     * . Commande LOOK
     */
    look(new Look()),
    /**
     * . Commande QUIT
     */
    quit(new Quit()),
    /**
     * . Commande TAKE
     */
    take(new Take()),
    /**
     * . Commande USE
     */
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
