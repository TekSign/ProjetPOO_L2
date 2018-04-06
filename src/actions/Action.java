package actions;

import hero.Hero;

/**
 * @author mcousteau & sgerbaud
 */

public abstract class Action {
    /**
     * . Nombre arguments
     */
    protected final int nbArg;

    /**
     * . Constructeur d'une action
     * @param nb
     *            Nombre d'arguments
     */
    public Action(final int nb) {
        this.nbArg = nb;
    }

    /**
     * . Fonction abstraite redéfini dans chaque action décrivant chaque effet
     * @param myHero
     *            Héro
     * @param myStr
     *            Arguments entrés par le joueur
     * @return Affichage standard du résultat de la commande
     */
    public abstract String actionHero(Hero myHero, String[] myStr);
}
